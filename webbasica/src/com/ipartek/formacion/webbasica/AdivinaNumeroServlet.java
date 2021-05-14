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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strNumero = request.getParameter("numero");

		if (strNumero == null) {
			response.sendRedirect("adivinanumero.jsp");
			return;
		}

		String cookieAdivinar = buscarAleatorio(request);

		int aleatorio = 0;

		if (cookieAdivinar == null) {
			aleatorio = crearAleatorio(response);
		} else {
			aleatorio = Integer.parseInt(cookieAdivinar);
		}

		String strRespuesta;

		int numero;
		
		try {
			numero = Integer.parseInt(strNumero);

			if (numero == aleatorio) {
				strRespuesta = "Has acertado";

				resetearAleatorio(response);
			} else if (aleatorio > numero) {
				strRespuesta = "El número es MAYOR";
			} else {
				strRespuesta = "El número es menor";
			}
		} catch (NumberFormatException e) {
			strRespuesta = "Intenta con un número la próxima vez";
		}
		
		request.setAttribute("respuesta", strRespuesta);
		request.getRequestDispatcher("/adivinanumero.jsp").forward(request, response);
	}

	private String buscarAleatorio(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();

		if (cookies == null) {
			return null;
		}

		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("adivinar")) {
				return cookie.getValue();
			}
		}

		return null;
	}

	private int crearAleatorio(HttpServletResponse response) {
		int aleatorio = new Random().nextInt(100) + 1;

		Cookie cookie = new Cookie("adivinar", String.valueOf(aleatorio));
		cookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(cookie);

		return aleatorio;
	}

	private void resetearAleatorio(HttpServletResponse response) {
		Cookie cookie = new Cookie("adivinar", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
