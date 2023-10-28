package uniara.sexta_aula;

public class Aluno {
    private String nome;
    private String RA;
    private double salario;

    public Aluno(String nome, String RA, double salario) {
        this.nome = nome;
        this.RA = RA;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
