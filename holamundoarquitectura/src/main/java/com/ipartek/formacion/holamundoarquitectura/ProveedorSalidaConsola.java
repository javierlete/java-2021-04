package com.ipartek.formacion.holamundoarquitectura;

public class ProveedorSalidaConsola implements ProveedorSalida {

	public void enviar(String texto) {
		System.out.println(texto);
	}

}
