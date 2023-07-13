package dev.joaoguilherme.setimaaula.personagens_com_heranca;

import dev.joaoguilherme.setimaaula.Personagem;

public class Ladino2 extends Personagem {

    public Ladino2(String nomeDoGuerreiro) {
        //A palavra super é usada para chamar o construtor da classe pai
        //Ou seja, para instanciar uma classe filha, é necessário instanciar a classe pai primeiro
        super(nomeDoGuerreiro, 10, 10, 10, 100);
    }

}
