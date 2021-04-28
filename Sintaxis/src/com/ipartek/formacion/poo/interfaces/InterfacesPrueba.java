package com.ipartek.formacion.poo.interfaces;

public class InterfacesPrueba {

	public static void main(String[] args) {
		Rodable[] rodables = new Rodable[2];
		
		rodables[0] = new Naranja();
		rodables[1] = new Balon();
		
		for(Rodable r: rodables) {
			if(r instanceof Comestible) {
				((Comestible) r).comer();
			}
			
			r.rodar();
			
			if(r instanceof Comestible) {
				((Comestible) r).comer();
			}
		}
	}

}
