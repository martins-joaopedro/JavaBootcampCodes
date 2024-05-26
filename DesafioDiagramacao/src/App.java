public class App {
    public static void main(String[] args) throws Exception {
        
        IPhone iphone = new IPhone("15 Pro max");

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        System.out.println();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();
        
        String musica = "Overcompensate - Twenty one Pilots";
        iphone.selecionarMusica(musica);
        iphone.tocar(musica);
        iphone.pausar(musica);
    }
}
