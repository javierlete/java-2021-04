package com.ipartek.formacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;

// import java.lang.*;

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
	 * @param args argumentos
	 */
	public static void mainSentenciasDeControl(String[] args) {
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

	/**
	 * Tipo String
	 * 
	 * @param args argumentos
	 */
	public static void mainString(String[] args) {
		String nombre = "Javier";

		System.out.println("Hola " + nombre);

		String nombre2 = new String("Pepe");

		System.out.println(nombre == nombre2); // Comparación de punteros (si son el mismo)

		System.out.println(nombre.equals(nombre2)); // Los valores son iguales ("gemelos")

		System.out.println(nombre.toUpperCase());

		System.out.println(nombre.length());

		System.out.println("Javier".equals(nombre));

		System.out.println(nombre.compareTo(nombre2) < 0); // nombre < nombre2

		System.out.println("       ñlkajsñlkhadsg ñlkj ñlkhsd g           ".trim());

		nombre = "Pepe";

		int x = 5;

		String s = String.valueOf(x);

		System.out.println(s + 55);

		s = "" + x; // Equivalente a lo de abajo

		// s = new StringBuilder("").append(x).toString();

		System.out.println(nombre.charAt(1));

		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}

		System.out.println(nombre.contains("pe"));

		System.out.println(nombre.substring(1, 3));

		System.out.println(nombre.replace("pe", "pillo"));

		System.out.println(nombre);
	}

	/**
	 * Ejemplos de Arrays
	 * 
	 * @param args argumentos
	 */
	public static void mainArrays(String[] args) {
		int tamano = 3;
		int[] arr = new int[tamano];

		arr[0] = 10;
		arr[1] = 12;
		// arr[5] = 15;

		arr[0] = 20;

		String linea;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);

			linea = String.format("arr[%s] = %s", i, arr[i]);
			System.out.println(linea);

			System.out.printf("arr[%s] = %s\n", i, arr[i]);
		}

		// Java5
		for (int dato : arr) {
			System.out.println(dato);
		}

		char[][] tablero = new char[8][8];

		tablero[0][0] = 'T';
		tablero[0][1] = 'C';

		tablero[7][0] = 't';
		tablero[7][7] = 't';

		for (int fila = 0; fila < tablero.length; fila++) {
			for (int columna = 0; columna < tablero[fila].length; columna++) {
				if (tablero[fila][columna] != 0) {
					System.out.print(tablero[fila][columna] + " ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}

		String[] textos = { "asdf", "alksdjflasd" };

		String[][] traducciones = { { "casa", "home" }, { "perro", "dog" } };

		System.out.println(textos[1]);
		System.out.println(traducciones[1][0]);

	}

	/**
	 * Colecciones
	 * 
	 * @param args argumentos
	 */
	public static void mainColecciones(String[] args) {
		// Java5 <String> Java8 <>
		ArrayList<String> nombres = new ArrayList<>();

		System.out.println(nombres.size());

		nombres.add("Javier");
		nombres.add("Pedro");
		nombres.add("José");
		nombres.add("Javier");

		System.out.println(nombres.size());

		nombres.remove(1);

		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		HashMap<String, Integer> numeros = new HashMap<>();

		numeros.put("Uno", 1);
		numeros.put("Dos", 2);

		System.out.println(numeros.get("Uno"));

		for (String clave : numeros.keySet()) {
			System.out.println(String.format("Clave %s = valor %s", clave, numeros.get(clave)));
		}

		for (int valor : numeros.values()) {
			System.out.println(valor);
		}

		HashMap<String, String> diccionario = new HashMap<>();

		diccionario.put("casa", "home");
		diccionario.put("perro", "dog");

		System.out.println(diccionario.get("casa"));

		HashSet<String> conjunto = new HashSet<>();

		conjunto.add("prueba");
		conjunto.add("prueba2");
		conjunto.add("prueba");

		System.out.println(conjunto.size());

		for (String dato : conjunto) {
			System.out.println(dato);
		}
	}

	@SuppressWarnings("unused")
	public static void mainTiposEncapsulados(String[] args) {
		/*
		 * long -> Long; int -> Integer; short -> Short; byte -> Byte; float -> Float; double
		 * -> Double; char -> Character; boolean -> Boolean
		 */
		
		int i = 5;
		Integer ii = new Integer(i);
		int i2 = ii.intValue();
		
		// Java5 Autoboxing
		int j = 5;
		Integer jj = j;
		int j2 = jj;
		
		Integer z = null;
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Java 1.0
		Date d = new Date();
		
		System.out.println(d);
		System.out.println(String.format("%s/%s/%s", d.getYear() + 1900, d.getMonth() + 1, d.getDate()));
		
		// Java 1.1
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc);
		System.out.println(String.format("%s/%s/%s", gc.get(Calendar.YEAR), gc.get(Calendar.MONTH) + 1, gc.get(Calendar.DATE)));
		
		// Java8 y si no, JodaTime
		LocalDate ld = LocalDate.now();
		
		System.out.println(ld);
		System.out.println(String.format("%s/%s/%s", ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth()));
	}
}
