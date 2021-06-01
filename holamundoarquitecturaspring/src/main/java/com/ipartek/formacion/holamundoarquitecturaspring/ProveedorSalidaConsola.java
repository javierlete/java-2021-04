package com.ipartek.formacion.holamundoarquitecturaspring;

public class ProveedorSalidaConsola implements ProveedorSalida {

	public void enviar(String texto) {
		System.out.println(texto);
	}

}
