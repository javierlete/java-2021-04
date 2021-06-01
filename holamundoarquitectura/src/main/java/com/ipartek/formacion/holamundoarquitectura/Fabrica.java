package com.ipartek.formacion.holamundoarquitectura;

import java.io.IOException;
import java.util.Properties;

public class Fabrica {
	private String tipoEntrada, tipoSalida;

	public Fabrica() throws IOException {
		Properties prop = new Properties();
		prop.load(Fabrica.class.getClassLoader().getResourceAsStream("fabrica.properties"));
		
		tipoEntrada = prop.getProperty("entrada");
		tipoSalida = prop.getProperty("salida");
	}

	public ProveedorEntrada getProveedorEntrada() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (ProveedorEntrada) Class.forName(tipoEntrada).newInstance();
	}

	public ProveedorSalida getProveedorSalida() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (ProveedorSalida) Class.forName(tipoSalida).newInstance();
	}
}
