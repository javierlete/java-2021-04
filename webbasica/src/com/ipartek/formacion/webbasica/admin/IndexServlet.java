package com.ipartek.formacion.webbasica.admin;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.TreeMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.webbasica.modelo.Producto;

@WebServlet("/admin/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = getServletContext();

		TreeMap<Integer, Producto> productos;

		productos = (TreeMap<Integer, Producto>) application.getAttribute("baseDeDatos");

		if (productos == null) {
			productos = new TreeMap<>();

			productos.put(1, new Producto(1, "Portátil", new BigDecimal("1234.12")));
			productos.put(2, new Producto(2, "Sobremesa", new BigDecimal("534.12")));
			productos.put(3, new Producto(3, "Ultraligero", new BigDecimal("3234.12")));
			
			application.setAttribute("baseDeDatos", productos);
		}
		
		request.setAttribute("productos", productos.values());
		request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
