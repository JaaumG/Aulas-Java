package dev.joaoguilherme.decimaaula.figuras;

public class Hexagono implements FiguraGeometrica{

	private double lado;

	public Hexagono(double lado) {
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
		return (3 * Math.pow(this.lado, 2) * Math.sqrt(3))/ 2; //area do hexagono é 3 vezes a raiz de 3 vezes o lado ao quadrado dividido por 2
	}

	@Override
	public double perimetro() {
		return 6 * this.lado; //perimetro do hexagono é o lado vezes 6
	}

	@Override
	public double volume() {
		return 0; // o volume do hexagono é 0 pois ele é uma figura plana
	}
}
