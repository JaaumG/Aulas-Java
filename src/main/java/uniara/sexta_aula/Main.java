package uniara.sexta_aula;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "05221-007", 100000.0);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getRA());
        System.out.println(aluno.getSalario());
        aluno.setSalario(200000.0);
        System.out.println(aluno.getSalario());
    }
}
