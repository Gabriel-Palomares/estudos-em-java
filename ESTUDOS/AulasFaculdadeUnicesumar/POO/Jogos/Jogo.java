package AulasFaculdadeUnicesumar.POO.Jogos;

public class Jogo {
    private String titulo;
    private String plataforma;
    private double preco;


    public Jogo(String titulo, String plataforma, double preco) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
