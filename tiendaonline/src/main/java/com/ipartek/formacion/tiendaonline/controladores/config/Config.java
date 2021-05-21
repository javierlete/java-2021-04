package com.ipartek.formacion.tiendaonline.controladores.config;

import com.eskura21.libraries.beginnersjdbc.Dao;
import com.ipartek.formacion.tiendaonline.modelos.Usuario;

public class Config {
	// DAO disponible para todas las servlets inicializado mediante el InicioServidorListener
	public static Dao<Usuario> daoUsuario;
}
