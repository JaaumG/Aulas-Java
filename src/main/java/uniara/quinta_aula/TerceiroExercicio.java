package uniara.quinta_aula;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        float maximo, minimo, media;
        float[] notas = new float[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        float nota = sc.nextFloat();
        maximo = nota;
        minimo = nota;
        notas[0] = nota;
        for (int i = 1; i < 10; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            nota = sc.nextFloat();
            notas[i] = nota;
            if (nota > maximo) {
                maximo = nota;
            }
            if (nota < minimo) {
                minimo = nota;
            }
        }
        sc.close();
        media = 0;
        for (float nota2 : notas) {
            media += nota2;
        }
        media /= notas.length;
        System.out.println("Maior nota: " + maximo);
        System.out.println("Menor nota: " + minimo);
        System.out.println("Media: " + media);
    }
}
