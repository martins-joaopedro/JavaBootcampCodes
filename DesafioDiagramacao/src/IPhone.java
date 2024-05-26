import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    String linha;

    IPhone(String linha) {
        this.linha = linha;
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo nova página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A Página foi atualizada!");
    }

    @Override
    public void ligar() {
        System.out.println("Iphone " + this.linha + " está ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendido!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Reproduzindo a música: " + musica);
    }

    @Override
    public void pausar(String musica) {
        System.out.println("A musica atual, " + musica + ", foi pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    
}
