package main;
import java.util.ArrayList;
import java.util.List;

import contas.Conta;
import contas.Tipo;
import interfaces.IConta;

public class Banco {

    String nome;
    List<IConta> contas;

    Banco(String n) {
        this.nome = n;
        this.contas = new ArrayList<>();
    }

    void criarConta(Cliente c, Tipo tipoDeConta, int numero, int agencia, float saldo) {
        Conta novaConta = new Conta(agencia, numero, saldo, c, tipoDeConta); 
        c.setConta(novaConta);
        this.contas.add(novaConta);
    }

}
