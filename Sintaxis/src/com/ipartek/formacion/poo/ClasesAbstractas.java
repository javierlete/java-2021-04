package com.ipartek.formacion.poo;

public class ClasesAbstractas {

	public static void main(String[] args) {
		Number[] numeros = new Number[3];
		
		numeros[0] = new Integer(5);
		numeros[1] = new Double(1.8);
		numeros[2] = new Float(1.2);
		
		for(Number n: numeros) {
			System.out.println(Math.round(n.doubleValue()));
		}
	}
}
