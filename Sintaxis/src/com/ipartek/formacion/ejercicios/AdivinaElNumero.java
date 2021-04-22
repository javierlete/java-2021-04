package com.ipartek.formacion.ejercicios;

import static com.ipartek.formacion.bibliotecas.Consola.leerInt;
import static com.ipartek.formacion.bibliotecas.Consola.p;

public class AdivinaElNumero {
	private static int objetivo = generarNumeroAleatorio();
	private static int numero;
	
	public static void main(String[] args) {

		p(objetivo);

		do {
			pedirNumero();

			mostrarMensaje();

		} while (!haAcertado());

	}

	private static boolean haAcertado() {
		return numero == objetivo;
	}

	private static int generarNumeroAleatorio() {
		return 1 + (int) (Math.random() * 100);
	}

	private static void mostrarMensaje() {
		// Si el n�mero es menor que el objetivo
		if (numero < objetivo) {
			// Mostrar que es menor
			p("El n�mero es menor que el que hay que adivinar");
		} else {
			// Y si no, mirar si es mayor
			if (numero > objetivo) {
				// Si lo es, mostrar que es mayor
				p("El n�mero es mayor que el que hay que adivinar");
			} else {
				// Si no es ni menor ni mayor, es igual
				p("Has acertado");
			}
		}
	}

	private static int pedirNumero() {
		// Pedir n�mero
		do {
			numero = leerInt("Introduce un n�mero entre 1 y 100");
		} while (!esNumeroCorrecto());

		return numero;
	}

	private static boolean esNumeroCorrecto() {
		if (numero >= 1 && numero <= 100) {
			return true;
		} else {
			p("El n�mero debe estar comprendido entre 1 y 100");
			return false;
		}
	}

}
