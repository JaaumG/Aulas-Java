package dev.joaoguilherme.oitavaaula;

public class PessoaComToString {
    private String nome;
    private int idade;

    public PessoaComToString(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Olá me chamo " + nome + " e tenho " + idade + " anos.";
    }
}
