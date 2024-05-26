package contas;

import java.util.ArrayList;
import java.util.List;

import exceptions.SaldoIndisponivelException;
import exceptions.TiposDiferentesException;
import interfaces.IConta;
import main.Cliente;
import main.Transferencias;

public class Conta implements IConta {
    
    private int agencia;
    private int numero;
    private float saldo; 
    private Cliente cliente;
    private Tipo tipo;
    private List<Transferencias> transferencias;

    public Conta() {}

    public Conta(int agencia, int numero, float saldo, Cliente cliente, Tipo tipo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.tipo = tipo;
        this.transferencias = new ArrayList<>();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void addTransferencia(Transferencias transferencia) {
        this.transferencias.add(transferencia);
    }

    @Override
    public void sacar(float valor) {
        try {
            if(saldo < valor)
                throw new SaldoIndisponivelException();

            this.saldo -= valor;
        } catch (SaldoIndisponivelException e) {
            System.out.println("Saldo indisponível para ser sacado.");
        }
    }

    @Override
    public void depositar(float valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestinatario, float valor) {
        try {
            if(contaDestinatario.getTipo() != tipo)
                throw new TiposDiferentesException();
            
            try {
                if(this.saldo < valor)
                    throw new SaldoIndisponivelException();
                
                contaDestinatario.depositar(valor);
                this.sacar(valor);

                Transferencias novaTransferencia = new Transferencias(this.cliente.getConta(), contaDestinatario, valor);

                this.transferencias.add(novaTransferencia);
                contaDestinatario.addTransferencia(novaTransferencia);

                System.out.println("Transferência realizada de " + contaDestinatario.getCliente().getNome() + " para " + this.cliente.getNome());

            } catch (Exception SaldoIndisponivelException) {
                System.out.println("Você não tem saldo disponível para relizar a transferência.");
            }
        } catch (Exception TiposDiferentesException) {
            System.out.println("Não é possivel transferir entre contas que não sejam do mesmo tipo.");
        }    
    }

    @Override
    public void listarSaldo() {
        System.out.println(this.saldo);
    }

    @Override
    public void listarTransferencias() {
        if(this.transferencias.isEmpty())
            System.out.println("Nenhuma transferência");
        else 
            for(Transferencias t : this.transferencias)
                System.out.println(t.toString());
    }

}
