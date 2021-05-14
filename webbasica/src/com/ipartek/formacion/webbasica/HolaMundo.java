package com.ipartek.formacion.webbasica;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/webbasica/hola?nombre=Javier

// NAVEGADOR
// http -> Protocolo HTTP
// localhost -> Nuestro propio equipo (IP) -> 127.0.0.1 (donde se encuentra el servidor)
// 8080 -> Puerto por el que nos comunicamos (donde se encuentra el servidor)

// GET /webbasica/hola?nombre=Javier&apellidos=Lete

// SERVIDOR
// /webbasica -> Aplicaciï¿½n (dentro de webapps) (nombre proyecto) Web Project Settings
// /hola -> @WebServlet a ejecutar 
// nombre=Javier -> request.getParameter("nombre")
// apellidos=Lete -> request.getParameter("apellidos")
// GET -> doGet

@WebServlet("/hola")
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("UTF-8");
		// response.setCharacterEncoding("UTF-8");
		String nombre = request.getParameter("nombre");
		
		if(nombre == null) {
			nombre = "anónimo";
		}
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><meta charset='UTF-8'><body><h1>Hola ");
		out.println(nombre);
		out.println("</h1><form><input name='nombre'><button>Aceptar</button></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
