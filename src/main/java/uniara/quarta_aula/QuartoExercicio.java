package uniara.quarta_aula;

import java.util.Scanner;

public class QuartoExercicio {

    public static void main(String[] args) {
        int valorTotal = 0 ;
        Scanner sc = new Scanner(System.in);
        while (valorTotal > -1000){
            System.out.println("Digite um numero para ser subtraido do total, total: " + valorTotal);
            valorTotal -= sc.nextInt();
        }
        System.out.println(valorTotal);
        sc.close();
    }

}
