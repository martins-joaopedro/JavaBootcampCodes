package main;
import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDate;

import contas.Conta;

public class Transferencias {
    
    private Conta remetente;
    private Conta destinatario;
    private Float valor;
    LocalDate time;

    public Transferencias(Conta remetente, Conta destinatario, Float valor) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.valor = valor;
        this.time = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Transferencias [remetente=" + remetente.getCliente().getNome() + ", destinatario=" + destinatario.getCliente().getNome() + ", valor=" + valor 
        + " em: " + this.time + "]";
    }

}
