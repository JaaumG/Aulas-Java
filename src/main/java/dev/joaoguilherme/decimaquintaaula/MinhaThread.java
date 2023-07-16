package dev.joaoguilherme.decimaquintaaula;

public class MinhaThread implements Runnable{

	private String nomeThread;

	public MinhaThread(String nomeThread) {
		this.nomeThread = nomeThread;
	}

	@Override
	public void run() {
		System.out.println("Executando a thread");
		for (int i = 0; i <= 1_000_000; i++) {
			System.out.println(nomeThread + " valor: " + i);
			try {
				Thread.currentThread().join(500); //A thread atual espera 0,5 segundos para executar a próxima iteração
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
