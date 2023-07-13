package dev.joaoguilherme.sextaaula;

public class Usuario {

    public String apelido; //O uso da palavra "public" que você ja deve ter notado anteriormente, implica que o atributo, método
                           //ou classe pode ser acessado por outros Objetos
    public String email;

    private String senha;  //Já a palavra "private" limita o acesso a apenas este objeto.

    public Usuario(String apelidoDoUsuario, String emailDoUsuario, String senhaDoUsuario) { //O construtor do objeto
        apelido = apelidoDoUsuario;
        email = emailDoUsuario;
        senha = senhaDoUsuario;
    }
}
