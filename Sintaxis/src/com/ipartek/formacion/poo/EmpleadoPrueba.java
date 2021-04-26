package com.ipartek.formacion.poo;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		Empleado e = new Empleado("Javier", 2003, 4, 26, "12345678Z");

		System.out.println(e);

		e.setNombre("Javier");
		e.setFechaNacimiento(2002, 2, 3);
		e.setDni("12345678Z");

		System.out.println(e);
		System.out.println(e.getDni());

		Oficina o = new Oficina("Bilbao");

		o.meter(e);
		o.meter(new Persona());

		for (Persona p : o.getPersonas()) {
			System.out.println(p);
		}

	}

}
