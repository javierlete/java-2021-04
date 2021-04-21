package com.ipartek.formacion.bibliotecas;

import java.time.LocalDate;

import static com.ipartek.formacion.bibliotecas.Consola.*;

public class ConsolaPrueba {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String nombre;

		// Sin biblioteca Consola
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Dime tu nombre: ");
//		nombre = sc.nextLine();
		//sc.close();
		
		// Con biblioteca Consola
		p("Bienvenido al programa de demostración de la clase Consola");
		
		p(LocalDate.now());
		
		p(5);
		
		nombre = leerString("Dime tu nombre");
		int i = leerInt("Dime tu edad");
		p(leerChar("Dame una letra"));
		p(leerBoolean("¿Estás seguro?"));
	}
}
