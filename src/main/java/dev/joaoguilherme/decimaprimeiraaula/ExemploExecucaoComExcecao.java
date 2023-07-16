package dev.joaoguilherme.decimaprimeiraaula;

import java.util.Scanner;

public class ExemploExecucaoComExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Calculadora de divisão\nDigite o dividendo: ");
		int numero = sc.nextInt();
		System.out.print("Digite o divisor: ");
		int divisor = sc.nextInt();
		System.out.println("O resultado da divisão é: " + (numero / divisor));
		sc.close();
	}
}
