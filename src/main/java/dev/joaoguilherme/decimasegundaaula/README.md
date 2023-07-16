# Informações complementares de Java

Aqui é uma coletânea de informações complementares de Java, que não foram abordadas nas aulas.

## Protected

O modificador de acesso `protected` é um modificador de acesso que permite que o atributo ou método seja acessado por classes do mesmo pacote ou por classes que herdam a classe que contém o atributo ou método.
Não é tão utilizado quanto o `private` e `public`.

## For melhorado

O for melhorado é uma forma mais simples de percorrer um array ou uma lista, como no exemplo abaixo:

```java
    public class Main {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4, 5};
            for (int numero : numeros) {  // Para cada 'numero' do tipo int no array 'numeros'
                System.out.println(numero);
            }
        }
    }
```

## Métodos estáticos

Imagine a seguinte situação, você tem uma classe X que seu construtor tem N parâmetros
necessários para a criação de um objeto, porém você quer utilizar de um método desta classe X
que não necessita destes parâmetros, em outras palavras, sua funcionalidade não depende
do objeto criado, apenas da classe. 

Você pode criar um método estático, que é um método que não necessita de um objeto para ser
chamado, apenas da classe. 

Para criar um método estático, basta adicionar a palavra reservada `static` antes do tipo de retorno
do método, como no exemplo abaixo:

```java
public class Exemplo {
    public static void metodoEstatico() {
        System.out.println("Método estático");
    }
}
```

Para chamar um método estático, basta utilizar o nome da classe seguido de um ponto e o nome do
método, como no exemplo abaixo:

```java
public class Main {
    public static void main(Strin[] args) {
        Exemplo.metodoEstatico();
    }
}
```

Perceba que não foi necessário criar um objeto da classe Exemplo para chamar o método
Mas ainda é possível chamar um método estático através de um objeto, como no exemplo abaixo:

```java

public class Main {
    public static void main(Strin[] args) {
        Exemplo exemplo = new Exemplo();
        exemplo.metodoEstatico();
    }
}
```

Ao criar seu método estático, você deve se atentar a alguns detalhes:
métodos estáticos não podem acessar atributos não estáticos, pois não há um objeto para acessar
os atributos, apenas a classe. 

Perceba que o método `main` é um método estático, quando você executa um programa Java, você não
cria um objeto da classe Main, você apenas executa o método `main` da classe Main, por isso ele
é estático.


## Final

Em algumas situações, você quer que algo não altere o valor que possui, seja uma variável, um 
atributo, um método ou uma classe. Para isso, você pode utilizar a palavra reservada `final`.

### Variáveis e atributos
Quando você declara uma variável como `final`, ela necessita ter um valor definido
seja na propria definição dela:

```java
final int numero = 10;
```

ou no construtor:

```java
final int numero;
public Exemplo() {
    this.numero = 10;
}
```

Após definir o valor de uma variável como `final`, você não pode alterar o valor dela, como no exemplo abaixo:

```java
final int numero = 10;
numero = 20; // Erro
```

### Métodos

Quando você declara um método como `final`, você não pode sobrescrever ele em uma classe filha, como no exemplo abaixo:

```java
    public class Exemplo {
        public final void metodo() {
            System.out.println("Método");
        }
    }
    
    public class ExemploFilha extends Exemplo {
        @Override
        public void metodo() { // Erro
            System.out.println("Método");
        }
    }
```

### Classes

Quando você declara uma classe como `final`, você não pode extender ela, como no exemplo abaixo:

```java
    public final class Exemplo {
        public void metodo() {
            System.out.println("Método");
        }
    }

    public class ExemploFilha extends Exemplo { // Erro
        @Override
        public void metodo() {
            System.out.println("Método");
        }
    }
```


# Enums

Enum é um tipo de dado que representa um conjunto de constantes, ou seja, um conjunto de valores
que não podem ser alterados.

Para criar um enum, basta utilizar a palavra reservada `enum` seguida do nome do enum e dos valores

```java
    public enum DiasDaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    }
```

Você pode utilizar um enum como tipo de dado de uma variável, como no exemplo abaixo:

```java
    public class Exemplo {
        public DiasDaSemana dia;
    }
```

E tambem definir um valor ao Enum, como no exemplo abaixo:

```java
    public enum DiasDaSemana {
        SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
        DiasDaSemana(int valor) {
            this.valor = valor;
        }
        private int valor;
    }
```

Neste caso você deve criar um construtor para o Enum e definir o valor de cada constante.

Você pode acessar o valor de uma constante do Enum, como no exemplo abaixo:

```java
    public class Exemplo {
        public DiasDaSemana dia;
        public int valor;
        public Exemplo() {
            this.dia = DiasDaSemana.SEGUNDA;
            this.valor = this.dia.valor;
        }
    }
```

## Generics

Generics é um recurso que permite que você crie classes, interfaces e métodos que possam ser
utilizados com diferentes tipos de dados, ou seja, você pode criar uma classe que pode ser utilizada
com diferentes tipos de dados.

Para criar uma classe genérica, basta adicionar o tipo de dado entre `<>` após o nome da classe, como no exemplo abaixo:

```java
    public class Exemplo<T> {
        public T valor;
    }
```

Basicamente o atributo `valor` pode ser de qualquer tipo de dado, como no exemplo abaixo:

```java
    public class Main {
        public static void main(String[] args) {
            Exemplo<String> exemploString = new Exemplo<>();
            exemploString.valor = "String";
            Exemplo<Integer> exemploInteger = new Exemplo<>();
            exemploInteger.valor = 10;
        }
    }
```

Dependendo da sua lógica, você pode definir um limite de tipos de dados que podem ser utilizados, como no exemplo abaixo:

```java
    public class Exemplo<T extends Number> {
        public T valor;
    }
```

Neste caso, o atributo `valor` só pode ser de um tipo de dado que extenda a classe Number, como no exemplo abaixo:

```java
    public class Main {
        public static void main(String[] args) {
            Exemplo<String> exemploString = new Exemplo<>(); // Erro
            exemploString.valor = "String";
            Exemplo<Integer> exemploInteger = new Exemplo<>();
            exemploInteger.valor = 10;
        }
    }
```

Note que as estruturas de dados que envolvem uma coletânea de dados, como listas,
sets, tree e map, já são genéricas, ou seja, você pode definir o tipo de dado que será
armazenado na estrutura de dados, como no exemplo abaixo:

```java
public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("String");
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
    }
}
```

