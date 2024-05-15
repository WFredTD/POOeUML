package Usuário;

import java.util.Scanner;

import Smartphone.Iphone;

public class Usuário {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.println("Escreva 1 para acessar o telefone, 2 para o browser e 3 para o reprodutor musical:");
        int numb1 = scanner.nextInt();
        if (numb1 >=1 && numb1<= 3){
            switch (numb1) {
                case 1:
                    iphone.ligar();
                    iphone.atender();
                    iphone.iniciarCorrerioVoz();
                    break;
                case 2:
                    iphone.exibirPagina();
                    iphone.adicionarNovaAba();
                    iphone.atualizarPagina();
                    break;
                case 3:
                    iphone.tocar();
                    iphone.pausar();
                    iphone.selecionarMusica();
                    break;
            }   
        }else{
            System.out.println("Encerrando Iphone.");
        }
        scanner.close();
    }
}
