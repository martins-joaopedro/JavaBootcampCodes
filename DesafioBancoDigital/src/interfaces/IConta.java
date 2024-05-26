package interfaces;

import contas.Conta;

public interface IConta {
    
    public void sacar(float valor);

    public void depositar(float valor);

    public void transferir(Conta conta, float valor);

    public void listarSaldo();

    public void listarTransferencias();
}
