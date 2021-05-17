package com.ipartek.formacion.webbasica;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sesiones")
public class SesionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Almacenamos en request (s�lo se conserva con el request dispatcher
		request.setAttribute("peticion", "Dato de petici�n");
		
		// Almacenamos en sesi�n (se conserva hasta 30 minutos de inactividad)
		request.getSession().setAttribute("sesion", "Dato de sesi�n");
		
		// Invalida todos los objetos de sesi�n asociada al navegador
//		request.getSession().invalidate();
		
		// No cambia la URL del navegador y conserva tanto request como sesi�n
//		request.getRequestDispatcher("sesiones.jsp").forward(request, response);

		// Cambia la URL del navegador y se conserva la sesi�n pero no la request 
		response.sendRedirect("sesiones.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
