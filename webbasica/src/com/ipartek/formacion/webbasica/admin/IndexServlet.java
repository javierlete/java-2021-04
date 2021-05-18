package com.ipartek.formacion.webbasica.admin;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.webbasica.modelo.Producto;

@WebServlet("/admin/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Producto> productos = new ArrayList<>();
		
		productos.add(new Producto(1, "Portátil", new BigDecimal("1234.12")));
		productos.add(new Producto(2, "Sobremesa", new BigDecimal("534.12")));
		productos.add(new Producto(3, "Ultraligero", new BigDecimal("3234.12")));
		
		request.setAttribute("productos", productos);
		request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
