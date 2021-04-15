package com.ipartek.formacion;

/**
 * Clase para demostración de sintaxis básica de Java
 * 
 * @author Curso
 *
 */
public class SintaxisBasica {

	/**
	 * Método de entrada para la aplicación
	 * 
	 * @param args argumentos introducidos por consola
	 */
	@SuppressWarnings("unused")
	public static void mainExpresiones(String[] args) {
		// Otro comentario de línea

		/*
		 * Comentario de bloque
		 */

		/*
		 * ENTEROS
		 * 
		 * byte 8bits short 16bits int 32bits long 64bits
		 * 
		 * COMA FLOTANTE IEEE754
		 * 
		 * float 32bits double 64bits
		 * 
		 * BOOLEANO
		 * 
		 * boolean 16bits
		 * 
		 * CARACTER
		 * 
		 * char 16bits
		 */

		int x = 5;

		long l = 123123123123123123L;

		char enter = '\n';

		boolean encendido = true;

		double dato = 1234.234E4;

		int datoInt = (int) dato;

		// +, -, *, /, %

		int restoDivisionEntero = 5 % 3;

		System.out.println(restoDivisionEntero);

		int xor = 5 ^ 2;

		System.out.println(xor);

		double potencia = Math.pow(5, 2);

		System.out.println(potencia);

		// <, >, <=, >=, ==, !=

		x = 5;

		System.out.println(1 + x + 10);

		// && (cortocircuito), &, || (cortocircuito), |, !

		boolean entreUnoYDiez;

		System.out.println(entreUnoYDiez = 1 <= x && x <= 10);

		System.out.println(!false);

		// +=, *=, /=, -=, ...

		x = x + 1;

		System.out.println(x += 1);

		++x;
		x++;
		--x;
		x--;

		x = 10;

		System.out.println(++x);
		System.out.println(x);

		x = 10;

		System.out.println(x++);
		System.out.println(x);

		// >>, <<, >>>, &, |, ^, ~ a nivel de bits

		System.out.println("BITS");
		System.out.println(-10 >> 2);
		System.out.println(-10 >>> 2);
		System.out.println(10 << 2);
		System.out.println(5 & 3);

		// ? :

		boolean b = true;

		System.out.println(b ? "VERDADERO" : "FALSO");

		x = 5;
		int y = 7;

		int max = x > y ? x : y;
		System.out.println(max);
	}

	/**
	 * Sentencias de control
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final int LIMITE_PELIGRO = 100;
		final int LIMITE_AVISO = 75;

		int x = 120;

		if (x > LIMITE_PELIGRO) {
			System.out.println("ALERTA");
		} else if (x > LIMITE_AVISO) {
			System.out.println("CUIDADO que estamos cerca de entrar en peligro");
		} else {
			System.out.println("Todo normal");
			System.out.println("Sigamos haciendo cosas");
		}

		boolean estaEncendido = false;

		if (estaEncendido) {
			System.out.println("Verdadero");
		}

		// Sólo funciona con enteros y booleanos
		// Java7: También strings

		int opcion = 1;

		switch (opcion) {
		case 1:
			System.out.println("Opción 1");
			break;
		case 2:
			System.out.println("Opción 2");
			break;
		case 3:
			System.out.println("Opción 3");
			break;
		default:
			System.out.println("Caso no reconocido");
		}

		int mes = 4, dias;

		switch (mes) {
		case 2:
			dias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		default:
			dias = 31;
			break;
		}

		System.out.println("El mes " + mes + " tiene " + dias + " días");

		x = 1;

		while (x <= 5) {
			System.out.println(x++);
		}

		x = 1;

		do {
			System.out.println(x++);
		} while (x <= 5);

		for (int c = 1; c <= 5; c++) {
			System.out.println(c);
		}

		int c = 1;

		while (c <= 5) {
			System.out.println(c);
			c++;
		}
	}
}
