package dev.joaoguilherme.decimaprimeiraaula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExecucaoComTratamentoDeExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Calculadora de divisão\nDigite o dividendo: ");
			int numero = sc.nextInt();
			System.out.print("Digite o divisor: ");
			int divisor = sc.nextInt();
			System.out.println("O resultado da divisão é: " + (numero / divisor));
		} catch (ArithmeticException e) { //Caso o usuário digite 0 como divisor, o programa não irá quebrar
			System.out.println("Não é possível dividir por zero!");
		} catch (InputMismatchException e) { //Caso o usuário digite um valor que não seja um número inteiro, o programa não irá quebrar
			System.out.println("Digite apenas números inteiros!");
		} finally {
			System.out.println("Fim da execução!");
			sc.close();
		}
	}
}
