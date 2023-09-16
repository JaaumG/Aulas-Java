package uniara.quarta_aula;

import java.util.Scanner;

public class PrimeiroExcercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para contagem: ");
        int numero = sc.nextInt();
        int i = 0;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }

}