package dev.joaoguilherme.nonaaula;

import dev.joaoguilherme.nonaaula.abstraction.MariaAdvogada;

public class NonaAula {
    public static void main(String[] args) {
        /*
        Seguindo nossa história, jose é uma entidade bem limitada em questão de mutabilidade, perceba que o mesmo nem é
        apto a viajar, por exemplo, ele é fixo do jeito que é,
         */
        Jose jose = new Jose(); //Aqui criamos um José

        System.out.println(jose); //Aqui josé se apresenta a você (uso implícito do método toString herdado da classe Object)

        jose.fazerAniversario(); //José fez aniversário

        /*
        E assim como qualquer definição abstrata de pessoa José tem um nome idade e faz aniversário
        Mas no mundo real, não existe uma pessoa abstrata, existe a ideia e uma ideia não existe fisicamente.
        Em código não é diferente.

        Foi desenvolvido a ideia de uma pessoa abstrata na classe PessoaAbstrata, uma instância de PessoaAbstrata não pode
        existir, mas José que é uma concretização da PessoaAbstrata pode

        Descomente o código abaixo e verá ser impossível instância uma classe abstrata tal qual é PessoaAbstrata
         */

        //PessoaAbstrata pessoaAbstrata new PessoaAbstrata();

        /*
        Maria tambem é uma concretização de pessoa, logo ela obrigatóriamente tera que ter as mesmas características
        de uma pessoa.
         */
        Maria maria = new Maria(); //Declaração de uma nova Maria

        System.out.println(maria); //Maria se apresentando

        maria.fazerAniversario(); //Maria comemorando

        /*
        Mas a história continua e maria passou na prova da OAB logo ela pode implementar funcionalidades de uma advogada
        que seria advogar

        Essa é a maria apos se formar, ela como implementa as características de uma advoga, maria agora possui a capacidade
        de advogar
         */

        MariaAdvogada mariaAdvogada = new MariaAdvogada(); //Surge uma nova maria, agora ela é advogada

        System.out.println(mariaAdvogada); //Aqui a maria está se apresentando

        mariaAdvogada.advogar(jose); //Aqui maria advoga para José

        /*
        O ato de advogar, significa advogar para qualquer pessoa.
        Logo qualquer classe que seja uma concretização de uma pessoa, maria pode advogar.

         */

    }
}
