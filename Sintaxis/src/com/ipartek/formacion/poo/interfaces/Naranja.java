package com.ipartek.formacion.poo.interfaces;

public class Naranja extends Fruto implements Comestible, Rodable {

	private boolean sePuedeComer = true;

	@Override
	public void rodar() {
		System.out.println("Naranja rodando");
		sePuedeComer = false;
	}

	@Override
	public void comer() {
		if (sePuedeComer) {
			System.out.println("Comiendo naranja");
		} else {
			System.out.println("Puaj, que asco, ha estado rodando por el suelo");
		}
	}

}
