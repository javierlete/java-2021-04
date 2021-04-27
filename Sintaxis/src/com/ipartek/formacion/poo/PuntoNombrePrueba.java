package com.ipartek.formacion.poo;

public class PuntoNombrePrueba {

	public static void main(String[] args) {
		PuntoNombre ptn = new PuntoNombre("Bilbao");

		System.out.println(ptn);

		ptn.setX(5);
		ptn.setY(8);
		ptn.setNombre("Santutxu");

		System.out.println(ptn);
		System.out.println(ptn.getNombre());

		Poligono p = new Poligono();

		p.agregarPunto(ptn);
		p.agregarPunto(new Punto(5, 67));

		for (Punto pt : p.getPuntos()) {
			System.out.println(pt);
		}

		PuntoNombre puntoNombre = new PuntoNombre(1, 2, "Javier");
		Punto punto;

		punto = puntoNombre;

		System.out.println(punto.getX());
		// System.out.println(punto.getNombre());

		System.out.println(punto);

		System.out.println(punto instanceof PuntoNombre);

		PuntoNombre puntoNombre2 = (PuntoNombre) punto;

		System.out.println(puntoNombre2.getNombre());

		Punto punto2 = new Punto(1, 2);

		System.out.println(punto2 instanceof PuntoNombre);

		//PuntoNombre puntoNombre3 = (PuntoNombre) punto2;

		//System.out.println(puntoNombre3.getNombre());

		PuntoNombre puntoNombreA = new PuntoNombre(1, 2, "Tres");
		PuntoNombre puntoNombreB = new PuntoNombre(puntoNombreA);
		
		puntoNombreB.setNombre("Yepa");
		
		System.out.println(puntoNombreA);
		System.out.println(puntoNombreB);
	}

}
