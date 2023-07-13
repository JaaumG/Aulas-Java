package dev.joaoguilherme.sextaaula;

public class ContaBancaria2 {

    public int conta;
    public int agencia;
    public String cliente;
    private double saldo; //Perceba aqui o uso de private para o atributo saldo, assim limitando seu acesso a apenas esta classe em questão.

    public ContaBancaria2(int contaCliente, int agenciaCliente, String nomeCliente, float saldoCliente) {
        conta = contaCliente;
        agencia = agenciaCliente;
        cliente = nomeCliente;
        saldo = saldoCliente;
    }

    //Perceba que o acesso a este método é publico possibilitando que qualquer outro objeto o acesse
    public double sacar(double quantiaParaSacar){ //este método solicita uma quantia a ser sacada
        double quantiaParaDevolver = 0;
        if(quantiaParaSacar <= saldo){ //e verifica se tem o suficiente para sacar e descontar do saldo.
            saldo -= quantiaParaSacar; //se tiver o suficiente é retirado este valor do saldo
            quantiaParaDevolver = quantiaParaSacar; //é definido que a quantia a ser devolvida para o cliente é a mesma que a ser sacada
            return quantiaParaSacar; //por fim devolvendo esse valor ao cliente.
        }//Caso ele não tenha o saldo suficiente
        quantiaParaDevolver = saldo; //A quantia a ser devolvida para o cliente é o valor total que tem no saldo.
        saldo = 0; //O saldo é zerado.
        return quantiaParaDevolver; //E devolvido o valor total que o cliente havia na conta.
    }

    //Novamente, o acesso deste método é publico e seu retorno é void, não precisa retornar nada.
    public void depositar(double quantiaDepositada){
        saldo += quantiaDepositada; //Aqui é uma implementação mais simples, a quantia a ser depositada é adicionada ao saldo.
        //Assim de certa forma limitando a manipulação do cliente diretamente no seu saldo.
    }

    //Método publico para exibir o saldo, sem retorno.
    public void verSaldo(){
        System.out.printf("O seu saldo é de R$ %,.2f\n", saldo); //Aqui estou utilizando de formatação de string igual na linguagem C com printf
    }
}
