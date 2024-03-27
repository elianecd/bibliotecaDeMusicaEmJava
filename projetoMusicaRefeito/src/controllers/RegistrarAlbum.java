package controllers;

import menu.MenuDeControllers;
import modelsClasses.Album;
import modelsClasses.Banda;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class RegistrarAlbum {
    public static Scanner sc = new Scanner(System.in);
    public void cadastrarAlbum(List<Banda> listaDeBandas)
    {
        System.out.println("\n==== Cadastro de álbum ====");
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

            System.out.println("Escreva uma avaliação para o álbum:");
            int nota = sc.nextInt();

            Album album = new Album(nomeAlbum);

            album.adicionarNota(nota); // A nota do álbum é adicionada ao objeto Album.

            bandaEscolhida.adicionarAlbum(album); // O álbum criado é adicionado à lista de álbuns da banda selecionada.
            // qndo chamamos o método adicionarAlbum(album) na instância bandaEscolhida, estamos adicionando o objeto
            // album à lista de álbuns da banda selecionada.

            System.out.println("Álbum cadastrado com sucesso para a banda: " + bandaEscolhida.getNome() + ". \n");

            sc.nextLine();
            MenuDeControllers.menuDeOpcoes(listaDeBandas);
        }
    }
}
