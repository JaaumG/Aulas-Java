package dev.joaoguilherme.oitavaaula;

public class OitavaAula {

    public static void main(String[] args) {
        /*
        Introdução a Orientação a Objetos
        Aprofundando em herança

        Como dito na aula passada as classes possuem apenas uma herança permitida.
        Entretanto, todas as classes herdam da classe Object, sendo a classe pai de todas as classes.
        Essa herança ocorre de forma direta quando não há o uso explicito de extends em uma classe
        ou de forma indireta quando há o uso de extends em uma classe herdando a Object a partir dela.

        A classe Object possui alguns métodos que podem ser sobrescritos, como o toString, equals, hashCode, entre outros.

        O método toString é um método que retorna uma String que representa o objeto.
        Podemos ver o método toString sendo aplicando quando imprimimos uma variável de um objeto no console.
         */

        Pessoa pessoa = new Pessoa("João", 21);
        System.out.println(pessoa); //Aqui o método toString é chamado implicitamente para imprimir o objeto pessoa
        /*
        Entretanto, como o objeto "Pessoa" não possui o próprio método de toString() o System.out.println() usará o método
        de sua classe pai, e, caso tenha uma classe pai explicita, irá usar a implementação do método da classe pai e assim por diante
        no final utilizando a primeira implementação do método toString() que encontrar.

        Neste caso ocorre de procurar o método toString() na classe Object, que possui a seguinte implementação:

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

        Assim o resultado é o nome da classe + @ + o hashcode do objeto em hexadecimal.

        Para sobrescrever o método toString() é necessário que o método tenha a mesma assinatura (visibilidade, tipo de retorno, nome e parâmetros)
        e a anotação @Override, que indica que o método abaixo sobrescreve um método da classe pai.

         */
        PessoaComToString pessoaComToString = new PessoaComToString("João", 21);

        System.out.println(pessoaComToString); //Aqui o método toString é chamado implicitamente para imprimir o objeto pessoaComToString

        /*

        Outro método que o objeto Object possui é o método equals, usado para comparar dois objetos.

        Ao comparar os objetos com o == estamos comparando as referências dos objetos, ou seja, se são o mesmo objeto.
        Mas quando usamos o método equals de um objeto, ele compara os atributos dos objetos, e não as referências.

         */


        Aluno aluno1 = new Aluno("João", 21, "123456789");
        Aluno aluno2 = new Aluno("João", 21, "123456789");

        System.out.println(aluno1 == aluno2); //Aqui o operador == compara as referências dos objetos, como são objetos diferentes, o resultado é false
        System.out.println(aluno1.equals(aluno2)); //Aqui o uso explicito do método equals
        /*
        Mas se compararmos os objetos pessoa1 e pessoa2 sem sobrescrever o método equals, o resultado será false, pois o método equals da classe Object
        compara as referências dos objetos, como são objetos diferentes, e sempre o resultado é false.

        Agora com a implementação do método equals na classe do aluno podemos definitivamente verificar se os objetos são iguais.
         */
        AlunoComToEquals alunoComToEquals1 = new AlunoComToEquals("João", 21, "123456789");
        AlunoComToEquals alunoComToEquals2 = new AlunoComToEquals("João", 21, "123456789");

        System.out.println(alunoComToEquals1 == alunoComToEquals2); //Aqui o operador == compara as referências dos objetos, como são objetos diferentes, o resultado é false
        System.out.println(alunoComToEquals1.equals(alunoComToEquals2)); //Aqui o uso explicito do método equals

        /*
        Mas perceba que o == continua resultando em false, isso de deve ao fato que o == em objetos compara com as referências dos objetos.
        Ou seja, se os objetos ocuparem o mesmo lugar de memoria ele irá retornar true, caso contrário, false.
         */

        Aluno aluno3 = aluno1;

        System.out.println(aluno1 == aluno3); //Aqui o operador == compara as referências dos objetos, como são objetos diferentes, o resultado é false

        /*
        O método hashCode() retorna um inteiro que representa o objeto.

        Simplificando a ideia de hash, basicamente é uma função que descreve um objeto com um valor
        esse valor é único a esse objeto com aqueles valores em específico.

        Por exemplo, se temos um objeto pessoa com nome e idade, o hashcode desse objeto será único para aquele nome e idade.

        Hash é muito utilizado para indexar objetos, ou seja, para encontrar objetos em uma lista de objetos.
        Essa é a lógica por trás da estrutura de dados HashMap, sendo uma lista de objetos que podem ser acessados por uma chave.

        O método hashCode() é usado para gerar o hashcode do objeto, e o método equals() é usado para comparar dois objetos.

         */

        Tv tv = new Tv("Samsung", 32, 1000);
        System.out.println(tv.hashCode()); //Aqui o método hashCode() é chamado explicitamente, mas utilizando a implementação da classe Object
        TvComHashCode tvComHashCode = new TvComHashCode("Samsung", 32, 1000);
        System.out.println(tvComHashCode.hashCode()); //Aqui é a própria implementação do objeto do método hashCode()

        /*
            Perceba que o resultado de ambos difere mesmo possuindo o mesmo nome, tamanho e preço, mas sempre resulta no mesmo hash

            Por fim, uma boa prática ao trabalhar em java, é sempre incluir a sobreposição destes 3 métodos, toString(), equals() e hashCode(),
            pois são métodos usados com frequência ao trabalhar com objetos.

            E as IDEs como o IntelliJ e o Eclipse possuem atalhos para gerar esses métodos automaticamente.

            A classe Computador, segue as boas práticas incluído a sobreposição dos métodos toString(), equals() e hashCode().
         */

        Computador computador = new Computador("Samsung","Galaxy Book", 5000);

        /*
            Vale lembrar que você pode modificar os métodos ditos a cima de acordo com sua vontade mantendo a sua respectiva assinatura.
         */
    }
}
