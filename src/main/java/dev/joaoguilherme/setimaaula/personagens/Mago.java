package dev.joaoguilherme.setimaaula.personagens;

public class Mago {

    private String nome;
    private int forca;
    private int mira;
    private int inteligencia;
    private int agilidade;

    public Mago(String nomeDoGuerreiro) {
        nome = nomeDoGuerreiro;
        forca = 10;
        mira = 100;
        inteligencia = 10;
        agilidade = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public int getMira() {
        return mira;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void imprimirCaracteristicas(){
        System.out.println("--------------------------------------------------");
        System.out.println("Personagem: " + getNome());
        System.out.println("Força: " + getForca());
        System.out.println("Mira: " + getMira());
        System.out.println("Inteligência: " + getInteligencia());
        System.out.println("Agilidade: " + getAgilidade());
        System.out.println("--------------------------------------------------");
    }

}
