package dev.joaoguilherme;

public class QuartaAula {

    public static void main(String[] args) {
        /*
          Introdução a Orientação Objetos
          Classes e Objetos


        Em C vimos sobre structs que é uma forma de construir um novo tipo de dado a partir de outros tipos de dados,
        por exemplo:

        struct {
            char nome[50];
            int idade;
        } typedef Pessoa;

        "Pessoa" é um novo tipo de dado que foi criado a partir de outros tipos de dados, neste caso, char e int
        e assim podemos utilizar dessa struct Pessoa para criar variáveis do tipo Pessoa

        Pessoa * p = (Pessoa *) malloc(sizeof(Pessoa *));

        p->idade = 20;
        strcpy(p->nome, "João Guilherme");

        Dessa forma podemos carregar mais de uma informação de tipos diferentes definidos por uma única variável.

        A definição de uma struct como a de pessoa acima é uma "receita" para criar uma variável do tipo Pessoa
        e assim podemos criar quantas variáveis do tipo Pessoa quisermos, por exemplo:

        Pessoa p1;
        Pessoa p2;
        ...

        Em Java, para criarmos essa "receita" utilizamos o conceito de classe.
        Uma classe contem atributos, as informações que esse tipo de variável carrega, mas indo além de uma struct simples
        uma classe pode conter funções, chamadas de métodos, que podem ser utilizadas para manipular os atributos da classe.

        Abaixo segue uma demonstração de uma classe Pessoa em Java
         */

        class Pessoa {
            int idade;
            String nome;
        }


        //A classe Pessoa acima é uma receita para criar uma variável do tipo Pessoa, assim como a struct Pessoa em C

        Pessoa pessoa = new Pessoa(); //Aqui estamos criando uma variável do tipo Pessoa, assim como fizemos em C

        //Agora podemos utilizar essa variável para carregar informações

        pessoa.idade = 21;
        pessoa.nome = "João Guilherme";

        /*
        A partir do momento em que utilizamos o operador new, estamos criando um objeto, em resumo classe é a receita e objeto é o resultado da receita
        A palavra new é o equivalente ao malloc em C, ela aloca memória para a variável do tipo Pessoa, mas de forma mais "automática"
        */
    }

}
