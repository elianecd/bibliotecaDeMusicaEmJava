package controllers;

import menu.MenuDeControllers;
import modelsClasses.Banda;

import java.util.List;
import java.util.Scanner;

public class MostrarBandasRegistradas {
    public static Scanner sc = new Scanner(System.in);
    public void exibirBandas(List<Banda> listaDeBandas)
    {
        System.out.println("\n==== Banda(s) cadastrada(s) ====");

        int index = 1;
        for (Banda banda : listaDeBandas)
        {
            System.out.println(index + ". Nome: " + banda.getNome());
            index++; // Incrementa o índice para a próxima banda
        }

        //sc.nextLine();
        MenuDeControllers.menuDeOpcoes(listaDeBandas);
    }
}
