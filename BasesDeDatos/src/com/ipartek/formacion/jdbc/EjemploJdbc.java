package com.ipartek.formacion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// CRUD: Create, Retrieve, Update, Delete

// https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.34.0/sqlite-jdbc-3.34.0.jar

public class EjemploJdbc {

	public static void main(String[] args) throws SQLException {
		// String url = "jdbc:mysql://localhost:3306/basededatos";
		final String url = "jdbc:sqlite:tiendamusica.db";
		final String usuario = "";
		final String password = "";

		// Consulta de todos los datos de una tabla
		final String sqlSelect = "SELECT AlbumId, Title, ArtistId FROM Album";

		Connection con = DriverManager.getConnection(url, usuario, password);

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery(sqlSelect);

		while (rs.next()) {
			System.out.printf("%s\t%s\t%s\n", rs.getString("AlbumId"), rs.getString("Title"), rs.getString("ArtistId"));
		}

		// Añadir un registro a una tabla
		final String sqlInsert = "INSERT INTO Album (AlbumId, Title, ArtistId) VALUES (500, 'Nuevo album', 1);";

		System.out.println(st.executeUpdate(sqlInsert));

		// Mostrar el registro añadido
		final String sqlSelectId = "SELECT AlbumId, Title, ArtistId FROM Album WHERE AlbumId=500";

		rs = st.executeQuery(sqlSelectId);

		if (rs.next()) {
			System.out.printf("%s\t%s\t%s\n", rs.getString("AlbumId"), rs.getString("Title"), rs.getString("ArtistId"));
		}

		// Modificar un registro de una tabla
		final String sqlUpdate = "UPDATE Album SET Title='Cambiado', ArtistId=2 WHERE AlbumId=500";

		System.out.println(st.executeUpdate(sqlUpdate));

		// Mostrar la modificación
		rs = st.executeQuery(sqlSelectId);

		if (rs.next()) {
			System.out.printf("%s\t%s\t%s\n", rs.getString("AlbumId"), rs.getString("Title"), rs.getString("ArtistId"));
		}

		final String sqlDelete = "DELETE FROM Album WHERE AlbumId=500";

		System.out.println(st.executeUpdate(sqlDelete));

		// Mostrar la modificación
		rs = st.executeQuery(sqlSelectId);

		if (rs.next()) {
			System.out.printf("%s\t%s\t%s\n", rs.getString("AlbumId"), rs.getString("Title"), rs.getString("ArtistId"));
		} else {
			System.out.println("No se ha encontrado ningún registro con el AlbumId = 500");
		}

		con.close();
	}
}
