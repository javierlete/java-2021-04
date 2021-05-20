package com.ipartek.formacion.tiendaonline.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eskura21.libraries.beginnersjdbc.Dao;
import com.ipartek.formacion.tiendaonline.modelos.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		String pathSqlite = getServletContext().getRealPath("/WEB-INF/tiendaonline.sqlite3");
		
		Dao<Usuario> dao = new Dao<>(Usuario.class, pathSqlite);
		Usuario usuario = dao.selectOneByField("email", email);
		
		if(usuario != null && usuario.getPassword().equals(password)) {
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect(request.getContextPath() + "/principal.jsp");
		} else {
			request.setAttribute("error", "El usuario o la contraseña no son correctos");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
