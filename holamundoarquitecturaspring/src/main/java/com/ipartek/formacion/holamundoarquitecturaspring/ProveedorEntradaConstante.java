package com.ipartek.formacion.holamundoarquitecturaspring;

import org.springframework.stereotype.Component;

@Component
public class ProveedorEntradaConstante implements ProveedorEntrada {
	public String getTexto() {
		return "Hola Mundo";
	}
}
