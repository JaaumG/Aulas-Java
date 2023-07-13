package dev.joaoguilherme.setimaaula.personagens_com_heranca_e_sobrescrevendo_metodos;

import dev.joaoguilherme.setimaaula.Personagem;

public class Guerreiro3 extends Personagem {

    public Guerreiro3(String nomeDoGuerreiro) {
        //A palavra super é usada para chamar o construtor da classe pai
        //Ou seja, para instanciar uma classe filha, é necessário instanciar a classe pai primeiro
        super(nomeDoGuerreiro, 100, 10, 10, 10);
    }


    @Override //Anotação que indica que o método abaixo sobrescreve um método da classe pai
    public void imprimirCaracteristicas(){ //Para sobrescrever um método da classe pai, é necessário que o método tenha a mesma assinatura (visibilidade, tipo de retorno, nome e parâmetros)
        System.out.println("Brrr Eu sou muito forte hahaha");
        System.out.println("Não venha tentar lutar comigo o grande " + getNome());
    }
}
