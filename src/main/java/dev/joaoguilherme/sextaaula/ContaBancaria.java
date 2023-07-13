package dev.joaoguilherme.sextaaula;

public class ContaBancaria {

    public int conta;

    public int agencia;

    public String cliente;

    public double saldo; //Como estamos trabalhando com saldo é interessante utilizar de um tipo de dado capaz de lidar com valores decimais

    public ContaBancaria(int contaCliente, int agenciaCliente, String nomeCliente, float saldoCliente) {
        conta = contaCliente;
        agencia = agenciaCliente;
        cliente = nomeCliente;
        saldo = saldoCliente;
    }

}
