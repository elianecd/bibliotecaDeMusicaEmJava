package controllers;

import menu.MenuDeControllers;
import modelsClasses.Album;
import modelsClasses.Avaliacao;
import modelsClasses.Banda;
import util.VerificaBanda;

import java.util.List;
import java.util.Scanner;

public class AvaliarBanda {

    public static Scanner sc = new Scanner(System.in);

    public void cadastroAvaliacaoDeBanda(List <Banda> listaDeBandas)
    {
        System.out.println("\n==== Avaliação de banda ====");
        System.out.println("Escreva o nome da banda que deseja avaliar:");
        String nomeBanda = sc.nextLine();
        //sc.nextLine();

        Banda bandaEscolhida = VerificaBanda.getBandaPorNome(listaDeBandas, nomeBanda);

        if (bandaEscolhida == null) {
            System.out.println("Banda não encontrada.");
            sc.nextLine();
            MenuDeControllers.menuDeOpcoes(listaDeBandas);
        } else {
            System.out.println("Escreva uma avaliação para a banda:");
            int nota = sc.nextInt();
            //sc.nextLine();

            Avaliacao avaliacao = new Avaliacao(nota);
            avaliacao.setNota(nota);

            bandaEscolhida.adicionarNota(avaliacao.getNota()); // A nota do álbum é adicionada ao objeto Album.

            System.out.println("Nota cadastrada com sucesso para a banda: " + bandaEscolhida.getNome() + ". \n");

            System.out.println("Média da banda " + bandaEscolhida.getNome() + ": "  + bandaEscolhida.calcularMedia());

            sc.nextLine();
            MenuDeControllers.menuDeOpcoes(listaDeBandas);
        }
    }
}
