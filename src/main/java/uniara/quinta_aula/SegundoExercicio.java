package uniara.quinta_aula;

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        int[] notas = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }
        System.out.println("Notas digitadas: ");
        for (int nota : notas) {
            System.out.println(nota);
        }
        sc.close();
    }
}
