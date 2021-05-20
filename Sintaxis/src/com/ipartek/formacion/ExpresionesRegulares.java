package com.ipartek.formacion;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		System.out.println("asdf@asdf.asd".matches("^\\w+@\\w+\\.\\w+$"));
		System.out.println("12345".matches("\\d{5}"));
		System.out.println("941231234".matches("\\d{9}"));
		System.out.println("12345678Z".matches("\\d{8}[A-Z]"));
		System.out.println("Y2345678Z".matches("[XYZ\\d]\\d{7}[A-Z]"));
		System.out.println("Íñigo".matches("\\p{L}+"));	
	}

}
