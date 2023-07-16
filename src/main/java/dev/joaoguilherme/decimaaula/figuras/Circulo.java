package dev.joaoguilherme.decimaaula.figuras;

public class Circulo implements FiguraGeometrica{

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if(raio > 0) {
			this.raio = raio;
		}
	}

	public double area() {
		return Math.PI * Math.pow(this.raio, 2); // a area do circulo é o raio vezes o raio vezes pi
	}

	public double perimetro() {
		return 2 * Math.PI * this.raio; // o perimetro do circulo é o raio vezes 2 vezes pi
	}

	public double volume() {
		return 0; // o volume do circulo é 0 pois ele é uma figura plana
	}
}
