package uniara.terceira_aula;

public class ExplicacaoEquals {
    public static void main(String[] args) {
        String f = "Sexta";

        System.out.println(f == "Sexta"); //True

        System.out.println(f.equals("Sexta"));

        //O uso do new implica numa nova alocação de memória, logo o == não funciona
        String s = new String("Sexta");

        System.out.println(f == s); //False

        System.out.println(f.equals(s)); //True

    }
}
