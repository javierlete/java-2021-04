package com.ipartek.formacion.holamundoarquitectura;

public class ProveedorSalidaConsolaAdornada implements ProveedorSalida {

	@Override
	public void enviar(String texto) {
		System.out.println("****" + texto + "****");
	}

}
