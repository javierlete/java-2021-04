package com.ipartek.formacion.webbasica;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/info/*") // "/*" necesario para pathinfo
public class Informacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recibimos información de petición
		String strIp = request.getRemoteAddr();
		String strRuta = request.getPathInfo();
		
		String strNavegador = request.getHeader("user-agent");
		String strAnterior = request.getHeader("referer");
		String strIdioma = request.getHeader("accept-language");
		
		// Preparamos información para la pantalla
		request.setAttribute("ip", strIp);
		request.setAttribute("ruta", strRuta);
		request.setAttribute("navegador", strNavegador);
		request.setAttribute("anterior", strAnterior);
		request.setAttribute("idioma", strIdioma);
		
		// Llamamos a la siguiente pantalla
		request.getRequestDispatcher("/informacion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
