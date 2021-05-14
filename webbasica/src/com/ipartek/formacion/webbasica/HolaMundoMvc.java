package com.ipartek.formacion.webbasica;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/holamvc")
public class HolaMundoMvc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/holamundomvc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recoger información de formularios
		String parNombre = request.getParameter("nombre");
		
		// Procesar la información
		String strSaludo = "Hola " + parNombre;
		
		
		// Preparar información para siguiente pantalla
		request.setAttribute("saludo", strSaludo);
		
		// Pasar a la siguiente pantalla
		request.getRequestDispatcher("/holamundomvc.jsp").forward(request, response);
	}

}
