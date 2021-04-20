package com.ipartek.formacion.poo;

// java com.ipartek.formacion.poo.PuntoPrueba prueba prueba2
// PuntoPrueba.main(new String[]{"prueba", "prueba2"})

public class PuntoPrueba {
	public static void main(String[] args) {
		Punto p = new Punto();
		p.setX(5);
		p.setY(6);
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Punto p2 = new Punto(1,2);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		
		System.out.println(p2.aTexto());
		
		System.out.println(p2.sumar(p).aTexto().toLowerCase());
		System.out.println(p2.sumar(p).sumar(new Punto(4,5)).aTexto());
		
		Punto resultado = p2.sumar(p);
		
		System.out.println(resultado.aTexto());
		
		String resultadoTexto = resultado.aTexto();
		
		System.out.println(resultadoTexto);
		
		System.out.println(Punto.sumar(p, p2).aTexto());
	}

}
