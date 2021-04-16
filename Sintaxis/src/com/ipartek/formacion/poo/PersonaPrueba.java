package com.ipartek.formacion.poo;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class PersonaPrueba {

	public static void main(String[] args) {
		Persona persona; // null
		
		persona = new Persona(); // constructor
		
		persona.setNombre("     Javier Lete   ");
		persona.setNombre("Pepe", "Pérez");
		persona.setFechaNacimiento(LocalDate.of(1980, 11, 17));
		persona.setFechaNacimiento(new GregorianCalendar(1985, 10, 17));
		persona.setFechaNacimiento(1990, 3, 4);
		
		System.out.println(persona);
		
		System.out.println(persona.getNombre());
		System.out.println(persona.getFechaNacimiento());
		
		Persona p = new Persona("Javier Lete", 1980, 3, 5);
//		Persona p = new Persona("Pepe", LocalDate.of(1987, 2, 3));
//		Persona p = new Persona("Juan");
//		Persona p = new Persona();
		
		System.out.println(p.getNombre());
		System.out.println(p.getFechaNacimiento());
		
		System.out.println(p.aTexto());
	}

}
