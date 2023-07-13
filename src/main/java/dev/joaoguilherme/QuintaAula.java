package dev.joaoguilherme;

public class QuintaAula {

    public static void main(String[] args) {
        /*
          Introdução a Orientação Objetos
          Métodos e Construtores


          Como dito previamente uma classe pode conter métodos, que são funções que podem ser utilizadas atreladas ao objeto.

          Abaixo segue uma demonstração de uma classe Pessoa em Java com um método chamado "falar"


         */

        class Pessoa {
            int idade;
            String nome;

            void falar() {
                System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos");
            }
        }

        /*
        Perceba que falar é uma função, seu retorno é void, ou seja, ela não retorna nada, apenas executa um comando

        Para executar essa função, precisamos de um objeto do tipo Pessoa, assim como fizemos na aula passada
         */

        Pessoa pessoa = new Pessoa();

        //Com a variável pessoa criada, podemos utilizar o método falar

        pessoa.falar();

        /*
        Mas perceba uma coisa, o Objeto pessoa foi instanciado, mas seus atributos não foram inicializados, ou seja, idade e nome estão com valores padrão
        idade = 0
        nome = null

        e mesmo com os atributos estando com valores padrão, o método falar foi executado sem problemas, mas o resultado não foi o esperado

        Para resolver isso, podemos definir que o Objeto pessoa só pode ser instanciado se, e apenas se, os atributos idade e nome forem fornecidos.

        Para isso, iremos definir uma função especial chamada construtor, ela é uma função responsável por inicializar os atributos de um objeto

        Abaixo segue uma demonstração de uma classe Pessoa em Java com um construtor
         */

        class Pessoa2 {
            int idade;
            String nome;


            Pessoa2(int idadeDaPessoa, String nomeDaPessoa) { //Perceba que a função construtora tem o mesmo nome da classe e não possui retorno
                idade = idadeDaPessoa;
                nome = nomeDaPessoa;
            }

            void falar() {
                System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos");
            }
        }

        //Agora, para instanciar um objeto do tipo Pessoa2, precisamos fornecer os atributos idade e nome

        Pessoa2 pessoa2 = new Pessoa2(21, "João Guilherme"); //Perceba que agora o construtor foi chamado e os atributos foram inicializados
        pessoa2.falar();

        /*
            Ao trabalhar com classes em java, é interessante colocá-las em seus arquivos próprios, para fazer isso, a única questão
            é que o nome do arquivo seja o mesmo que a classe, logo se fossemos colocar a classe Pessoa2 em um arquivo separado, o nome
            do arquivo deveria ser "Pessoa2.java"
         */
    }
}
