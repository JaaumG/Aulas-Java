package dev.joaoguilherme.setimaaula;

import dev.joaoguilherme.setimaaula.personagens.Arqueiro;
import dev.joaoguilherme.setimaaula.personagens.Guerreiro;
import dev.joaoguilherme.setimaaula.personagens.Ladino;
import dev.joaoguilherme.setimaaula.personagens.Mago;
import dev.joaoguilherme.setimaaula.personagens_com_heranca.Ladino2;
import dev.joaoguilherme.setimaaula.personagens_com_heranca.Mago2;
import dev.joaoguilherme.setimaaula.personagens_com_heranca_e_sobrescrevendo_metodos.Ladino3;
import dev.joaoguilherme.setimaaula.personagens_com_heranca_e_sobrescrevendo_metodos.Mago3;

public class SetimaAula {

    public static void main(String[] args) {
    /*
        Introdução a Orientação a Objetos
        Herança, Sobrescrever métodos.

        Imagine um jogo de RPG, onde temos diferentes personagens de diferentes tipos, como, por exemplo:
        um guerreiro, um mago, um arqueiro, um ladino, etc.

        Um guerreiro tem uma grande força, pouca mira, pouca inteligência e pouca agilidade.
        Já mago possui uma grande inteligência, pouca força, pouca mira e pouca agilidade.
        O arqueiro possui uma grande mira, pouca força, pouca inteligência e pouca agilidade.
        E o ladino, possui uma grande agilidade, pouca força, pouca inteligência e pouca mira.

        Perceba que apesar de diferirem possuem atributos em comum, sendo assim podemos ter um "modelo" de um personagem
        com esses atributos em comum, e dependendo do personagem que queremos criar, podemos alterar os atributos do "modelo"
        e adicionar informações especificas de cada personagem.

        Para demonstrar isso primeiro iremos ver como seria a criação de cada personagem individualmente.
     */

        Guerreiro guerreiro = new Guerreiro("Golias");
        guerreiro.imprimirCaracteristicas();


        Mago mago = new Mago("Merlin");
        mago.imprimirCaracteristicas();


        Arqueiro arqueiro = new Arqueiro("Legolas");
        arqueiro.imprimirCaracteristicas();


        Ladino ladino = new Ladino("Robin Hood");
        ladino.imprimirCaracteristicas();

        /*
        Perceba que fazer uma implementação desta forma funciona sem qualquer tipo de problema, entretanto é
        muito código repetido, que não tem necessidade de ser repetido,
        pois todos os personagens possuem os mesmos atributos.

        Uma forma para resolver isso requer aprender e entender outro pilar da orientação a objetos, a herança.

        Herança é um pilar da orientação a objetos que permite que uma classe herde atributos e métodos de outra classe.

        De forma análoga ao exemplo dado, podemos criar uma classe "pai" que servirá de modelo para as classes "filhas" estendê-la
        e assim herdar seus atributos e métodos.

        Para isso, vamos criar uma classe chamada "Personagem" que será a classe pai de todos os personagens.

        */

        Mago2 mago2 = new Mago2("Merlin");

        mago2.imprimirCaracteristicas();

        Ladino2 ladino2 = new Ladino2("Robin Hood");

        ladino2.imprimirCaracteristicas();

        /*
        Perceba que as classes filhas não possuem mais os atributos e métodos que antes tinham, pois foram herdados da classe pai.

        Mas note tambem que outra característica em comum é que todos os personagens possuem um método "imprimirCaracteristicas()",

        mas com um detalhe, cada um deles tem uma implementação levemente diferente de cada um.

        Podemos, por exemplo, definir essa característica na classe pai, e sobrescrever o método nas classes filhas.

        Ou seja, na classe pai tem um método e na classes filhas mudam essa característica para sí.
         */

        Mago3 mago3 = new Mago3("Merlin");

        mago3.imprimirCaracteristicas();

        Ladino3 ladino3 = new Ladino3("Robin Hood");

        ladino3.imprimirCaracteristicas();

        /*
        Perceba que agora temos uma implementação mais limpa e organizada, pois não temos mais código repetido.

        Vale ressaltar que a herança é uma característica muito importante da orientação a objetos.

        Entretanto, Java possui uma "limitação" uma classe só pode herdar de uma única classe simultaneamente,
        mas isso não impede que haja uma cadeia de herança, ou seja, uma classe pode herdar de outra classe que herda de outra classe,
        e assim por diante.
         */

    }
}
