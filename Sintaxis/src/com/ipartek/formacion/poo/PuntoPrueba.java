package com.ipartek.formacion.poo;

import java.util.ArrayList;

// java com.ipartek.formacion.poo.PuntoPrueba prueba prueba2
// PuntoPrueba.main(new String[]{"prueba", "prueba2"})

public class PuntoPrueba {
	public static void main(String[] args) {
		Punto p = new Punto();
		p.setX(5);
		p.setY(6);
		System.out.println(p.getX());
		System.out.println(p.getY());

		Punto p2 = new Punto(1, 2);
		System.out.println(p2.getX());
		System.out.println(p2.getY());

		System.out.println(p2.aTexto());

		System.out.println(p2.sumar(p).aTexto().toLowerCase());
		System.out.println(p2.sumar(p).sumar(new Punto(4, 5)).aTexto());

		Punto resultado = p2.sumar(p);

		System.out.println(resultado.aTexto());

		String resultadoTexto = resultado.aTexto();

		System.out.println(resultadoTexto);

		System.out.println(Punto.sumar(p, p2).aTexto());

		Punto pt1 = new Punto(1, 2);
		Punto pt2 = new Punto(1, 2);
		
		System.out.println(pt1 == pt2);
		System.out.println(pt1.equals(pt2));
		
		ArrayList<Punto> puntos = new ArrayList<>();
		
		puntos.add(new Punto(1,2));
		puntos.add(new Punto(3,4));
		puntos.add(new Punto(5,6));
		
		puntos.remove(new Punto(3,4));
		
		for(Punto punto: puntos) {
			System.out.println(punto);
		}
	}

}










