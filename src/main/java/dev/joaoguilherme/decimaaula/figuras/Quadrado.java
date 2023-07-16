package dev.joaoguilherme.decimaaula.figuras;

public class Quadrado implements FiguraGeometrica{

	private double lado;

	public Quadrado(double lado) {
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
		return Math.pow(this.lado, 2); // a area do quadrado é o lado vezes o lado ou lado ao quadrado
	}

	@Override
	public double perimetro() {
		return 4 * this.lado; // o perimetro do quadrado é o lado vezes 4
	}

	@Override
	public double volume() {
		return 0; // o volume do quadrado é 0 pois ele é uma figura plana
	}
}
