package com.ipartek.formacion.poo;

public class PoligonoPrueba {

	public static void main(String[] args) {
		Poligono p = new Poligono();
		
		p.agregarPunto(new Punto());
		p.agregarPunto(new Punto(5,6));
		
		for(Punto pt: p.getPuntos()) {
			System.out.println(pt.aTexto());
		}
		
		Punto punto;
		for(int i = 0; i < p.getPuntos().size(); i++) {
			punto = p.getPuntos().get(i);
			System.out.println(punto.aTexto());
		}
	}

}
