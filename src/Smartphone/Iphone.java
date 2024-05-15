package Smartphone;
import Funcionalidades.Browser;
import Funcionalidades.ReprodutorMusical;
import Funcionalidades.Telefone;

public class Iphone implements Browser, ReprodutorMusical, Telefone{

    //Telefone
    public void ligar(){
        System.out.println("Ligando.");
    }

    public void atender(){
        System.out.println("Atendendo.");
    }

    public void iniciarCorrerioVoz(){
        System.out.println("Iniciando correio de voz.");
    }

    //ReprodutorMusical
    public void tocar(){
        System.out.println("Tocando.");
    }


    public void pausar(){
        System.out.println("Pausando.");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando música.");
    }

    //Browser
    public void exibirPagina(){
        System.out.println("Exibindo página.");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }

}
