package com.ipartek.formacion.poo;

import java.util.ArrayList;

public class Oficina {
	private String nombre;
	//private Persona[] personas = new Persona[5];
	private ArrayList<Persona> personas = new ArrayList<>();
	
	public Oficina(String nombre) {
		this.nombre = nombre;
	}
	
	public void meter(Persona persona) {
		if(persona == null) {
			throw new RuntimeException("No se admiten personas nulas");
		}
		personas.add(persona);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Persona> getPersonas() {
		return (ArrayList<Persona>) personas.clone();
	}
	
	public String aTexto() {
		return nombre;
	}
}
