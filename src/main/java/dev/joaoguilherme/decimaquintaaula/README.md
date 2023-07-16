# Threads

Quando rodamos um programa, ele tem uma sequencia de execução, ou seja, ele executa uma linha de cada vez, e quando termina de executar uma linha, ele vai para a próxima. Isso é chamado de execução sequencial.

Mas em certas situações precisamos que o programa execute duas ou mais tarefas ao mesmo tempo, e é aí que entram as threads.

Threads são linhas de execuções de código.

Quando criamos um programa, ele já tem uma thread, que é a thread principal, que é a thread que executa o método main.

Para iniciar outras threads, precisamos criar uma classe que implementa a interface Runnable, e sobrescrever o método run().

```java
public class MinhaThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Olá, eu sou uma thread!");
    }
}
```

Para iniciar uma thread, precisamos criar uma instância da classe Thread, passando como parâmetro no construtor uma instância da classe que implementa a interface Runnable.

```java
public class Main {
    public static void main(String[] args) {
        MinhaThread minhaThread = new MinhaThread();
        Thread thread = new Thread(minhaThread);
        thread.start();
    }
}
```

Quando executamos o método start() da classe Thread, a thread é iniciada, e o método run() da classe que implementa a interface Runnable é executado.