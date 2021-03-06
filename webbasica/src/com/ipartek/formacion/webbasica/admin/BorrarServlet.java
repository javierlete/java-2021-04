package com.ipartek.formacion.webbasica.admin;

import java.io.IOException;
import java.util.TreeMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.webbasica.modelo.Producto;

@WebServlet("/admin/borrar")
public class BorrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = getServletContext();
		
		String id = request.getParameter("id");
		
		@SuppressWarnings("unchecked")
		TreeMap<Integer, Producto> productos = (TreeMap<Integer, Producto>)application.getAttribute("baseDeDatos");
		
		productos.remove(Integer.parseInt(id));
		
		request.getRequestDispatcher("/admin/index").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
