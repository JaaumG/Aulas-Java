package dev.joaoguilherme;

import java.util.Scanner;

public class PrimeiraAula {
    public static void main(String[] args) {

        //Declaração de variável

        int variavelInt = 10;
        short variavelShort;
        long variavelLong = 1L;
        double variavelDouble = 10.0;
        float variavelFloat = 10;
        char variavelChar;
        boolean variavelBoolean = true;
        String variavelString = "Texto";

        //Declaração de Vetor

        int[] variavelVetorInt = new int[10];
        short[] variavelVetorShort = new short[5];
        long[] variavelVetorLong = new long[23];
        double[] variavelVetorDouble = {10.0, 12.3, 25.0};
        float[] variavelVetorFloat = new float[43];
        char[] variavelVetorChar = new char[12];
        boolean[] variavelVetorBoolean = new boolean[5];
        String[] variavelVetorString = new String[89];


        //Output de informações (Imprimir na tela)
        System.out.println("Imprime o texto em aspas na tela e pula para a linha de baixo");
        System.out.printf("Utiliza o texto formatado igual a linguagem %c", 'C');

        //Input de informações (Ler console)
        Scanner sc = new Scanner(System.in);
        String lerLinhaDeTexto = sc.nextLine();
        int lerNumero = sc.nextInt();
        double lerNumeroDecimal = sc.nextDouble();

        //OBS: o scanner tem um bug, se você ler um numero depois precisar ler um texto, o scanner irá pular o texto logo você
        // precisa chamar o sc.nextLine(); novamente

        sc.close(); //Fechar scanner

        //Loops

        //Exemplo for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //Exemplo do-while
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a < 20);


        //Exemplo While
        int b = 0;
        while(b < 12){
            System.out.println(b);
            b ++;
        }


        //Condicionais

        //If-else
        if(10> 230) { //verificação de condicional com simbolo de >
            System.out.println("Algo de errado não está certo ");
        }else{
            System.out.println("Tudo certo por aqui");
        }

        //Switch-case
        int variavelExemploSwitch = 5;
        switch (variavelExemploSwitch){
            case 1:
                System.out.println("A variavel vale 1");
                break;
            case 2:
                System.out.println("A variavel vale 2");
                break;
            case 3:
                System.out.println("A variavel vale 3");
                break;
            case 4:
                System.out.println("A variavel vale 4");
                break;
            case 5:
                System.out.println("A variavel vale 5");
                break;
        }


    }
}
