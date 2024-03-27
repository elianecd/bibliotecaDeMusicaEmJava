package controllers;

import menu.MenuDeControllers;
import modelsClasses.Album;
import modelsClasses.Banda;
import modelsClasses.Musica;
import util.VerificaAlbum;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class RegistrarMusica {

    public static Scanner sc = new Scanner(System.in);

    public void cadastrarMusica(List<Banda> listaDeBandas)
    {
        System.out.println("\n==== Cadastro de música ====");
        System.out.println("Escreva o nome da banda:");
        String nomeBanda = sc.nextLine();

        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(listaDeBandas, nomeBanda);

        if (bandaEscolhida == null) {
            System.out.println("Banda não encontrada.");
            sc.nextLine();
            MenuDeControllers.menuDeOpcoes(listaDeBandas);
        } else {
            System.out.println("Digite o nome do álbum:");
            String nomeAlbum = sc.nextLine();

            Album albumEscolhido = VerificaAlbum.getAlbumPorNome(bandaEscolhida.getListaDeAlbuns(), nomeAlbum);

            if (albumEscolhido == null) {
                System.out.println("Álbum não encontrado.");
                sc.nextLine();
                MenuDeControllers.menuDeOpcoes(listaDeBandas);
            } else {
                System.out.println("Digite o nome da música:");
                String nomeMusica = sc.nextLine();

                System.out.println("Faça uma breve descrição da música:");
                String musicaResumo = sc.nextLine();

                System.out.println("Digite a duracao da música em segundos:");
                int duracaoMusica = sc.nextInt();

                Musica musica = new Musica(nomeMusica, musicaResumo, duracaoMusica);

                albumEscolhido.adicionarMusica(musica);

                System.out.println("Música cadastrada com sucesso no álbum " + albumEscolhido.getNome() + ". \n");

                sc.nextLine();
                MenuDeControllers.menuDeOpcoes(listaDeBandas);
            }
        }
    }
}
