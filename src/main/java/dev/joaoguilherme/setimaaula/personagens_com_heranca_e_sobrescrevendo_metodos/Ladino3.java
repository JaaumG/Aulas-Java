package dev.joaoguilherme.setimaaula.personagens_com_heranca_e_sobrescrevendo_metodos;

import dev.joaoguilherme.setimaaula.Personagem;

public class Ladino3 extends Personagem {

    public Ladino3(String nomeDoGuerreiro) {
        //A palavra super é usada para chamar o construtor da classe pai
        //Ou seja, para instanciar uma classe filha, é necessário instanciar a classe pai primeiro
        super(nomeDoGuerreiro, 10, 10, 10, 100);
    }

    @Override //Anotação que indica que o método abaixo sobrescreve um método da classe pai
    public void imprimirCaracteristicas(){ //Para sobrescrever um método da classe pai, é necessário que o método tenha a mesma assinatura (visibilidade, tipo de retorno, nome e parâmetros)
        System.out.println("Me chamo " + getNome() + " e sou um ladino.");
        System.out.println("Sou capaz de me esconder nas sombras e atacar meus inimigos pelas costas.");
    }
}
