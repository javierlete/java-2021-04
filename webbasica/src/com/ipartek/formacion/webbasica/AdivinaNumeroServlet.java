package com.ipartek.formacion.webbasica;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adivinanumero")
public class AdivinaNumeroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strNumero = request.getParameter("numero");
		
		if(strNumero == null) {
			response.sendRedirect("adivinanumero.jsp");
			return;
		}
		
		Cookie[] cookies = request.getCookies();
		
		String cookieAdivinar = null;
		
		if(cookies != null) {
			for(Cookie cookie: cookies) {
				if(cookie.getName().equals("adivinar")) {
					cookieAdivinar = cookie.getValue();
					break;
				}
			}
		}
		
		int aleatorio = 0; 
		
		if(cookieAdivinar == null) {
			aleatorio = new Random().nextInt(100) + 1;
			Cookie cookie = new Cookie("adivinar", String.valueOf(aleatorio));
			cookie.setMaxAge(60*60*24*7);
			response.addCookie(cookie);
		} else {
			aleatorio = Integer.parseInt(cookieAdivinar);
		}
		
		String strRespuesta;
		
		int numero = Integer.parseInt(strNumero);
		
		if(numero == aleatorio) {
			strRespuesta = "Has acertado";
			
			Cookie cookie = new Cookie("adivinar", "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		} else if(aleatorio > numero) {
			strRespuesta = "El número es MAYOR";
		} else {
			strRespuesta = "El número es menor";
		}
		
		request.setAttribute("respuesta", strRespuesta);
		request.getRequestDispatcher("/adivinanumero.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
