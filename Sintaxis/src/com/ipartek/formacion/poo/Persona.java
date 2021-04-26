package com.ipartek.formacion.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Persona { // extends Object {
	// Constantes
	protected static final LocalDate FECHA_MAXIMA = LocalDate.now();
	protected static final LocalDate FECHA_MINIMA = LocalDate.of(1900, 1, 1);
	protected static final String NOMBRE_POR_DEFECTO = "DESCONOCIDO";
	protected static final LocalDate FECHA_POR_DEFECTO = null;
	
	// Variables de instancia (Fields)
	private String nombre;
	private LocalDate fechaNacimiento;

	// Constructores
	public Persona(Persona persona) {
		this(persona.getNombre(), persona.getFechaNacimiento());
	}
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		// super();
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
	}

	public Persona(String nombre, int anyo, int mes, int dia) {
		this(nombre, LocalDate.of(anyo, mes, dia));
	}

	public Persona(String nombre) {
		this(nombre, FECHA_POR_DEFECTO);
	}

	public Persona() {
		this(NOMBRE_POR_DEFECTO, FECHA_POR_DEFECTO);
	}

	// Métodos de acceso
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.trim().length() == 0) {
			throw new RuntimeException("No se admiten nombres vacíos");
		}
		this.nombre = nombre.trim();
	}

	// Sobrecarga de método
	public void setNombre(String nombre, String apellido) {
		if(nombre == null || apellido == null) {
			throw new RuntimeException("No se admite ni nombre ni apellido nulo");
		}
		setNombre(nombre + " " + apellido);
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if (fechaNacimiento != null) {
			if (fechaNacimiento.isAfter(FECHA_MAXIMA)) {
				throw new RuntimeException("No se admiten fechas de nacimiento en el futuro");
			}
			if(fechaNacimiento.isBefore(FECHA_MINIMA)) {
				throw new RuntimeException("No se admiten fechas de nacimiento anteriores a 1900");
			}
		}
		this.fechaNacimiento = fechaNacimiento;
	}

	// Sobrecarga de método
	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
		setFechaNacimiento(LocalDateTime
				.ofInstant(fechaNacimiento.toInstant(), fechaNacimiento.getTimeZone().toZoneId()).toLocalDate());
	}

	// Sobrecarga de método
	public void setFechaNacimiento(int anyo, int mes, int dia) {
		setFechaNacimiento(LocalDate.of(anyo, mes, dia));
	}
	
	// Métodos
	
	public String aTexto() {
		return nombre + "; " + fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
}
