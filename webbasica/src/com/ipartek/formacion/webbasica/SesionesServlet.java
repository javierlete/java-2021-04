package com.ipartek.formacion.webbasica;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sesiones")
public class SesionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Almacenamos en request (sólo se conserva con el request dispatcher (forward)
		request.setAttribute("peticion", "Dato de petición");
		
		// Almacenamos en sesión (se conserva hasta 30 minutos de inactividad)
		HttpSession session = request.getSession();
		session.setAttribute("sesion", "Dato de sesión");
		
		// Invalida todos los atributos de sesión asociada al navegador
//		session.invalidate();
		
		// No cambia la URL del navegador y conserva tanto request como session
//		request.getRequestDispatcher("sesiones.jsp").forward(request, response);

		// Cambia la URL del navegador y se conserva la session pero no la request 
		response.sendRedirect("sesiones.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
