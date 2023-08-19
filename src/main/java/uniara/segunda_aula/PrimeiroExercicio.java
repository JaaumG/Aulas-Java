package uniara.segunda_aula;

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero.");
        int firstValue = sc.nextInt();
        System.out.println("Digite o segundo numero.");
        int secondValue = sc.nextInt();


        System.out.println("Soma: " +  (firstValue + secondValue));
        System.out.println("Subtração: " +  (firstValue - secondValue));
        System.out.println("Divisão: " +  (firstValue / secondValue));
        System.out.println("Multiplicação: " +  (firstValue * secondValue));

        sc.close();

    }
}
