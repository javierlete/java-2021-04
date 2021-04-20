package com.ipartek.formacion.ejercicios;

import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		int objetivo = 1 + (int)(Math.random() * 100);
		
		int numero;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(objetivo);
		
		do {
			// Pedir número
			System.out.println("Introduce un número entre 1 y 100");
			numero = s.nextInt();
			
			// Si el número es menor que el objetivo
			if(numero < objetivo) {
				// Mostrar que es menor
				System.out.println("El número es menor que el que hay que adivinar");
			} else {
				// Y si no, mirar si es mayor
				if(numero > objetivo) {
					// Si lo es, mostrar que es mayor
					System.out.println("El número es mayor que el que hay que adivinar");
				} else {
					// Si no es ni menor ni mayor, es igual
					System.out.println("Has acertado");
				}
			}
			
		} while(numero != objetivo);
		
		s.close();
	}

}
