package br.com.ada.filmes.model;


public class Filme {

    private int id;

    private String titulo;

    private String genero;

    private int minutos;

    private String sinopse;

    private double imdb;

    private String imagem;

    private int like;

    private int dislike;


    public Filme() {
    }

    public Filme(int id, String titulo, String genero, int minutos, String sinopse, double imdb, String imagem, int like, int dislike) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.minutos = minutos;
        this.sinopse = sinopse;
        this.imdb = imdb;
        this.imagem = imagem;
        this.like = like;
        this.dislike = dislike;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getImdb() {
        return imdb;
    }

    public void setImdb(double imdb) {
        this.imdb = imdb;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getLike() {
        return like;
    }

    public void setLike() {
       this.like++;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike() {
        this.dislike++;
    }

}