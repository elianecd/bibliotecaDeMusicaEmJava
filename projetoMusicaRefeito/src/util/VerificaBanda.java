package util;

import modelsClasses.Banda;
import java.util.List;

public class VerificaBanda {
    public static Banda getBandaPorNome(List<Banda> bandas, String nomeBanda) { //retorna um objeto do tipo Banda
        for (Banda banda : bandas) { // para cada unidade Banda chamada banda na lista bandas
            if (banda.getNome().equalsIgnoreCase(nomeBanda)) {
                return banda; // Retorna a banda se encontrada na lista
            }
        }
        return null; // Retorna null se a banda não for encontrada na lista
    }
}

