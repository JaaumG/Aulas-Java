package dev.joaoguilherme.decimaaula.figuras;

public class Triangulo implements FiguraGeometrica{

	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	@Override
	public double area() {
		double p = (this.ladoA + this.ladoB + this.ladoC) / 2; //Formula de Heron
		return Math.sqrt(p * (p - this.ladoA) * (p - this.ladoB) * (p - this.ladoC));
	}

	@Override
	public double perimetro() {
		return this.ladoA + this.ladoB + this.ladoC;
	}

	@Override
	public double volume() {
		return 0; // o volume do triangulo é 0 pois ele é uma figura plana
	}
}
