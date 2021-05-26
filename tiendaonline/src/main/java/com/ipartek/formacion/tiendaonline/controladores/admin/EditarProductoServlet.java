package com.ipartek.formacion.tiendaonline.controladores.admin;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.tiendaonline.controladores.config.Config;
import com.ipartek.formacion.tiendaonline.modelos.Producto;

@WebServlet("/admin/productos/editar")
public class EditarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");

		if (id != null) {
			Producto producto = Config.daoProducto.selectById(Integer.parseInt(id));

			request.setAttribute("producto", producto);
		}

		request.getRequestDispatcher("/admin/productos/editar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String precio = request.getParameter("precio");

		Integer intId = id.length() == 0 ? null : Integer.parseInt(id);
		Producto producto = new Producto(intId, nombre, new BigDecimal(precio));

		if (intId != null) {
			// Editar
			Config.daoProducto.update(producto);
		} else {
			// Añadir
			Config.daoProducto.insert(producto);
		}
		
		response.sendRedirect(request.getContextPath() + "/admin/productos/listado");
	}
}
