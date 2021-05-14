package com.ipartek.formacion.webbasica;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] arr = { "Primero", "Segundo", "Tercero" };
		
		ArrayList<String> textos = new ArrayList<>();
		textos.add("Primero");
		textos.add("Segundo");
		textos.add("Tercero");
		
		request.setAttribute("arr", arr);
		request.setAttribute("textos", textos);
		
		request.getRequestDispatcher("/jstl.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
