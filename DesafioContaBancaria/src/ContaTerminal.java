public class ContaTerminal {
    
    private String agencia;
    private String nome;
    private int numero;
    private float saldo;

    public String getAgencia() {
        return agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String toString() {
        return "Olá " + this.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + 
        ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.";
    }
    
}
