package util;

import modelsClasses.Album;
import modelsClasses.Banda;

import java.util.List;

public class VerificaAlbum {
    public static Album getAlbumPorNome(List<Album> listaDeAlbuns, String nomeAlbum) {
        for (Album album : listaDeAlbuns) {
            if (album.getNome().equalsIgnoreCase(nomeAlbum)) {
                return album; // Retorna o álbum se encontrado na lista de álbuns da banda
            }
        }
        return null; // Retorna null se o álbum não for encontrado na lista de álbuns da banda
    }
}
