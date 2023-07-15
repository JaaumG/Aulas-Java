package dev.joaoguilherme.nonaaula.abstraction;

import dev.joaoguilherme.nonaaula.Maria;

import java.util.Objects;

public class MariaAdvogada extends PessoaAbstrata implements Advogada {

    private int idade;

    private String nome, estado, profissao;

    public MariaAdvogada() {
        super("Maria", 26, "Tocantins", "Advogada");
        this.idade = 26;
        this.nome = "Maria";
        this.estado = "Tocantins";
        this.profissao = "Advogada";
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public void fazerAniversario() {
        idade += 1;
        System.out.println("Uhuulll to fazendo " + idade + " anos.");
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MariaAdvogada that)) return false;
        return idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(estado, that.estado) && Objects.equals(profissao, that.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, nome, estado, profissao);
    }

    @Override
    public String toString() {
        return "Olá sou a maria, tenho " + idade + " e a mais nova advogada de Tocantins, meu titulo da OAB é TO123456";
    }

    @Override
    public void advogar(PessoaAbstrata pessoa) {
        System.out.println("Eu sou a maria a advogada de " + pessoa.getNome() + " um " + pessoa.getProfissao() + " de " + pessoa.getResidencia());
    }
}