package com.ipartek.formacion.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Empleado extends Persona {
	private String dni;

	public Empleado(Persona persona, String dni) {
		this(persona.getNombre(), persona.getFechaNacimiento(), dni);
	}

	public Empleado(String nombre, int anyo, int mes, int dia, String dni) {
		this(nombre, LocalDate.of(anyo, mes, dia), dni);
	}

	public Empleado(String nombre, LocalDate fechaNacimiento, String dni) {
		super(nombre, fechaNacimiento);
		
		setDni(dni);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if(fechaNacimiento == null) {
			throw new RuntimeException("No se admiten empleados sin fecha");
		}
		
		if(fechaNacimiento.isAfter(LocalDate.now().minus(18, ChronoUnit.YEARS))) {
			throw new RuntimeException("No puedes ser empleado con menos de 18 años, o haber nacido en el futuro");
		}
		
		super.setFechaNacimiento(fechaNacimiento);
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + getNombre() + ", fechaNacimiento="
				+ getFechaNacimiento() + "]";
	}

	
}
