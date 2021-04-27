package com.ipartek.formacion.poo;

public class Punto {
	protected static final int Y_POR_DEFECTO = 0;

	protected static final int X_POR_DEFECTO = 0;

	private int x, y;

	// Variable estática "de clase"
	private static int contador = 0;

	public Punto(int x, int y) {
		setX(x);
		setY(y);

		System.out.println("Se ha creado un objeto " + aTexto() + ". Vamos " + ++contador + " objetos");
	}

	public Punto(Punto punto) {
		this(punto.x, punto.y);
	}

	public Punto() {
		this(X_POR_DEFECTO, Y_POR_DEFECTO);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String aTexto() {
		return String.format("P(%s,%s)", x, y);
	}

	public Punto sumar(Punto p) {
		// return new Punto(x + p.x, y + p.y);
		return sumar(this, p);
	}

	// Método estático "de clase"
	public static Punto sumar(Punto p1, Punto p2) {
		return new Punto(p1.x + p2.x, p1.y + p2.y);
		// return p1.sumar(p2);
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
