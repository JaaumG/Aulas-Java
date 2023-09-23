package uniara.quinta_aula;

import java.util.Scanner;

public class PrimeiroExercicio {

    public static void main(String[] args) {
        String[] nomes = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 nomes: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome " + (i + 1) + ": ");
            String nome = sc.nextLine();
            nomes[i] = nome;
        }
        System.out.println("Nomes digitados: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}
