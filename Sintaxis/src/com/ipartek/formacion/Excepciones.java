package com.ipartek.formacion;

import java.io.IOException;

public class Excepciones {
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {
		int div, a = 5, b = 0;

		System.out.println("Antes");
		
		try {
			String s = null;
			
			s.toUpperCase();
			
			char c = (char) System.in.read();
		} catch (IOException e) {
			System.out.println("No se ha podido leer de consola");
		} catch(NullPointerException npe) {
			System.out.println("Error de puntero nulo");
		}

		try {
			div = a / b;
		} catch (ArithmeticException ae) {
			div = Integer.MAX_VALUE;
		}

		System.out.println(div);

		System.out.println("Después");
	}
}
