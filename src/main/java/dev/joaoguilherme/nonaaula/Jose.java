package dev.joaoguilherme.nonaaula;

import dev.joaoguilherme.nonaaula.abstraction.PessoaAbstrata;

import java.util.Objects;

public class Jose extends PessoaAbstrata {

    private int idade;

    private String nome, estado, profissao;

    public Jose() {
        super("José", 43, "São Paulo", "Professor");
        this.idade = 43;
        this.nome = "José";
        this.estado = "São Paulo";
        this.profissao = "Professor";
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
    public void fazerAniversario(){
        idade += 1;
        System.out.println("Estou fazendo " + idade + " anos!!");
    }

    public String getProfissao() {
        return profissao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jose jose)) return false;
        return idade == jose.idade && Objects.equals(nome, jose.nome) && Objects.equals(estado, jose.estado) && Objects.equals(profissao, jose.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, nome, estado, profissao);
    }

    @Override
    public String toString() {
        return "Olá sou o José, tenho " +idade+ " e sou professor, resíduo no estado de São Paulo";
    }
}
