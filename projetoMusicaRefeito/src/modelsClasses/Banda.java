package modelsClasses;

import java.util.ArrayList;
import java.util.List;

public class Banda {
    private String nome;
    private List<Album> listaDeAlbuns = new ArrayList<>();
    private List<Avaliacao> listaDeNotas = new ArrayList<>();
    private String resumo;


    //-------- CONSTRUTORES ---------
    public Banda(String nome) { //isso aqui será para pesquisar as bandas registradas
        this.nome = nome;
    } // para ser usado ao mostrar as bandas registradas

    public Banda(String nome, String resumo) {
        this.nome = nome;
        this.resumo = resumo;
    }

    //-------- GETTERS AND SETTERS ---------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }


    public List<Avaliacao> getListaDeNotas() {
        return listaDeNotas;
    }
    public void setListaDeNotas(List<Avaliacao> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }


    public List<Album> getListaDeAlbuns() {
        return listaDeAlbuns;
    }
    public void setListaDeAlbuns(List<Album> listaDeAlbuns) {
        this.listaDeAlbuns = listaDeAlbuns;
    }


    //-------- MÉTODOS ---------
    public void adicionarNota(int nota)
    {
        Avaliacao avaliacao = new Avaliacao(nota);
        listaDeNotas.add(avaliacao);
    }

    public void adicionarAlbum(Album album)
    {
        listaDeAlbuns.add(album);
    }

    public double calcularMedia()
    {
        if (listaDeNotas.isEmpty()) {
            return 0.0; // Retorna 0 se não houver avaliações
        }

        int soma = 0;
        for (Avaliacao avaliacao : listaDeNotas) {
            soma += avaliacao.getNota(); // Soma as notas das avaliações
        }

        return (double) soma / listaDeNotas.size(); // Calcula a média
    }

    public String exibirAlbuns() {
        StringBuilder builder = new StringBuilder();
        builder.append("Álbuns da Banda ").append(nome).append(":\n");

        for (Album album : listaDeAlbuns) {
            builder.append("Nome do Álbum: ").append(album.getNome()).append(".\n");
            builder.append("Duração Total: ").append(album.exibirDuracaoTotal()).append(" segundos.\n");
            builder.append("Média de Avaliação: ").append(album.calcularMedia()).append(".\n\n");
        }
        return builder.toString();
    }

    public String exibirDetalhesDeBanda() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Detalhes da Banda ").append(nome).append(":\n");
        detalhes.append("Resumo: ").append(resumo).append(".\n");
        detalhes.append("Avaliação Média: ").append(calcularMedia()).append(".\n\n");

        return detalhes.toString();
    }


}
