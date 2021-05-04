package com.ipartek.formacion.supermercado.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.supermercado.entidades.Usuario;

public class DaoUsuario {
	private static final String JDBC_DRIVER = "org.sqlite.JDBC";
	private static final String URL = "jdbc:sqlite:supermercado.sqlite3";
	private static final String USUARIO_BDD = "";
	private static final String PASSWORD_BDD = "";

	private static final String SQL_SELECT = "SELECT id, email, password, nombre, apellidos FROM usuarios";
	private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE id=?";
//	private static final String SQL_INSERT = "INSERT INTO usuarios (email, password, nombre, apellidos) VALUES (?, ?, ?, ?)";
//	private static final String SQL_UPDATE = "UPDATE usuarios SET email=?, password=?, nombre=?, apellidos=? WHERE id=?";
//	private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id=?";

	// Bloque que a veces es necesario si después de tener la cadena de conexión correcta (URL)
	// y referenciado el driver de JDBC, sigue dando "unsuitable driver"
	static {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			throw new AccesoDatosException("No se ha encontrado la clase del driver JDBC de SQLite");
		}
	}
	
	private static Connection obtenerConexion() {
		try {
			return DriverManager.getConnection(URL, USUARIO_BDD, PASSWORD_BDD);
		} catch (Exception e) {
			throw new AccesoDatosException("No se ha podido conectar a la base de datos", e);
		}
	}

	public static ArrayList<Usuario> obtenerTodos() {
		try (Connection con = obtenerConexion();
				PreparedStatement ps = con.prepareStatement(SQL_SELECT);
				ResultSet rs = ps.executeQuery()) {

			ArrayList<Usuario> usuarios = new ArrayList<>();

			while (rs.next()) {
				usuarios.add(new Usuario(rs.getInt("id"), rs.getString("email"), rs.getString("password"),
						rs.getString("nombre"), rs.getString("apellidos")));
			}

			return usuarios;
		} catch (SQLException e) {
			throw new AccesoDatosException("Ha habido un error al obtener los registros", e);
		}
	}

	public static Usuario obtenerPorId(Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);) {

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			Usuario usuario = null;

			if (rs.next()) {
				usuario = new Usuario(rs.getInt("id"), rs.getString("email"), rs.getString("password"),
						rs.getString("nombre"), rs.getString("apellidos"));
			}

			return usuario;
		} catch (SQLException e) {
			throw new AccesoDatosException("Ha habido un error al obtener el usuario cuyo id es " + id, e);
		}
	}
}
