package dev.joaoguilherme.nonaaula.abstraction;

public abstract class PessoaAbstrata {

    private String nome;
    private int idade;
    private String residencia;

    private String profissao;

    public PessoaAbstrata(String nome, int idade, String residencia, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.residencia = residencia;
        this.profissao = profissao;
    }

    public abstract void fazerAniversario();

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

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
