package AulasFaculdadeUnicesumar.POO.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private int anoDePublicacao;
    private List<Autor> livros = new ArrayList<>();

    public Livro(String titulo, int anoDePublicacao){
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public List<Autor> getLivros() {
        return livros;
    }

    public void setLivros(List<Autor> livros) {
        this.livros = livros;
    }
}
