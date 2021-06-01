package com.ipartek.formacion.holamundoarquitecturaspring;

public class ProveedorSalidaConsolaAdornada implements ProveedorSalida {

	@Override
	public void enviar(String texto) {
		System.out.println("****" + texto + "****");
	}

}
