package dev.joaoguilherme;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class EstruturaDeDadosEmJava {
    public static void main(String[] args) {
        /*
        Estrutura de dados em Java

        Antes de tudo CALMAAA!!!

        É apenas uma forma de organizar os dados e a melhor parte é que em java você
        não precisa se preocupar com isso, pois a linguagem já tem tudo pronto para você.

        Só revisando uns conceitos, estrutura de dados não é nada mais nada menos que uma forme de você ter uma coletânea de dados
        organizados de uma forma que facilite a manipulação desses dados.

        Existem vários tipos de estruturas de dados, mas vamos focar nas mais comuns e que você vai usar bastante.

        Array (vetor)
        É uma estrutura de dados que armazena uma coleção de elementos de tal forma que cada um dos elementos possa ser identificado
        por, pelo menos, um índice (posição) ou uma chave.

        Em java para instanciar um array você precisa definir o tipo de dado que ele vai armazenar e o tamanho dele.
        Exemplo:

        */
        int[] numeros = new int[10]; //Uma array com 10 posições para guardar dados do tipo int
        double[] numeros2 = {3.14, 2.78, 1.68}; //Outra forma de declarar um array com valores já definidos
        //Para definir um valor na posição do array você precisa fazer o seguinte:

        numeros[0] = 10; //A primeira posição do array é a posição 0

        //Para acessar um valor do array você precisa fazer o seguinte:
        System.out.println(numeros2[1]); //Vai imprimir o valor 2.78
        /*
        Você pode fazer um vetor de vetores, ou seja para cada posição do array você pode ter outro array, em outras palavras
        você pode ter uma matriz.

        Exemplo:*/
        int[][] matriz = new int[3][3]; //Uma matriz 3x3

        matriz[0][0] = 1; //Primeira linha, primeira coluna
        /*
        A array possui uma limitação significativa, o fato de você não poder aumentar o tamanho dela, ou seja, se você
        declarou um array com 10 posições, você não pode adicionar mais posições a ele, para isso você precisa criar um array.

        Portanto, foi desenvolvido uma estrutura de dados que é uma evolução do array, sendo a lista.
        Vimos que uma lista é uma coleção de elementos, mas o que a difere do array é que ela pode aumentar ou diminuir de tamanho
        conforme a necessidade.

        Desenvolvemos em C a lista lincada que é uma estrutura de dados que possui uma sequência de elementos, onde cada elemento
        possui um ponteiro para o próximo elemento da lista.

        E para sua sorte, em java já existe uma classe que implementa essa estrutura de dados, sendo a classe LinkedList, sendo uma
        lista duplamente encadeada, diferente da lista lincada que é uma lista simplesmente encadeada.
        (ponteiro apenas para o próximo elemento)
        para usar essa classe você precisa importar ela, assim como fizemos com a classe Scanner.
        */

        //Exemplo de uso da classe LinkedList
        LinkedList<Integer> numerosEmLista = new LinkedList<Integer>(); //Cria uma lista vazia do tipo Integer, perceba que há
        // necessidade de definir o tipo de dado que a lista vai armazenar, e que o tipo de dados precisa ser a classe Wrapper do
        // tipo primário
        // Para adicionar um elemento na lista você precisa fazer o seguinte:
        numerosEmLista.add(10); //Adiciona o valor 10 na lista
        //para pegar um elemento da lista você precisa fazer o seguinte:
        System.out.println(numerosEmLista.get(0)); //Imprime o valor 10 que está na primeira posição da lista
        //para remover um elemento da lista você precisa fazer o seguinte:
        numerosEmLista.remove(0); //Remove o elemento da primeira posição da lista

        /*
        Java tambem possui as demais estruturas de dados, como pilha, fila, árvore, grafo, etc.,
        Mas são raras as ocasiões onde há necessidade de utilizar essas estruturas de dados, pois a maioria dos problemas podem ser
        resolvidos com as estruturas de dados que vimos até agora. (mesmo sendo menos eficiente)

        Segue a implementação de uma pilha em java:
         */
        Stack<String> pilha = new Stack<String>(); //Cria uma pilha vazia do tipo String

        pilha.push("João"); //Adiciona o elemento "João" na pilha
        pilha.push("Maria"); //Adiciona o elemento "Maria" na pilha
        pilha.push("José"); //Adiciona o elemento "José" na pilha
        System.out.println(pilha.pop()); //Remove o elemento "José" da pilha e retorna ele (LIFO)

        //Filas:
        ArrayDeque<String> fila = new ArrayDeque<>(); //Cria uma fila vazia do tipo String
        //Observa que na instanciação do objeto ArrayDeque não foi necessário definir o tipo de dado que a fila vai armazenar,
        //pois o java já consegue inferir isso vendo o tipo de dado que a variável fila é (à esquerda)
        //OBS ArrayDeque é uma estrutura de dados que implementa a funcionalidade de filas (Queue)

        fila.add("João"); //Adiciona o elemento "João" na fila
        fila.add("Maria"); //Adiciona o elemento "Maria" na fila
        fila.add("José"); //Adiciona o elemento "José" na fila
        System.out.println(fila.poll()); //Remove o elemento "João" da fila e retorna ele (FIFO)

        //Árvores:
        TreeSet<Integer> arvore = new TreeSet<>(); //Cria uma árvore vazia do tipo Integer
        //OBS TreeSet é uma estrutura de dados que implementa a funcionalidade de árvores (Tree)

        arvore.add(10); //Adiciona o elemento 10 na árvore
        arvore.add(5); //Adiciona o elemento 5 na árvore
        arvore.add(15); //Adiciona o elemento 15 na árvore
        System.out.println(arvore.first()); //Retorna o primeiro elemento da árvore (menor elemento)

        /*
            Em 99,99% dos casos, você utilizará Listas, raremente utilizará as demais estruturas de dados.
            E em Java, as estrutura de dados, apesar de possuirem a mesma lógica aprendida em nosso curso de C, são implementadas
            de forma diferente, pois utilizam de conceitos diferentes para implementar as mesmas funcionalidades, assim sendo mais
            eficientes e mais fáceis de utilizar.

            Portanto, é importante que você saiba que essas estruturas de dados existem, mas não se preocupe em saber como elas
            funcionam, pois você não vai precisar saber isso para resolver os problemas que você vai encontrar no seu dia a dia.

            Foque em entender bem a lógica de Arrays (Vetores), Matrizes e Listas, pois são as estruturas de dados que você mais
            vai utilizar.


         */
    }

}