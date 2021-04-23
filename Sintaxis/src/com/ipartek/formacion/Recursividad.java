package com.ipartek.formacion;

import java.math.BigInteger;

public class Recursividad {

	public static void main(String[] args) {
		System.out.println(factorial(new BigInteger("10000")).toString().length());
	}
	
	private static BigInteger factorial(BigInteger numero) {
		if(numero.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		return numero.multiply(factorial(numero.subtract(BigInteger.ONE)));
	}

}
