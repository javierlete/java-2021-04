package com.ipartek.formacion.poo;

import java.time.LocalDate;

public class OficinaPrueba {

	public static void main(String[] args) {
		Oficina o = new Oficina("Bilbao");
		
		Persona p = new Persona();
		
		o.meter(p);
		//o.meter(null);
		//o.getPersonas().add(new Persona("IMPOSTOR")); // Ya no cuela
		//o.getPersonas().get(0).setNombre("CAMBIADO POR EL IMPOSTOR");
		o.meter(new Persona("Javier"));
		o.meter(new Persona("Recién nacido", LocalDate.now()));
		
		System.out.println(o.aTexto());
		
		for(Persona persona: o.getPersonas()) {
			System.out.println(persona.aTexto());
		}
	}

}
