package com.ipartek.formacion.tiendaonline.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ipartek.formacion.tiendaonline.modelos.Usuario;

public class DaoUsuario {
	private Connection con;

	public DaoUsuario(String driver, String url, String usuarioBdd, String passwordBdd) {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuarioBdd, passwordBdd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Usuario> select() {
		ArrayList<Usuario> usuarios = new ArrayList<>();

		try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM usuario")) {

			while (rs.next()) {
				usuarios.add(new Usuario(rs.getInt("id"), rs.getString("email"), rs.getString("password"),
						rs.getString("nombre"), rs.getString("rol")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
	
	public Usuario selectByEmail(String email) {
		Usuario usuario = null;

		try (PreparedStatement ps = con.prepareStatement("SELECT * FROM usuario WHERE email = ?")) {
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				usuario = new Usuario(rs.getInt("id"), rs.getString("email"), rs.getString("password"),
						rs.getString("nombre"), rs.getString("rol"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
}
