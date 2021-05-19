package com.ipartek.formacion.tiendaonline.controladores.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.tiendaonline.daos.DaoUsuario;
import com.ipartek.formacion.tiendaonline.modelos.Usuario;

@WebServlet("/admin/usuarios/listado")
public class ListadoUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pathSqlite = getServletContext().getRealPath("/WEB-INF/tiendaonline.sqlite3");
		DaoUsuario dao = new DaoUsuario("org.sqlite.JDBC", "jdbc:sqlite:" + pathSqlite, "", "");
		
		ArrayList<Usuario> usuarios = dao.select();

		request.setAttribute("usuarios", usuarios);
		request.getRequestDispatcher("/admin/usuarios/listado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
