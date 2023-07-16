package dev.joaoguilherme.decimaaula.figuras;

public class Cubo implements FiguraGeometrica{

	private double lado;

	public Cubo(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return 6 * Math.pow(this.lado, 2); // a area do cubo é o lado vezes o lado vezes 6
	}

	@Override
	public double perimetro() {
		return 0; // o perimetro do cubo é 0 pois ele não é uma figura plana
	}

	@Override
	public double volume() {
		return Math.pow(this.lado, 3); // o volume do cubo é o lado vezes o lado vezes o lado ou lado ao cubo
	}
}
