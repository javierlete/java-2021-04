package com.ipartek.formacion.holamundoarquitectura;

public class ProveedorSalidaConsolaCuadrado implements ProveedorSalida {

	@Override
	public void enviar(String texto) {
		 String adorno = new String(new char[texto.length()]).replace("\0", "*");
		 System.out.println(adorno);
		 System.out.println(texto);
		 System.out.println(adorno);
	}

}
