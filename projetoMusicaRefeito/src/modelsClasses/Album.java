package modelsClasses;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private List<Musica> listaDeMusicas = new ArrayList<>();
    private List<Avaliacao> listaDeNotas = new ArrayList<>();
    private int duracaoTotal;


    //-------- CONSTRUTORES ---------
    public Album(String nome) { // também será para exibir os albuns de uma banda
        this.nome = nome;
    }


    //-------- GETTERS AND SETTERS ---------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

//    public int getDuracaoTotal() {
//        return duracaoTotal;
//    }
//    public void setDuracaoTotal(int duracaoTotal) {
//        this.duracaoTotal = duracaoTotal;
//    }


    public List<Musica> getListaDeMusicas() {
        return listaDeMusicas;
    }
    public void setListaDeMusicas(List<Musica> listaDeMusicas) {
        this.listaDeMusicas = listaDeMusicas;
    }


    //-------- MÉTODOS ---------
    public void adicionarNota(int nota)
    {
        Avaliacao avaliacao = new Avaliacao(nota);
        listaDeNotas.add(avaliacao);
    }

    public void adicionarMusica(Musica musica)
    {
        this.listaDeMusicas.add(musica);
    }

    public int exibirDuracaoTotal() {
        duracaoTotal = 0;
        for (Musica musica : listaDeMusicas) {
            duracaoTotal += musica.getDuracao();
        }
        return duracaoTotal;
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

    public String exibirMusicasDoAlbum() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de músicas do Álbum ").append(nome).append(":\n");

        for (Musica musica : listaDeMusicas) {
            sb.append("   Música: ").append(musica.getNome()).append(", Duração: ").append(musica.getDuracao()).append(" segundos.\n");
        }

        return sb.toString();
    }

}
