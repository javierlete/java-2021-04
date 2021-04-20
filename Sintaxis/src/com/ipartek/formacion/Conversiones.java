package com.ipartek.formacion;

import java.time.LocalDate;
import java.util.Scanner;

public class Conversiones {

	public static void main(String[] args) {
		//convertirDeStringAOtros();
		
		convertirDeOtrosAString();
	}

	private static void convertirDeOtrosAString() {
		int i = 5;
		String texto = String.valueOf(i);
		
		System.out.println(texto + 5);
		
		LocalDate ld = LocalDate.now();
		String fechaEnTexto = ld.toString();
		
		System.out.println(fechaEnTexto.replace('-', '/'));
	}

	private static void convertirDeStringAOtros() {
		Scanner s = new Scanner(System.in);

		System.out.print("Dame un texto: ");
		String linea = s.nextLine();

		System.out.println(linea);

		System.out.print("Dame un número entero: ");
		linea = s.nextLine();

		int i = Integer.parseInt(linea);

		System.out.println(i * 2);

		System.out.print("Dame un número double: ");
		linea = s.nextLine();

		double d = Double.parseDouble(linea.replace(',', '.'));

		System.out.println(d * 2);

		System.out.print("Dame un char: ");
		linea = s.nextLine();

		char c = linea.charAt(0);

		System.out.println(c);

		System.out.print("Dime sí o no (s/N): ");
		linea = s.nextLine();

		boolean b;
		// b = "s".equalsIgnoreCase(linea);

		if ("s".equalsIgnoreCase(linea)) {
			b = true;
		} else {
			b = false;
		}

		System.out.println(b);

		s.close();
	}

}
