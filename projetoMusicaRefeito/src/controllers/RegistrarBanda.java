package controllers;

import modelsClasses.Avaliacao;
import modelsClasses.Banda;
import menu.MenuDeControllers;

import java.util.List;
import java.util.Scanner;

public class RegistrarBanda {
    public static Scanner sc = new Scanner(System.in);
    public void cadastrarBanda(List<Banda> listaDeBandas) {
        System.out.println("\n==== Cadastro de banda ====");
        System.out.println("Escreva o nome da banda:");
        String nomeBanda = sc.nextLine();

        System.out.println("Escreva o resumo da banda:");
        String resumo = sc.nextLine();

        System.out.println("Escreva uma avaliação para a banda:");
        int nota = sc.nextInt();

        //Avaliacao avaliacao = new Avaliacao(nota); // Criando uma nova avaliação com a nota fornecida

        Banda banda = new Banda(nomeBanda, resumo);
        //criando uma unidade/instancia da banda do tipo Banda, para poder usar o metodo de instancia 'setNome'.

        //banda.setNome(nomeBanda);
        /* Em resumo, banda é o objeto que opera em instâncias individuais e setNome() é o método que opera nesse objeto,
        * ou seja, opera em uma instância específica da classe Banda, permitindo que você defina o nome da banda para
        * essa instância específica. Isso significa que você está modificando o nome apenas para essa instância específica
        * de Banda, deixando outras instâncias de Banda inalteradas.

        * Quando um método é definido sem o static, ele é considerado um método de instância.
        * Isso significa que ele opera em instâncias individuais da classe e pode acessar e modificar os atributos
        * específicos dessa instância. Operar em "instâncias individuais", significa que os métodos podem ser chamados
        * em objetos específicos dessa classe. */

        //banda.setResumo(resumo);

        banda.adicionarNota(nota); // Adicionando a nota à lista de notas da banda
        listaDeBandas.add(banda);

        System.out.println("A banda "+ banda.getNome() + " foi registrada com sucesso.");

        sc.nextLine();
        MenuDeControllers.menuDeOpcoes(listaDeBandas);

    }
}
