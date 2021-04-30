package com.ipartek.formacion.jdbc.clientes.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ipartek.formacion.jdbc.clientes.entidades.Cliente;

public class DaoCliente {
	private static final String URL = "jdbc:sqlite:tienda.db";
	private static final String USUARIO = "";
	private static final String PASSWORD = "";

	private static final String SQL_SELECT = "SELECT id, nombre, apellidos FROM clientes";
	private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE id = ?";
	private static final String SQL_INSERT = "INSERT INTO clientes (nombre, apellidos) VALUES (?,?)";
	private static final String SQL_UPDATE = "UPDATE clientes SET nombre = ?, apellidos = ? WHERE id = ?";
	private static final String SQL_DELETE = "DELETE FROM clientes WHERE id = ?";

	public static ArrayList<Cliente> obtenerTodos() {
		try (Connection con = obtenerConexion();
				PreparedStatement ps = con.prepareStatement(SQL_SELECT);
				ResultSet rs = ps.executeQuery()) {

			ArrayList<Cliente> clientes = new ArrayList<>();

			while (rs.next()) {
				clientes.add(new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos")));
			}

			return clientes;
		} catch (Exception e) {
			throw new AccesoDatosException("No se han podido obtener todos los clientes", e);
		}
	}

	public static ArrayList<Cliente> obtenerTodosAntesDeJava7() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = obtenerConexion();
			ps = con.prepareStatement(SQL_SELECT);
			rs = ps.executeQuery();

			ArrayList<Cliente> clientes = new ArrayList<>();

			while (rs.next()) {
				clientes.add(new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos")));
			}

			return clientes;
		} catch (Exception e) {
			throw new AccesoDatosException("No se han podido obtener todos los clientes", e);
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {}
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {}
			}
		}
	}

	public static Cliente obtenerPorId(Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);) {
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			Cliente cliente = null;

			if (rs.next()) {
				cliente = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"));
			}

			return cliente;
		} catch (Exception e) {
			throw new AccesoDatosException("La operación de obtener cliente por id ha fallado", e);
		}
	}

	public static Cliente insertar(Cliente cliente) {
		try (Connection con = obtenerConexion();
				PreparedStatement ps = con.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);) {
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());

			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();

			rs.next();

			cliente.setId(rs.getInt(1));

			return cliente;
		} catch (Exception e) {
			throw new AccesoDatosException("La operación de insertar cliente ha fallado", e);
		}
	}

	public static Cliente modificar(Cliente cliente) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_UPDATE);) {
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setInt(3, cliente.getId());

			ps.executeUpdate();

			return cliente;
		} catch (Exception e) {
			throw new AccesoDatosException("La operación de modificar cliente ha fallado", e);
		}
	}

	public static void borrar(Integer id) {
		try (Connection con = obtenerConexion(); PreparedStatement ps = con.prepareStatement(SQL_DELETE);) {
			ps.setInt(1, id);

			ps.executeUpdate();
		} catch (Exception e) {
			throw new AccesoDatosException("La operación de borrar cliente ha fallado", e);
		}
	}

	private static Connection obtenerConexion() {
		Connection con = null;

		try {
			con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
		} catch (Exception e) {
			throw new AccesoDatosException("Error en la conexión a clientes", e);
		}

		return con;
	}
}
