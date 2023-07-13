package dev.joaoguilherme.setimaaula;

public class Personagem {

    private String nome;
    private int forca;
    private int mira;
    private int inteligencia;
    private int agilidade;

    public Personagem(String nomeDaPersonagem, int forcaDaPersonagem, int miraDaPersonagem, int inteligenciaDaPersonagem, int agilidadeDaPersonagem) {
        nome = nomeDaPersonagem;
        forca = forcaDaPersonagem;
        mira = miraDaPersonagem;
        inteligencia = inteligenciaDaPersonagem;
        agilidade = agilidadeDaPersonagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
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
        System.out.println("Mago: " + getNome());
        System.out.println("Força: " + getForca());
        System.out.println("Mira: " + getMira());
        System.out.println("Inteligência: " + getInteligencia());
        System.out.println("Agilidade: " + getAgilidade());
        System.out.println("--------------------------------------------------");
    }

}
