package com.ipartek.formacion.holamundoarquitecturaspring;

import java.util.Scanner;

public class ProveedorEntradaConsola implements ProveedorEntrada {
	public String getTexto() {
		return new Scanner(System.in).nextLine();
	}
}
