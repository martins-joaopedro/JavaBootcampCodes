package main;

import contas.Conta;

public class Cliente {
    
    private String nome;
    private Conta conta;

    Cliente(String n) {
        this.nome = n;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void transferir(Cliente cliente, float saldo) {
        this.conta.transferir(cliente.getConta(), saldo);
    }

    public void depositar(float valor) {
        this.conta.depositar(valor);
    }

    public void sacar(float valor) {
        this.conta.sacar(valor);
    }

    public void verTransferencias() {
        System.out.println("TRANSFERÊNCIAS DE: " + this.nome);
        this.conta.listarTransferencias();
    }

    public void verSaldo() {
        System.out.println("SALDO DE: " + this.nome);
        this.conta.listarSaldo();
    }
}
