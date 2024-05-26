import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        
        System.out.println("Por favor, digite o seu nome: ");
        conta.setNome(in.nextLine());

        System.out.println("Por favor, " + conta.getNome() + ", informe a Agência:");
        conta.setAgencia(in.nextLine());

        System.out.println("Por favor, " + conta.getNome() + ", digite o número da conta:");
        conta.setNumero(in.nextInt());

        System.out.println("Por favor, " + conta.getNome() + ", digite o saldo atual:");
        conta.setSaldo(in.nextInt());

        System.out.println(conta.toString());
    }
}
