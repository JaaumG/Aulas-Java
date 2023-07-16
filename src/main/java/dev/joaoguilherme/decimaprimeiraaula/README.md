# Tipos de Erros e Exceções, (try, catch, finally)

Você provavelmente deve ter se deparado com algum erro enquanto programava, mas se eu te falar que existe dois tipos de erros?
Sim, esses dois tipos de erros, são os erros de compilação e os erros de execução.

* **Compilação** é o processo que o compilador de sua linguagem de programação faz para transformar seu código em um código de máquina,
o código que o computador entende.

* **Execução** é quando o seu código está rodando, nesta hora o computador está executando o código de máquina que foi gerado pelo compilador.


Mas e se eu te dissesse que nem sempre o seu código vai funcionar? Não desanime ou pense que isso é uma crítica, não é porque você fez algo de errado, mas simplesmente 
por você ser incapaz de prever o futuro.

Se você comete um erro de sintaxe, o compilador irá te avisar que você cometeu um erro, e não irá gerar o código de máquina, e por isso, o seu código não irá executar.

Mas quando o erro é durante a execução nem você, nem o compilador consegue prever, e por isso, o seu código irá executar, mas pode parar em algum momento, e isso é chamado de exceção.

Para demonstrar oque é um erro de execução acesse o [código](https://github.com/JaaumG/Aulas-Java/blob/main/src/main/java/dev/joaoguilherme/decimaprimeiraaula/ExemploExecucaoComExcecao.java)
de Exemplo de Execução, é um código simples, que pede para o usuário digitar dois números,
o dividendo e o divisor, e então o código irá dividir o dividendo pelo divisor, e mostrar o resultado na tela.

Perceba que o código roda normalmente e tambem funciona corretamente logo não possui um erro de compilação, entretanto
se você digitar 0 como divisor, o código irá parar de funcionar, e irá mostrar um erro na tela, esse erro é chamado de exceção.
Outra forma que você pode causar um erro é digitando algo que não pode ser interpretado como um número, como, por exemplo, uma letra.

Você pode até prevenir que o usuário digite 0 como divisor, mas e se o usuário digitar um número muito grande? Ou um número muito pequeno?
Ocorrerá outros e outros erros de execução, e você não pode prever todos eles, e é por isso que existe o tratamento de exceções.

# Tratamento de Exceções

Uma forma que você possa prevenir o erro de execução é sempre verificando o input do usuario, mas isso pode ser muito trabalhoso, e é por isso que existe o tratamento de exceções.

O tratamento de exceções é uma forma de você tratar o erro, e não deixar que o seu código pare de funcionar, e para isso, você pode usar o try, catch e finally.

Primeiro vamos analisar entender como que surge uma exceção.

Vamos supor que você tenha um código que se uma condição ocorrer significa que algo deu errado.

Como você poderia fazer informar o erro? Você poderia informar no console o erro, ou senão, você poderia "informar" que algo deu errado para o método que utiliza do seu código.
Uma forma de você enviar essa informação é lançando uma exceção. 

Para lançar uma exceção você pode usar a palavra-chave throw (que significa lançar).

```java
public class Exemplo {

	public void metodoQueLancaExcecao() {
                ... // Suponha que tenha um código aqui
		if (!deuTudoCerto) {
			throw new Exception("Deu tudo errado");
		}
	}
}

```

Perceba pela lógica que se o código deu tudo certo em sua execução esperada, ele nunca caíra no if
Mas caso ocorra um erro, ele fará uma nova instância de uma Exception, que é um Objeto em java que representa uma exceção.
E sobre a palavra `throw`?

A palavra `throw` você pode interpretar que a instância de uma exceção está sendo lançada para o método que está utilizando o seu código.
Ou em outras palavras que a exceção está sendo criada no método que está utilizando o seu código.

```java
public class Main{
	
    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        exemplo.metodoQueLancaExcecao();
        System.out.println("Ocorreu um erro");
    }
	
}
    
```

Ou seja, a instância que o método `metodoQueLancaExcecao()` criou, está sendo lançada para o método `main()`, e por isso, o método `main()` irá parar de funcionar.

Mas e se você quiser que o método `main()` continue funcionando? É aí que entra o try, catch e finally.

Basicamente o try é um bloco de código que segue uma lógica, se o código dentro do corpo do try, 
instancie uma exceção, ele irá parar e rodar o código do catch, por fim irá rodar o código do finally.

Primeiro vamos ver o código do try e do catch.

```java
public class Main{
	
    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        try {
            exemplo.metodoQueLancaExcecao();
        }catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }
        System.out.println("O código continua funcionando");
    }
	
}
    
```

Se o método `metodoQueLancaExcecao()` instanciar uma exceção, o código irá parar de funcionar, e irá rodar o código do catch.
Caso contrario o código irá continuar funcionando normalmente.

Mas perceba o seguinte, no bloco catch ele espera um parâmetro, esse parâmetro é o tipo de instância que você quer que ele capture.

No caso, o tipo de instância que o método `metodoQueLancaExcecao()` cria é uma instância de Exception, e por isso, o catch espera um parâmetro do tipo Exception.
Ainda olhando o bloco catch perceba que nos parâmetros, especificamos o tipo de exceção que queremos capturar, e colocamos um nome para essa instância, no caso, o nome é `e`.
Essa instância é uma instância que representa a exceção que foi lançada, e por isso, podemos usar ela para obter informações sobre a exceção.

Mas e se você quiser capturar mais de um tipo de exceção? Você pode fazer isso usando o operador `|` (ou). 
Ou adicionando outro bloco catch, e especificando o tipo de exceção que você quer capturar.

E em java a classe Exception é a classe mãe de todas as exceções, ou seja, todas as exceções são filhas da classe Exception, e por isso, se você especificar que quer capturar uma instância de Exception, você irá capturar todas as exceções.

Desta forma você pode especificar oque seu código deva fazer caso ocorra uma exceção, e por isso, o seu código não irá parar de funcionar.

Mas e se você quiser que o seu código execute um código independente se ocorrer uma exceção ou não? É aí que entra o finally.

O finally é um bloco de código que sempre será executado, independente se ocorrer uma exceção ou não.

```java
public class Main{
    
    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        try {
            exemplo.metodoQueLancaExcecao();
        }catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }finally {
            System.out.println("O código continua funcionando");
        }
    }
    
}
    
```

Por fim, existe uma variante do código do try, catch e finally, que é o try-with-resources.

Para não aprofundar muito por agora, existem classes responsáveis por fazer uma comunicação externa ao código
Por exemplo, uma classe que faz uma conexão com um banco de dados, ou uma classe que faz uma conexão com um arquivo.

Quando essas classes são instânciadas elas fazem uma conexão com o banco de dados, ou com o arquivo, e por isso, elas precisam ser fechadas.
E essas classes com esse funcionamento implementam a interface AutoCloseable ou Closable, que inclui o método close().

E o try-with-resources é uma forma de você instanciar essas classes, e o java automaticamente irá fechar essas classes, sem você precisar chamar o método close().
Veja como ficaria antes do try-with-resources.

```java
public class Main{
    
    public static void main(String[] args) {
        try {
            Exemplo exemplo = new Exemplo();
            exemplo.metodoQueLancaExcecao();
        }catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }finally {
            exemplo.close();
            System.out.println("O código continua funcionando");
        }
    }
    
}
    
```

Com o try-with-resources ficaria assim.

```java
public class Main{
    
    public static void main(String[] args) {
        try (Exemplo exemplo = new Exemplo()) { // Caso exemplo implemente a interface AutoCloseable ou Closeable
            exemplo.metodoQueLancaExcecao();
        }catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }finally {
            System.out.println("O código continua funcionando");
        }
    }
    
}
    
```

Neste caso a chamada do método close() é feita automaticamente pelo java, e por isso, você não precisa chamar o método close().