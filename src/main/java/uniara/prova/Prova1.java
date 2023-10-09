package uniara.prova;


import java.util.Scanner;

// Java  SDK 17

/*
1) Crie um projeto Java, uma classe Java “Prova1” e um método main (1,0).
2) Desenvolva um menu com JoptionPane (preferencialmente) ou Scanner com as seguinte opções
(1,0):
1 – Cadastrar Pessoa
2 - Alterar Pessoa
3 – Excluir Pessoa
4 – Listar Pessoa
5 – Pesquisar Pessoa por ID
6 – Criadores
7 - Sair

3) Crie um vetor de Strings[50] para o Nome das Pessoas (1,0).
4) Implemente uma forma do menu ser chamado até a opção 7 ser digitada (caso o usuário digite
algo diferente das opções listadas acima, envie uma mensagem informando que a opção foi
inválida e retorne ao menu) (1,0).
5) Desenvolva a funcionalidade de Cadastro (Nome) da Pessoa utilizando o vetor (1,0).
6) Desenvolva a funcionalidade de Alterar (Nome) da Pessoa no vetor, informando anteriormente
o índice! Informe se for um índice inválido (abaixo de 0 ou acima de 50) (1,0).
7) Desenvolva a funcionalidade de excluir Pessoa! Ao excluir a pessoa, todos os registros da frente
devem ser reorganizados na posição anterior para não haver lacuna.(1,0)
8) Liste todos as Pessoas (Posição no vetor + Nome). Não mostre os nulos! (1,0)
9) Mostre a pessoa pelo índice digitado, caso seja um inválido, mostre ao usuário que o valor é
incorreto. (1.0)
10) Mostre o nome dos criadores (Nome + R.A.) deste projeto (1,0).
 */
public class Prova1 {
    private static final Scanner SC = new Scanner(System.in);
    private static final String[] NOMES = new String[50];
    private static int nomesCadastrados = 0;
    public static void main(String[] args) {
        int opcao;
        do{
            System.out.println("Escolha uma opção: " );
            System.out.println("""
                    1 – Cadastrar Pessoa
                    2 - Alterar Pessoa
                    3 – Excluir Pessoa
                    4 – Listar Pessoa
                    5 – Pesquisar Pessoa por ID
                    6 – Criadores
                    7 - Sair
                            """);
            opcao = SC.nextInt();
            SC.nextLine();
            switch (opcao){
                case 1 -> cadastrarPessoa();
                case 2 -> alterarPessoa();
                case 3 -> excluirPessoa();
                case 4 -> listarPessoa();
                case 5 -> pesquisarPessoa();
                case 6 -> criadores();
                case 7 -> {
                    System.out.println("Programa finalizado, muito obrigado por me utilizar! 😊");
                    return;
                }
                default -> System.out.println("Opção Invalida!");
            }
        }while (opcao != 7);
        SC.close();
    }

    private static void cadastrarPessoa() {
        if(nomesCadastrados <= 50) {
            System.out.println("Digite o nome da pessoa a ser cadastrada.");
            NOMES[nomesCadastrados] = SC.nextLine();
            nomesCadastrados++;
        }else {
            System.out.println("Vetor está cheio!!!");
        }
    }

    private static void alterarPessoa() {
        listarPessoa();
        System.out.println("Digite o index da pessoa para alterar");
        int index = SC.nextInt();
        SC.nextLine();
        if(index < 0 || index > 50 || index > (nomesCadastrados - 1)){
            System.out.println("Index invalido!");
        }else{
            System.out.println("Digite o novo nome");
            NOMES[index] = SC.nextLine();
        }

    }

    private static void excluirPessoa() {
        listarPessoa();
        System.out.println("Digite o index da pessoa para alterar");
        int index = SC.nextInt();
        if(index < 0 || index > 50 || index > (nomesCadastrados - 1)){
            System.out.println("Index invalido!");
        }else{
            NOMES[index] = null; //Apagando o nome no index selecionado
            int restantes = NOMES.length - index; // calculo para determinar quantos nomes e/ou espaços há apos o index do nome removido
            for (int i = 0; i < (restantes - 1); i++) { //percorrendo cada um desses nomes
                NOMES[index + i] = NOMES[index + (i+1)]; //desalocando o index seguinte ao que foi removido para posição anterior, em loop com incremento
            }
            nomesCadastrados--;
        }

    }

    private static void listarPessoa() {
        System.out.println("Listando todos os nomes: ");
        for (int i = 0; i < NOMES.length; i++) {
            if (NOMES[i] == null) return;
            System.out.println(i +" : " + NOMES[i]);
        }
    }

    private static void pesquisarPessoa() {
        System.out.println("Digite o index da pessoa: ");
        int index = SC.nextInt();
        if(index < 0 || index > 50 || index > (nomesCadastrados -1)) {
            System.out.println("Index invalido!");
        }else{
            String nome = NOMES[index];
            System.out.println("Pessoa Encontrada!");
            System.out.println("Pessoa : " + nome);
        }
    }

    private static void criadores() {
        System.out.println("João Guilherme - RA: 00000-007");
        System.out.println("Matheus Mufato - RA: 00000-015");
    }

}
