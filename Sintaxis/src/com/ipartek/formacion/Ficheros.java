package com.ipartek.formacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {

	private static final String FICHERO = "C:\\nuevos\\trabajo.txt";
	private static final boolean AUTO_FLUSH = true;
	private static final boolean APPEND = true;

	public static void main(String[] args) {
		// Java 7 o superior (try-with-resources)
		try (FileWriter fw = new FileWriter(FICHERO, APPEND); PrintWriter pw = new PrintWriter(fw, AUTO_FLUSH)) {
			pw.println("Hola desde Java");
			pw.print("Sin enter");
			pw.println("... Detrás del 'Sin enter'");
			// pw.flush();

			// pw.close();
		} catch (IOException e) {
			System.out.println("No se ha podido escribir en el fichero");
		}
		
		try (FileReader fr = new FileReader(FICHERO); Scanner s = new Scanner(fr)) {
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}

			// s.close();
		} catch (IOException e) {
			System.out.println("No se ha podido leer el fichero");
		}
	}

	public static void mainJavaAntiguo(String[] args) {
		// Compatible con todas las versiones de Java
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(FICHERO);
			pw = new PrintWriter(fw);

			pw.println("Hola desde Java");
			pw.print("Sin enter");
			pw.println("... Detrás del 'Sin enter'");
		} catch (IOException e) {
			System.out.println("No se ha podido escribir en el fichero");
		} finally {
			if (pw != null) {
				pw.close();
			}

			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("El cierre ha fallado");
				}
			}
		}

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(FICHERO);
			br = new BufferedReader(fr);

			String linea = null;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.out.println("No se ha podido leer el fichero");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("No se ha podido cerrar el buffered reader");
				}
			}

			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					System.out.println("No se ha podido cerrar el fichero");
				}
			}

		}

	}

}
