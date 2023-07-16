package dev.joaoguilherme.decimaprimeiraaula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExecucaoComTratamentoDeExcecaoTryWithResources {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) { //O Objeto Scanner faz comunicação com o console, e implementa o método close() da interface Closeable, que fecha o Scanner
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
		}
	}
}
