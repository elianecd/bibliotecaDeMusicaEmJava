package menu;

import controllers.*;
import modelsClasses.Banda;

import java.util.List;
import java.util.Scanner;

public class MenuDeControllers {
    public static Scanner sc = new Scanner(System.in);
    public static void menuDeOpcoes(List<Banda> listaDeBandas)
    {

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Registrar uma banda");
        System.out.println("2 - Registrar um álbum");
        System.out.println("3 - Registrar uma música");
        System.out.println("4 - Exibir bandas registradas");
        System.out.println("5 - Exibir detalhes de uma banda");
        System.out.println("6 - Avaliar uma banda");
        System.out.println("7 - Avaliar um álbum");
        System.out.println("0 - Sair do sistema\n");

        int opcao = sc.nextInt();
        sc.nextLine();

        opcaoEscolhida(opcao, listaDeBandas);
    }
    public static void opcaoEscolhida(int opcao, List<Banda> listaDeBandas)
    {
        switch (opcao)
        {
            case 1:
                RegistrarBanda registrarBanda = new RegistrarBanda();
                registrarBanda.cadastrarBanda(listaDeBandas);
                break;

            case 2:
                RegistrarAlbum registrarAlbum = new RegistrarAlbum();
                registrarAlbum.cadastrarAlbum(listaDeBandas);
                break;

            case 3:
                RegistrarMusica registrarMusica = new RegistrarMusica();
                registrarMusica.cadastrarMusica(listaDeBandas);
                break;
            case 4:
                MostrarBandasRegistradas mostrarBandasRegistradas = new MostrarBandasRegistradas();
                mostrarBandasRegistradas.exibirBandas(listaDeBandas);
                break;
            case 5:
                MostrarDetalhesDaBanda mostrarDetalhesDaBanda = new MostrarDetalhesDaBanda();
                mostrarDetalhesDaBanda.exibirBanda(listaDeBandas);
                break;
            case 6:
                AvaliarBanda avaliarBanda = new AvaliarBanda();
                avaliarBanda.cadastroAvaliacaoDeBanda(listaDeBandas);
                break;
            case 7:
                AvaliarAlbum avaliarAlbum = new AvaliarAlbum();
                avaliarAlbum.cadastroAvaliacaoDeAlbum(listaDeBandas);
                break;
            case 0:
                SairDoSistema sairDoSistema = new SairDoSistema();
                sairDoSistema.sair();
        }
    }
}
