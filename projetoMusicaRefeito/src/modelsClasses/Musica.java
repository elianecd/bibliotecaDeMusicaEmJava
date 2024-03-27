package modelsClasses;

public class Musica {
    private String nome;
    private int duracao;
    private String resumo;


    //-------- CONSTRUTORES ---------
    public Musica(String nome, String musicaResumo, int duracaoMusica) {
        this.nome = nome;
        this.duracao = duracaoMusica;
        this.resumo = musicaResumo;
    }

    public Musica(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }


    //-------- GETTERS AND SETTERS ---------

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }


    //-------- MÉTODOS ---------

    public String exibirFichaTecnica() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da música: ").append(nome).append(".\n");
        sb.append("Duração: ").append(duracao).append(" segundos.\n");
        sb.append("Resumo: ").append(resumo).append(".\n");
        return sb.toString();
    }

}
