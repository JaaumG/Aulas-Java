package uniara.segunda_aula;

import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        String thirdString = sc.nextLine();
        System.out.println(firstString + secondString + thirdString);
        System.out.println(firstString + thirdString + secondString);
        System.out.println(secondString + firstString + thirdString);
        System.out.println(secondString + thirdString + firstString);
        System.out.println(thirdString + firstString + secondString);
        System.out.println(thirdString + secondString + firstString);
        sc.close();
    }
}
