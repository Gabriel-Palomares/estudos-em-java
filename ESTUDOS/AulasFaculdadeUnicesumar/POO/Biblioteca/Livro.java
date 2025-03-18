package AulasFaculdadeUnicesumar.POO.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro extends Teste{
    private String titulo;
    private int anoDePublicacao;



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
    public void exibir(){
        System.out.println("O livro " + getTitulo() + " de " + getAnoDePublicacao());
    }
}
