package com.ipartek.formacion.ejercicios.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class Ejercicio2Solucion {
	private static final String PEDIR_NUMERO = "Introduce entero. -99 para acabar";

	public static void main(String[] args) {
		ArrayList<Integer> array = leerValores();
		
		double suma = calcularSuma(array);
		double media = calcularMedia(array, suma);
		int cuantosMayorQueMedia = calcularCuantosMayorQueMedia(array, media);
		
		mostrarResultados(array, suma, media, cuantosMayorQueMedia);
	}

	private static double calcularMedia(ArrayList<Integer> array, double suma) {
		return suma / array.size();
	}
	
//	private static double calcularMedia(ArrayList<Integer> array) {
//		return calcularSuma(array) / array.size();
//	}

	// pedir por teclado los valores y guardarlos en el ArrayList
	// la lectura acaba cuando se introduzca -99
	public static ArrayList<Integer> leerValores() {
		ArrayList<Integer> valores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = leerInt(PEDIR_NUMERO);
		
		while (n != -99) {
			valores.add(n);
			
			n = leerInt(PEDIR_NUMERO);
		}
		
		sc.close();
		
		return valores;
	}

	// recorrer el ArrayList y sumar todos sus elementos
	public static double calcularSuma(ArrayList<Integer> valores) {
		double suma = 0;
		
//		Iterator<Integer> it = valores.iterator();
//		while (it.hasNext()) {
//			suma = suma + it.next();
//		}
		
		for(int numero: valores) {
			suma += numero;
		}
		
		return suma;
	}

	// Mostrar valores, su suma y su media aritmética
	// y cuántos hay superiores a la media
	public static void mostrarResultados(ArrayList<Integer> valores, double suma, double media, int cuantosMayorQueMedia) {
		System.out.println("Valores introducidos: ");
		System.out.println(valores);
		System.out.println("Suma: " + suma);
		System.out.printf("Media: %.2f %n", media);
		System.out.println(cuantosMayorQueMedia + " valores superiores a la media");
	}

	private static int calcularCuantosMayorQueMedia(ArrayList<Integer> valores, double media) {
		int cont = 0;
		
		for (Integer i : valores) {
			if (i > media) {
				cont++;
			}
		}
		
		return cont;
	}
}
