package JAVA.Alura.POO;

public class Livro {

    private String titulo;
    private String autor;

    void exibirDetalhes(){
        System.out.println("o livro " + titulo + " tem como seu autor " + autor);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
