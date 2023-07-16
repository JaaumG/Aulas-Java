package dev.joaoguilherme.decimaaula.figuras;

public class Esfera implements FiguraGeometrica{

	private double raio;

	public Esfera(double raio) {
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
		return 4 * Math.PI * Math.pow(this.raio, 2); // a area da esfera é 4 vezes pi vezes o raio ao quadrado
	}

	public double perimetro() {
		return 0; // o perimetro da esfera é 0, pois ela não é uma figura plana
	}

	public double volume() {
		return (4 * Math.PI * Math.pow(this.raio, 3)) / 3; // o volume da esfera é 4 vezes pi vezes o raio ao cubo dividido por 3
	}
}
