package dev.joaoguilherme.sextaaula;

public class Usuario2 {

    //Perceba que todos os atributos são privados agora
    private String apelido;

    private String email;

    private String senha;

    public Usuario2(String apelidoDoUsuario, String emailDoUsuario, String senhaDoUsuario) { //O construtor do objeto
        apelido = apelidoDoUsuario;
        email = emailDoUsuario;
        senha = senhaDoUsuario;
    }


    /*
        Aqui em diante são os métodos comumente apelidados de 'Getters' e 'Setters'
        Esses métodos são para pegar um dado (get) e definir um valor (set).

     */
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return "Ei isso é privado!";
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
