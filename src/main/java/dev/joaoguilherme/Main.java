package dev.joaoguilherme;


public class Main {
    public static void main(String[] args) {

        //As "bibliotecas" Math e String

        //Math inclui funcionalidades matematicas comumente utilizadas, seja trigonometricas, logaritmas, pontencias etc:
        int x = 20, y =4;
        System.out.println(Math.sqrt(y)); //Aqui está sendo feito a raiz quadrada de y -> √y
        //sqrt é a sigla em ingles para SQuare RooT, que traduzindo é raiz quadrada.
        System.out.println(Math.pow(x, y)); //Nessa funcionalidade é a potencia x está sendo elevado a y ou -> 20⁴
        //pow é abreviação para power que neste contexto significa potencia (x to the power of y)
        System.out.println(Math.abs(-31)); //Essa função é o modulo que (|-x| = x)
        //abs é abreviação para absolute, traduzindo absoluto, ou seja o valor absoluto.
        System.out.println(Math.log(20)); //Função de log natural (ln) e²⁰

        System.out.println(Math.random()); //Função para gerar um valor aleatório entre 0 e 1
        //Random traduzido é aleatório

        System.out.println(Math.max(23, 54)); //Função para retornar entre os dois valores qual é o maior (54 > 23)

        System.out.println(Math.min(3245, 24)); //Função para retornar entre os dois valores qual é o menor (24 < 3245)

        //String inclui função para manipulações de textos
        System.out.println(String.valueOf(3)); //Isso ira converter 3 para "3", obs são dados diferentes apesar de vermos da mesma forma.
        //Tipo numerico e tipo textual são diferentes, tipo numerico você consegue fazer manipulações matematicas, textual não.

        String textoExemplo = "Isto é uma demonstração de texto";
        //quanto se tem uma variavel do tipo String com conteudo dentro dela, podemos usar as funcionalidades de String para
        //manipular esse texto.
        System.out.println(textoExemplo);
        //Podemos colocar o texto em CAIXA ALTA
        System.out.println(textoExemplo.toUpperCase());
        //Em caixa baixa
        System.out.println(textoExemplo.toLowerCase());

        //Podemos pegar uma letra em uma posição específica (lembrando que posições no computador começa em 0)
        System.out.println(textoExemplo.charAt(5));

        //Podemos converter a String para um vetor de caracteres
        char[] vetorDeCaracteres = textoExemplo.toCharArray();

        for (int i = 0; i < vetorDeCaracteres.length; i++) {
            System.out.println("posição ["+i+"]: " + vetorDeCaracteres[i]);
        }
        //podemos verificar se o conteudo da String é vazio ("")
        System.out.println(textoExemplo.isEmpty());
        //podemos verificar se conteudo da String está em branco ("   ")
        System.out.println(textoExemplo.isBlank());


        //Funções
        //As funções são declaradas fora do "corpo" (oque está entre chaves é o corpo da função main () { corpo }) da função 'main'
        //Para declarar funções iremos utilizar duas palavras que veremos oque significam mais para frente
        //as palavras são public static, depois de digitar elas podemos definir o tipo de retorno da função, o nome dela, e os parametros
        //os tipos de retorno são os tipos de dados que vimos na primeira aula, int char double String etc.. ou caso ela não tenha que retornar nada
        //usasse o tipo 'void'

        //parametros são os valores que uma função precisa para executar sua funcionalidade, em matematica vemos funções, por exemplo
        // ƒ(x) = 3x² - 5x + 2
        // neste caso a função ƒ possui o parametro x e ela retorna o resultado da equação em código seria algo desta forma:

        imprimeNaTela(String.valueOf(ƒ(20)));
        //ƒ (20)  = 3*20² - 5*20 + 2


    }
    public static double ƒ(int x){
        return 3*Math.pow(x, 2) - 5*x + 2;
    }


    public static void imprimeNaTela(String texto){
        System.out.println(texto);
    }
}