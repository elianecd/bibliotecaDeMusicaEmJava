package controllers;

import menu.MenuDeControllers;
import modelsClasses.Album;
import modelsClasses.Banda;
import util.VerificaAlbum;
import util.VerificaBanda;
import util.VerificaMusica;
import modelsClasses.Musica;

import java.util.List;
import java.util.Scanner;

public class MostrarDetalhesDaBanda {
    public static Scanner sc = new Scanner(System.in);
    public void exibirBanda(List<Banda> listaDeBandas)
    {
        System.out.println("\n==== Exibir detalhes de banda ====");
        System.out.println("Escreva o nome da banda:");
        String nomeBanda = sc.nextLine();

        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(listaDeBandas, nomeBanda);

        if (bandaEscolhida == null) {
            System.out.println("Banda não encontrada.");
            sc.nextLine();
            MenuDeControllers.menuDeOpcoes(listaDeBandas);
            return;
        }

        System.out.println(bandaEscolhida.exibirDetalhesDeBanda());

        System.out.println("Deseja exibir os álbuns desta banda? (s/n)");
        char opcAlbuns = sc.next().charAt(0);
        //sc.nextLine();

        if (opcAlbuns == 's')
        {
            System.out.println(bandaEscolhida.exibirAlbuns());

            System.out.println("Deseja exibir as músicas de um álbum desta banda? (s/n)");
            char opcMusicas = sc.next().charAt(0);
            //sc.nextLine();

            if (opcMusicas == 's')
            {
                System.out.println("Digite o nome do álbum:");
                sc.nextLine();
                String nomeAlbum = sc.nextLine();

                Album albumEscolhido = VerificaAlbum.getAlbumPorNome(bandaEscolhida.getListaDeAlbuns(), nomeAlbum);

                if (albumEscolhido != null) {
                    System.out.println(albumEscolhido.exibirMusicasDoAlbum());

                    System.out.println("Deseja exibir a ficha técnica de uma música? (s/n)");
                    char opcFichaTecnica = sc.next().charAt(0);
                    //sc.nextLine();

                    if (opcFichaTecnica == 's')
                    {
                        System.out.println("Digite o nome da música:");
                        sc.nextLine();
                        String nomeMusica = sc.nextLine();

                        Musica musicaEscolhida = VerificaMusica.getMusicaPorNome(albumEscolhido.getListaDeMusicas(), nomeMusica);

                        if (musicaEscolhida != null) {
                            System.out.println(musicaEscolhida.exibirFichaTecnica());
                            sc.nextLine();
                        } else {
                            System.out.println("Música não encontrada.");
                        }
                    }
                } else {
                    System.out.println("Álbum não encontrado.");
                }
            }
        }
        sc.nextLine();
        MenuDeControllers.menuDeOpcoes(listaDeBandas);
    }
}
