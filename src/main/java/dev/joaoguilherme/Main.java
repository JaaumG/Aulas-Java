package dev.joaoguilherme;


public class Main {
    public static void main(String[] args) {
        /*
            As classes Wrapper

            Os tipos de dados 'int' 'double' 'char' 'boolean' ... São chamados de dados primitivos,
            pois não há "algo" mais simples que eles, apenas guardam informações.

            Entretanto, há necessidades de converter, manipular estes dados
            e para isso existem as classes Wrapper, classes que "embrulham" os dados primitivos
            em outras palavras são "extensões" dos dados primitivos que vem com funcionalidades.

            Suponhamos que temos a seguinte situação, temos um texto que representa um número inteiro
            e queremos somar algo a esse número na forma de um texto.

        */

        String numero = "34";

        /* Se você simplesmente chamar a variável "numero" (sendo do tipo de um texto) e tentar somar algo a ela resultará
         numa concatenação de texto:*/

        System.out.println(numero + 1); // Resultado: 341

        /*
        Para então podemos utilizar esse texto de forma aritmética, precisamos converter ele para um tipo de dado
        Um jeito que de fato poderíamos convertê-lo seria fazer, por exemplo, uma função que recebe uma String e retorna esse valor
        */

        int numeroConvertido = converteStringParaInt(numero); //resultado -1 veja a função abaixo para entender

        /*Mas perceba a limitação da função, se for um texto diferente de um número entre 0 e 9 ele converte a -1

        Você até pode tentar sofrer e fazer, por exemplo, um loop convertendo cada caractere utilizando o método da string (charAt())
        mas felizmente você não precisa sofrer tanto.

        As classes wrapper implementam essa funcionalidade para você, para utiliza-las é tão simples quanto foi utilizar as funções
        da biblioteca Math e da Classe String

        o nome das classes wrapper são os nomes dos tipos de dados primitivos com a primeira letra maiúscula (Integer, Double, Character, Boolean)
        Exemplo:*/

        int numeroConvertidoComWrapper = Integer.parseInt(numero); //O método valueOf() recebe um texto e retorna um inteiro
        System.out.println(numeroConvertidoComWrapper + 1); // Resultado: 35

        /*Outras funcionalidades das classes wrapper além de conversão são:
           - Nullable: existe a possibilidade de um valor que é do tipo de wrapper possuir um valor nulo (null) enquanto o tipo primitivo não
                Integer valor = null; (✔️)
                int valor = null; (❌)
           - Passar por referência: vimos em C que quando passamos um valor para uma função utilizando de ponteiros a função consegue alterar
               o valor do dado que está em outra parte do código, em outra linguagem essa funcionalidade tambem existe, entretanto, é mais discreta,
               portanto se você fizer uma função que recebe um dado do tipo primitivo (int, por exemplo) é dito que foi passado por valor, agora
               se você fizer o mesmo com o tipo wrapper (Integer) é dito que foi passado por referência.

        Esses são alguns exemplos de utilidades das classes wrapper.

        Segue aqui as classes Wrapper e seus respectivos dados primitivos

        Integer - int
        Double - double
        Character - char
        Boolean - boolean
        Byte - byte
        Short - short
        Long - long
        Float - float

        */
    }

    public static int converteStringParaInt(String texto){
        switch (texto){
            case "1":
                return 1; //Observa que neste switch não está ocorrendo o uso do 'break', pois o switch para antes devido ao 'return'
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "0":
                return 0;
            default:
                return -1;
        }
    }
}