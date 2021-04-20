package com.ipartek.formacion.poo;

import java.util.ArrayList;

public class Poligono {
	private ArrayList<Punto> puntos = new ArrayList<>();
	
	public void agregarPunto(Punto punto) {
		puntos.add(punto);
	}
	
	public ArrayList<Punto> getPuntos() {
		return puntos;
	}
}
