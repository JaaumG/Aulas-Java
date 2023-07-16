package dev.joaoguilherme.decimaaula.figuras;

public class Piramide implements FiguraGeometrica{


	private double comprimentoBase;
	private double larguraBase;
	private double altura;

	public Piramide(double comprimentoBase, double larguraBase, double altura) { // caso a base seja retangular
		this.comprimentoBase = comprimentoBase;
		this.larguraBase = larguraBase;
		this.altura = altura;
	}

	public Piramide(double ladoDaBase, double altura) { // caso a base seja quadrada
		this.comprimentoBase = ladoDaBase;
		this.larguraBase = ladoDaBase;
		this.altura = altura;
	}

	public double getComprimentoBase() {
		return comprimentoBase;
	}

	public void setComprimentoBase(double comprimentoBase) {
		this.comprimentoBase = comprimentoBase;
	}

	public double getLarguraBase() {
		return larguraBase;
	}

	public void setLarguraBase(double larguraBase) {
		this.larguraBase = larguraBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		// Calcula a área da base
        double areaBase = comprimentoBase * larguraBase;

        // Calcula a altura inclinada (altura da face lateral) usando o teorema de Pitágoras
        double alturaInclinada = Math.sqrt(Math.pow(altura, 2) + Math.pow(comprimentoBase / 2, 2));

        // Calcula a área das faces laterais (existem duas faces laterais em uma pirâmide retangular)
        double areaLateral = 2 * (comprimentoBase * alturaInclinada) / 2;

        // A área total é a soma da área da base e das áreas das faces laterais
        return areaBase + areaLateral;
	}

	@Override
	public double perimetro() {
		return 0; // o perimetro da piramide é 0 pois ela não é uma figura plana
	}

	@Override
	public double volume() {
		// O volume é calculado como o produto da área da base pela altura, dividido por 3
        return (comprimentoBase * larguraBase * altura) / 3;
	}
}
