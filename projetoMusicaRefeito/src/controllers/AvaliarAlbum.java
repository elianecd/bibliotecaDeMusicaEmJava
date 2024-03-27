package controllers;

import menu.MenuDeControllers;
import modelsClasses.Album;
import modelsClasses.Banda;
import util.VerificaAlbum;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class AvaliarAlbum {

    public static Scanner sc = new Scanner(System.in);

    public void cadastroAvaliacaoDeAlbum(List<Banda> listaDeBandas)
    {
        System.out.println("\n==== Avaliação de álbum ====");
        System.out.println("Escreva o nome da banda que deseja avaliar:");
        String nomeBanda = sc.nextLine();
        //sc.nextLine();

        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(listaDeBandas, nomeBanda);

        if (bandaEscolhida == null) {
            System.out.println("Banda não encontrada.");
            sc.nextLine();
            MenuDeControllers.menuDeOpcoes(listaDeBandas);
            return;
        }

        System.out.println("Digite o nome do álbum:");
        String nomeAlbum = sc.nextLine();
        //sc.nextLine();

        Album albumEscolhido = VerificaAlbum.getAlbumPorNome(bandaEscolhida.getListaDeAlbuns(), nomeAlbum);

        if (albumEscolhido == null) {
            System.out.println("Álbum não encontrado.");
            sc.nextLine();
            MenuDeControllers.menuDeOpcoes(listaDeBandas);
            return;
        }

        System.out.println("Escreva uma avaliação para o álbum:");
        int nota = sc.nextInt();
        //sc.nextLine(); // Limpar o buffer

        albumEscolhido.adicionarNota(nota);

        System.out.println("Nota cadastrada com sucesso para o álbum " + albumEscolhido.getNome() + " da banda " + bandaEscolhida.getNome() + ".\n");
        System.out.println("Média do álbum " + albumEscolhido.getNome() + ": " + albumEscolhido.calcularMedia());

        sc.nextLine();
        MenuDeControllers.menuDeOpcoes(listaDeBandas);
    }
}
