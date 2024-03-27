import menu.MenuDeControllers;
import modelsClasses.Banda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Banda> listaDeBandas = new ArrayList<>(); //criando a lista de bandas aqui para que possa sempre ser atualizada

        System.out.println("\nSeja Bem-vindo à sua Biblioteca de Músicas");

        MenuDeControllers menuDeControllers = new MenuDeControllers(); /* aqui estou instanciando o menu de controllers,
        * ou seja, estou criando um objeto da classe MenuDeControllers, para iniciar o menu e permitir que os usuários
        * interajam com o sistema através dele. Pois se eu não instanciar a minha classe, não terei acesso aos metódos,
        * atributo e funcionalidades definidos nesse menu, ou seja, não poderei usar o menu para interagir com o sistema.
        * se eu não instanciar o MenuDeControllers, não poderei exibir o menu para o usuário, e portanto não poderei
        * permitir que o usuário interaja com o sistema de forma eficaz. */

        menuDeControllers.menuDeOpcoes(listaDeBandas);
    }
}