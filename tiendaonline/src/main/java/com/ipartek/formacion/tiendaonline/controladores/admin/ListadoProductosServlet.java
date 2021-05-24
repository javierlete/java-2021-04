package com.ipartek.formacion.tiendaonline.controladores.admin;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.tiendaonline.modelos.Producto;

@WebServlet("/admin/productos/listado")
public class ListadoProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Producto> productos = new ArrayList<>();
		
		try (Connection con = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/tiendaonline.sqlite3"));
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM producto")) {
			while(rs.next()) {
				productos.add(new Producto(rs.getInt("id"), rs.getString("nombre"), new BigDecimal(rs.getString("precio").replace(",", "."))));
			}
			
			request.setAttribute("productos", productos);
			
			request.getRequestDispatcher("/admin/productos/listado.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
