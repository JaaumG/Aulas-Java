package uniara.segunda_aula;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SegundoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int firstValue = sc.nextInt();
        System.out.println("Digite o segundo valor");
        int secondValue = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        int thirdValue = sc.nextInt();

        System.out.println(IntStream.of(firstValue, secondValue, thirdValue).average());

        sc.close();
    }
}
