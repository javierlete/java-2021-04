package com.ipartek.formacion.bibliotecas;

import java.util.Scanner;

/**
 * Clase para trabajar la entrada/salida de consola
 * @author Javier Lete
 *
 */
public class Consola {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Muestra un mensaje con salto de línea
	 * @param mensaje mensaje que quieres mostrar
	 */
	public static void p(String mensaje) {
		System.out.println(mensaje);
	}
	
	/**
	 * Muestra un objeto con salto de línea
	 * @param objeto el objeto que se quiere mostrar
	 */
	public static void p(Object objeto) {
		System.out.println(objeto);
	}
	
	/**
	 * Leer una línea de texto desde consola con un mensaje que lo pide
	 * @param mensaje mensaje que se muestra al usuario para pedir el dato
	 * @return texto introducido sin espacios alrededor
	 */
	public static String leerString(String mensaje) {
		System.out.print(mensaje + ": ");
		return sc.nextLine().trim();
	}

	/**
	 * Leer un entero por consola. Repetirá en el caso de que el dato no sea un entero.
	 * @param mensaje mensaje para pedir el entero
	 * @return entero introducido
	 */
	public static int leerInt(String mensaje) {
		int i = 0;
		String linea;
		boolean correcto = false;

		do {
			try {
				linea = leerString(mensaje);
				i = Integer.parseInt(linea);
				correcto = true;
			} catch (NumberFormatException e) {
				System.out.println("Debes introducir un número entero");
			}
		} while (!correcto);

		return i;
	}

	/**
	 * Lee un caracter por consola. Si no es un solo caracter lo vuelve a pedir
	 * @param mensaje mensaje para pedir el caracter
	 * @return el caracter introducido
	 */
	public static char leerChar(String mensaje) {
		String linea;
		boolean correcto;
		do {
			correcto = true;

			linea = leerString(mensaje);

			if (linea.length() != 1) {
				System.out.println("Debes introducir un solo caracter");
				correcto = false;
			}
		} while (!correcto);

		return linea.charAt(0);
	}

	/**
	 * Lee si el usuario ha dicho S o N en mayúsculas o minúsculas
	 * @param mensaje mensaje para pedir el S o N (se incorpora automáticamente '(S/N)')
	 * @return true si ha introducido S, o false si ha introducido N (en mayúsculas o minúsulas)
	 */
	public static boolean leerBoolean(String mensaje) {
		char letra;

		do {
			letra = leerChar(mensaje + " (S/N)");

			switch (Character.toUpperCase(letra)) {
			case 'S':
				return true;
			case 'N':
				return false;
			default:
				System.out.println("Debes introducir o 'S' o 'N'");
			}
		} while (true);

	}
	
//	public static boolean leerBoolean(String mensaje) {
//		boolean valor;
//		
//		char letra;
//
//		do {
//			letra = Character.toUpperCase(leerChar(mensaje + " (S/N): "));
//
//			switch (letra) {
//			case 'S':
//				valor = true;
//			case 'N':
//				valor = false;
//			default:
//				System.out.println("Debes introducir o 'S' o 'N'");
//			}
//		} while (!(letra == 'S' || letra == 'N'));
//		
//		return valor;
//	}

}
