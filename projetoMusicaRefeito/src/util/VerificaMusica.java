package util;

import modelsClasses.Musica;

import java.util.List;

public class VerificaMusica {
    public static Musica getMusicaPorNome(List<Musica> listaDeMusicas, String nomeMusica) {
        for (Musica musica : listaDeMusicas) {
            if (musica.getNome().equalsIgnoreCase(nomeMusica)) {
                return musica;
            }
        }
        return null; // Retorna null se a música não for encontrada
    }
}
