package dev.joaoguilherme.nonaaula;

import dev.joaoguilherme.nonaaula.abstraction.PessoaAbstrata;

import java.util.Objects;

public class Maria extends PessoaAbstrata {

    private int idade;

    private String nome, estado, profissao;

    public Maria() {
        super("Maria", 25, "Tocantins", "Estudante");
        this.idade = 25;
        this.nome = "Maria";
        this.estado = "Tocantins";
        this.profissao = "Estudante";
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
        idade+=1;
        System.out.println("Uhuulll to fazendo " + idade + " anos.");
    }

    public String getProfissao() {
        return profissao;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Maria maria)) return false;
        return idade == maria.idade && Objects.equals(nome, maria.nome) && Objects.equals(estado, maria.estado) && Objects.equals(profissao, maria.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, nome, estado, profissao);
    }

    @Override
    public String toString() {
        return "Oi sou a maria, tenho " +idade+ " e futura advogada de Tocantins!!";
    }
}
