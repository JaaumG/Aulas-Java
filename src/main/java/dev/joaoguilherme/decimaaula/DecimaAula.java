package dev.joaoguilherme.decimaaula;

import dev.joaoguilherme.decimaaula.figuras.*;

public class DecimaAula {

	public static void main(String[] args) {
		/*
		As classes, Circulo, Quadrado e Triangulo implementam a interface FiguraGeometrica
		Isso significa que elas têm que implementar os métodos area(), perimetro() e volume()

		 */

		System.out.println("--- Figuras planas ---");

		Circulo circulo = new Circulo(5);
		System.out.println("Area do circulo: " + circulo.area());
		System.out.println("Perimetro do circulo: " + circulo.perimetro());
		System.out.println("Volume do circulo: " + circulo.volume());

		System.out.println();

		Quadrado quadrado = new Quadrado(5);
		System.out.println("Area do quadrado: " + quadrado.area());
		System.out.println("Perimetro do quadrado: " + quadrado.perimetro());
		System.out.println("Volume do quadrado: " + quadrado.volume());

		System.out.println();

		Triangulo triangulo = new Triangulo(5, 5, 5);
		System.out.println("Area do triangulo: " + triangulo.area());
		System.out.println("Perimetro do triangulo: " + triangulo.perimetro());
		System.out.println("Volume do triangulo: " + triangulo.volume());

		System.out.println();

		Hexagono hexagono = new Hexagono(5);
		System.out.println("Area do hexagono: " + hexagono.area());
		System.out.println("Perimetro do hexagono: " + hexagono.perimetro());
		System.out.println("Volume do hexagono: " + hexagono.volume());

		/*
		Assim como as classes, Esfera, Cubo e Piramide implementam a interface FiguraGeometrica
		 */

		System.out.println("--- Figuras espaciais ---");

		Esfera esfera = new Esfera(5);
		System.out.println("Area da esfera: " + esfera.area());
		System.out.println("Perimetro da esfera: " + esfera.perimetro());
		System.out.println("Volume da esfera: " + esfera.volume());

		System.out.println();

		Cubo cubo = new Cubo(5);
		System.out.println("Area do cubo: " + cubo.area());
		System.out.println("Perimetro do cubo: " + cubo.perimetro());
		System.out.println("Volume do cubo: " + cubo.volume());

		System.out.println();

		Piramide piramide = new Piramide(5, 5);
		System.out.println("Area da piramide: " + piramide.area());
		System.out.println("Perimetro da piramide: " + piramide.perimetro());
		System.out.println("Volume da piramide: " + piramide.volume());

		System.out.println();

		/*
		Como todos são do tipo FiguraGeometrica, podemos criar um array de FiguraGeometrica

		Assim, podemos criar um array de FiguraGeometrica e adicionar todas as figuras geométricas
		 */

		FiguraGeometrica[] figuras = {circulo, quadrado, triangulo, hexagono, esfera, cubo, piramide};

		//E agora podemos iterar sobre o array e chamar os métodos area(), perimetro() e volume() de cada figura geométrica

		for (int i = 0; i < figuras.length; i++) {
			System.out.println("--- Figura " + (i + 1) + " ---");
			System.out.println("Area da figura " + (i + 1) + ": " + figuras[i].area());
			System.out.println("Perimetro da figura " + (i + 1) + ": " + figuras[i].perimetro());
			System.out.println("Volume da figura " + (i + 1) + ": " + figuras[i].volume());
		}

		/*
		Como podemos ver, o código ficou muito mais limpo e organizado
		Além disso, podemos adicionar novas figuras geométricas sem precisar alterar o código existente

		Isso é o que chamamos de polimorfismo.
		 */
	}
}
