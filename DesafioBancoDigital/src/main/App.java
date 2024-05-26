package main;

import contas.Tipo;

public class App {
    
    public static void main(String[] args) {
     
        Banco banco = new Banco("Santander");

        Cliente pedro = new Cliente("Pedro");
        Cliente marcos = new Cliente("Marcos");
        Cliente paula = new Cliente("Paula");
        Cliente diego = new Cliente("Diego");

        banco.criarConta(pedro, Tipo.CORRENTE, 0, 0, 0);
        banco.criarConta(marcos, Tipo.POUPANCA, 1, 1, 2000);
        banco.criarConta(paula, Tipo.CORRENTE, 2, 2, 0);
        banco.criarConta(diego, Tipo.POUPANCA, 3, 3, 0);


        pedro.sacar(1000);
        pedro.depositar(1000);
        pedro.transferir(marcos, 1000);
        pedro.verTransferencias();

        pedro.transferir(paula, 2000);
        pedro.transferir(paula, 1000);
        pedro.verTransferencias();
        paula.verTransferencias();

        marcos.transferir(diego, 2000);
        marcos.verTransferencias();

        paula.verSaldo();
        marcos.verSaldo();
        pedro.verSaldo();
        diego.verSaldo();
    }
}
