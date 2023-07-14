package dev.joaoguilherme.oitavaaula;

import java.util.Objects;

public class AlunoComToEquals {
    private String nome;
    private int idade;
    private String matricula;

    public AlunoComToEquals(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Se o espaço de memoria for o mesmo, logo é o mesmo objeto
        if (!(o instanceof AlunoComToEquals that)) return false; //Se o objeto comparado não for uma instância de Aluno, logo não é o mesmo objeto
        return idade == that.idade && Objects.equals(nome, that.nome) && Objects.equals(matricula, that.matricula); //Por fim compara os atributos
    }

}
