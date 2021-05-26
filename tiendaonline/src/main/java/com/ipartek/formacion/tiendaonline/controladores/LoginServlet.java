package com.ipartek.formacion.tiendaonline.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.tiendaonline.controladores.config.Config;
import com.ipartek.formacion.tiendaonline.modelos.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recogemos los datos rellenados en el formulario
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// Obtenemos el usuario seg�n su email a trav�s del DAO de Usuario
		// inicializado previamente en InicioServidorListener y guardado en Config
		Usuario usuario = Config.daoUsuario.selectOneByField("email", email);
		
		// Verificamos si el usuario existe y tiene una password que concuerda
		if(usuario != null && usuario.getPassword().equals(password)) {
			// Si es correcto
			// Creamos una variable de sesi�n que guarda el usuario para toda la sesi�n
			request.getSession().setAttribute("usuario", usuario);
			// Pedimos al navegador que nos lleve a la p�gina principal.jsp a partir del ra�z de
			// la aplicaci�n (request.getContextPath())
			response.sendRedirect(request.getContextPath() + "/principal");
		} else {
			// Si no es correcto
			// Guardamos un atributo de request con el error
			request.setAttribute("error", "El usuario o la contrase�a no son correctos");
			// Reenviamos la petici�n a la pantalla de login.jsp
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
