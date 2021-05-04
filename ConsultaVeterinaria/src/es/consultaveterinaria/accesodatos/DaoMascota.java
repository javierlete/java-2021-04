package es.consultaveterinaria.accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.consultaveterinaria.entidades.Mascota;

public class DaoMascota {
	private static final String URL = "jdbc:sqlite:consultaveterinaria.sqlite3?date_string_format=yyyy-MM-dd";
	private static final String USUARIO_BDD = "";
	private static final String PASSWORD_BDD = "";

	// Buscar todos los registros de la tabla
	private static final String SQL_SELECT = "SELECT id, nombre, fecha_nacimiento FROM mascotas";
	// Buscar UN registro por su id
	private static final String SQL_SELECT_ID = SQL_SELECT + " WHERE id=?";
	// Insertar un registro nuevo
	private static final String SQL_INSERT = "INSERT INTO mascotas (nombre, fecha_nacimiento) VALUES (?,?)";
	// Modificar un registro cuyo id sea uno concreto
	private static final String SQL_UPDATE = "UPDATE mascotas SET nombre=?, fecha_nacimiento=? WHERE id=?";
	// Borrar un registro cuyo id sea uno concreto
	private static final String SQL_DELETE = "DELETE FROM mascotas WHERE id=?";

	public static ArrayList<Mascota> obtenerTodas() {
		try (Connection con = obtenerConexion();
				PreparedStatement ps = con.prepareStatement(SQL_SELECT);
				ResultSet rs = ps.executeQuery()) {
			ArrayList<Mascota> mascotas = new ArrayList<>();

			while (rs.next()) {
				mascotas.add(new Mascota(rs.getInt("id"), rs.getString("nombre"),
						rs.getDate("fecha_nacimiento").toLocalDate()));
			}

			return mascotas;
		} catch (SQLException e) {
			throw new AccesoDatosException("No se han podido obtener todos los registros", e);
		}
	}

	private static Connection obtenerConexion() {
		try {
			return DriverManager.getConnection(URL, USUARIO_BDD, PASSWORD_BDD);
		} catch (SQLException e) {
			throw new AccesoDatosException("Ha habido un error al conectar a la base de datos", e);
		}
	}

}
