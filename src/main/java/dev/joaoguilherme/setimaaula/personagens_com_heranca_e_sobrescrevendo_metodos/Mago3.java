package dev.joaoguilherme.setimaaula.personagens_com_heranca_e_sobrescrevendo_metodos;

import dev.joaoguilherme.setimaaula.Personagem;

public class Mago3 extends Personagem {

    public Mago3(String nomeDoGuerreiro) {
        //A palavra super é usada para chamar o construtor da classe pai
        //Ou seja, para instanciar uma classe filha, é necessário instanciar a classe pai primeiro
        super(nomeDoGuerreiro, 10, 10, 100, 10);
    }

    @Override //Anotação que indica que o método abaixo sobrescreve um método da classe pai
    public void imprimirCaracteristicas(){ //Para sobrescrever um método da classe pai, é necessário que o método tenha a mesma assinatura (visibilidade, tipo de retorno, nome e parâmetros)
        System.out.println("Olá eu sou o mago " + getNome() + " sou capaz de manipular minha inteligência para criar magias!");
    }

}
