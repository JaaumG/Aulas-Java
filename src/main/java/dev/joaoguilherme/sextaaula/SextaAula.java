package dev.joaoguilherme.sextaaula;

public class SextaAula {




    public static void main(String[] args) {

        /*
            Introdução a Orientação a Objetos
            Acesso a atributos e métodos, 'Getters', 'Setters' e Encapsulamento.

            Dependendo da situação, podemos ter um objeto que gostaríamos que algum atributo ou método fosse acessado
            por apenas ele mesmo ou senão, que seja acessador por um grupo de objetos, ou que qualquer um possa acessá-lo.

            Um exemplo disso seria, por exemplo, um objeto usuario que contem seu apelido, email e sua senha, é lógico que o usuario
            não gostaria que outros usuarios tivessem acesso a sua senha, então ele podemos dizer que este atributo em
            questão é algo privado ao usuario.

            Já seu apelido, por exemplo, pode ser algo de acesso publico, senão como que iriamos encontrar este usuario?

            A classe Usuario.java contém um exemplo de como definir atributos privados e públicos, a mesma está localizado no mesmo
            diretório que este arquivo.

        */


        Usuario usuario = new Usuario("John", "johndoe@email.com", "UmAsEnHaMuItOcOmPlIcAdA");
        System.out.println(usuario.apelido); //Perceba que o atributo apelido é publico, então podemos acessá-lo sem problemas
        System.out.println(usuario.email); //O mesmo vale para o atributo email

        //Já o atributo senha é privado, então não podemos acessá-lo, (des-comente a linha a baixo e sua IDE irá alertar o erro)
        // System.out.println(usuario.senha);

        /*
            Em alguns casos queremos ter um controle melhor sobre esses atributos das classes, imagine uma classe que exemplifique
            uma conta bancaria, a mesma possui um saldo em conta, esse saldo por vez o cliente dessa agência bancaria irá sacar,
            em outras vezes ira depositar.

            Mas melhor que imaginar é demonstrar, abaixo segue a instanciação de um objeto do tipo ContaBancaria
         */

        ContaBancaria contaBancaria = new ContaBancaria(12345, 6788, "João", 2000);

        /*
            Pronto temos uma conta bancaria declarada, com um saldo de 2000 R$,
            mas oque nos impede de manipular esse saldo?

            Atualmente nada, inclusive abaixo irei definir que meu saldo seja de 1.000.000,00 R$

         */

                                             //O uso do '_' não influencia em nada no funcionamento é apenas uma forma dada
         contaBancaria.saldo = 1_000_000.00; //pelas linguagens para facilitar a leitura de grande ou pequenos
                                             //valores numéricos, como é o caso.

        /*
            E mesmo que se colocássemos o saldo como private impediria o funcionamento esperado de uma conta bancaria.
            Então qual seria a solução?

            Bom, como em uma classe podemos ter métodos, poderíamos utilizar destes métodos para ter um controle melhor sobre o saldo.

            Podemos fazer uma classe no qual limite a manipulação do saldo, por exemplo, uma função depositar que requer um valor a ser
            depositado, ou uma de saque que requer um valor a ser sacado.

            Abaixo é feito essa demonstração utilizando da classe ContaBancaria2

         */

        ContaBancaria2 contaBancaria2 = new ContaBancaria2(54321, 8876, "João", 2000);

        //Perceba que o acesso direto ao saldo não é mais possível (des-comente a linha abaixo para sua IDE reportar o erro)
        //contaBancaria2.saldo;

        //Entretanto, podemos utilizar dos métodos sacar, e depositar da classe para utilizarmos do nosso saldo.

        contaBancaria2.depositar(1000); //Adicionamos 1000 R$
        contaBancaria2.verSaldo(); //Aqui podemos ver o nosso saldo.
        System.out.printf("Eu saquei %,.2f R$ de minha conta.\n", contaBancaria2.sacar(150)); //Sacando 150R$
        contaBancaria2.verSaldo(); //vendo o saldo novamente.
        System.out.printf("Eu saquei %,.2f R$ de minha conta.\n", contaBancaria2.sacar(4000)); //Tentando sacar 4000R$
        contaBancaria2.verSaldo();
    /*
        Desta forma controlamos e limitamos o uso do saldo, e perceba uma coisa, neste escopo atual, em outras palavras, oque
        você está vendo agora, é só os métodos e não vê suas implementações, ou melhor dizendo, como eles funcionam.

        Desta forma a classe ContaBancaria2 está de certa forma escondendo coisas de você, primeiro você não consegue acessar o seu
        saldo diretamente, segundo o jeito em que o seu saldo é manipulado tambem de certa forma você não sabe, (claro que se você for
        até a classe saberá), isso se trata de um dos pilares da orientação a objeto, o Encapsulamento.

        Saindo um pouco do código, pense numa pílula, aquelas com um envoltório de plástico sabe?
        Quando você toma uma pílula dessas, você sabe qual é o funcionamento dela, ela ira te curar.
        Como ela faz isso? Com o seu conteúdo interno, que está encapsulado nas capsulas de plástico dela.

        Você não tem acesso diretamente ao conteúdo, mas ele está lá, escondido de você.

        Bom voltando ao código, o encapsulamento é sempre utilizado para criar uma classe, sendo uma boa prática limitar o acesso dos
        atributos e utilizar-se de métodos do próprio objeto para obter essas informações.

        Abaixo segue o Usuario2 desenvolvido utilizando desta lógica.
     */

        Usuario2 usuario2 = new Usuario2("John", "johndoe@email.com", "MinhaSenha12345");

        System.out.println(usuario2.getApelido());
        usuario2.setApelido("João");
        System.out.println(usuario2.getApelido());

        System.out.println(usuario2.getSenha());

    }
}
