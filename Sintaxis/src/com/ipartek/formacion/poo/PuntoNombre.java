package com.ipartek.formacion.poo;

public class PuntoNombre extends Punto {
	private String nombre;

	public PuntoNombre(int x, int y, String nombre) {
		super(x, y);
		setNombre(nombre);
	}
	
	public PuntoNombre(PuntoNombre puntoNombre) {
		this(puntoNombre.getX(), puntoNombre.getY(), puntoNombre.nombre);
	}
	
	public PuntoNombre(String nombre) {
		this(X_POR_DEFECTO, Y_POR_DEFECTO, nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "PuntoNombre [nombre=" + nombre + ", x=" + getX() + ", y=" + getY() + "]";
	}
	
	
}
