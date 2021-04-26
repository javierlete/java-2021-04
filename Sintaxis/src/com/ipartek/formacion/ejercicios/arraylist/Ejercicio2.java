package com.ipartek.formacion.ejercicios.arraylist;

import static com.ipartek.formacion.bibliotecas.Consola.leerInt;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		int suma, cuantosMayorQueMedia, numero;
		double media;

		suma = 0;

		do {
			numero = leerInt("Introduce un número");

			if (numero != -99) {
				listaNumeros.add(numero);

				suma += numero;
			}
		} while (numero != -99);

		if (listaNumeros.size() != 0) {
			media = (double)suma / listaNumeros.size();

			cuantosMayorQueMedia = 0;

			for (int n : listaNumeros) {
				if (n > media) {
					cuantosMayorQueMedia++;
				}
			}

			System.out.println("Suma: " + suma);
			System.out.println(String.format("Media: %.2f", media));
			System.out.println("Mayor que media: " + cuantosMayorQueMedia);
		} else {
			System.out.println("No se ha introducido ningún número");
		}
	}

}
