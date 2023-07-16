package dev.joaoguilherme.decimaquintaaula;

public class DecimaQuintaAula {

	public static void main(String[] args) {
		/*
		Threads são processos que podem ser executados em paralelo, ou seja, ao mesmo tempo.
		Para criar uma thread, é necessário implementar a interface Runnable e sobrescrever o método run().
		Para iniciar a thread, é necessário instanciar um objeto do tipo Thread e passar como parâmetro um objeto
		do tipo Runnable.

		A classe MinhaThread implementa o Runnable e sobrescreve o método run().
		contando e imprimindo seu nome e o valor de i. indo de 0 a 1.000.000.
		 */
		//Instanciando novas threads
		Thread thread1 = new Thread(new MinhaThread("Thread 1"));
		Thread thread2 = new Thread(new MinhaThread("Thread 2"));
		Thread thread3 = new Thread(new MinhaThread("Thread 3"));
		Thread thread4 = new Thread(new MinhaThread("Thread 4"));

		//Inicio das threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		//Observe que a execução das threads é aleatória

	}
}
