package com.ipartek.formacion.tiendaonline.controladores.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.tiendaonline.controladores.config.Config;
import com.ipartek.formacion.tiendaonline.modelos.Usuario;

@WebServlet("/admin/usuarios/listado")
public class ListadoUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Pedimos el DAO de Usuario que hemos guardado a nivel global desde el InicioServidorListener
		// y obtenemos todos los usuarios de la tabla usuario
		List<Usuario> usuarios = Config.daoUsuario.select();

		// Creamos una variable para usar con el expression language llamada "usuarios" que
		// contiene la colección de usuarios recibida por el DAO
		request.setAttribute("usuarios", usuarios);
		// Reenviamos la petición en la que nos encontramos a listado.jsp (incluyendo la variable,
		// anterior
		request.getRequestDispatcher("/admin/usuarios/listado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
