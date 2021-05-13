package com.ipartek.formacion.webbasica;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strTema = request.getParameter("tema");
		String temaActual = null;

		if (strTema != null) {
			temaActual = strTema;
			Cookie cookieTema = new Cookie("temacookie", strTema);
			cookieTema.setMaxAge(60 * 60 * 24);
			response.addCookie(cookieTema);
		} else {
			String valorCookie = null;

			Cookie[] cookies = request.getCookies();

			if (cookies != null) {

				for (Cookie c : cookies) {
					if ("temacookie".equals(c.getName())) {
						valorCookie = c.getValue();
						break;
					}
				}
			}

			if (valorCookie != null) {
				temaActual = valorCookie;
			} else {
				temaActual = "colores";
			}
		}

		request.setAttribute("temaguardado", temaActual);
		request.getRequestDispatcher("/cookies.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
