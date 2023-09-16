package uniara.quarta_aula;

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        int valorParada = 5, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        i = sc.nextInt();
        while (i != 5){
            System.out.println("Você digitou o numero errado.");
            System.out.println("Digite um numero");
            i = sc.nextInt();
        }
        System.out.println("Você acertou o numero.");
        sc.close();
    }
}
