package com.ipartek.formacion.poo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Persona {
	// Constantes
	private static final String NOMBRE_POR_DEFECTO = "DESCONOCIDO";
	private static final LocalDate FECHA_POR_DEFECTO = null;
	
	// Variables de instancia
	private String nombre;
	private LocalDate fechaNacimiento;

	// Constructores
	public Persona(String nombre, LocalDate fechaNacimiento) {
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
		setNombre(nombre + " " + apellido);
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if (fechaNacimiento != null) {
			if (fechaNacimiento.isAfter(LocalDate.now()) || fechaNacimiento.isBefore(LocalDate.of(1900, 1, 1))) {
				throw new RuntimeException("No se admiten fechas de nacimiento en el futuro o antes del 1900");
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
}
