package com.ipartek.formacion.tiendaonline.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.eskura21.libraries.beginnersjdbc.Dao;
import com.ipartek.formacion.tiendaonline.controladores.config.Config;
import com.ipartek.formacion.tiendaonline.modelos.Usuario;

// Al utilizar ServletContextListener podemos escuchar a los eventos de 
// inicio y finalización de la aplicación
@WebListener
public class InicioServidorListener implements ServletContextListener {

	// Evento de arranque de la aplicación (tiendaonline)
	public void contextInitialized(ServletContextEvent sce)  { 
		// sce contiene el contexto de la aplicación
		String pathSqlite = sce.getServletContext().getRealPath("/WEB-INF/tiendaonline.sqlite3");
		// Guardamos a nivel global de la aplicación en la clase Config el DAO de Usuario
		Config.daoUsuario = new Dao<>(Usuario.class, pathSqlite);
	}
    
	// Este evento no podemos garantizar que se vaya a ejecutar siempre ya que en un fallo del servidor
	// no llegaría a ejecutarse
	public void contextDestroyed(ServletContextEvent sce)  {}
}
