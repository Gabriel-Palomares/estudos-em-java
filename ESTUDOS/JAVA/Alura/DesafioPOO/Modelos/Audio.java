package JAVA.Alura.DesafioPOO.Modelos;

public class Audio {
    private String titulo;
    private int duracaoEmMin;
    private int totalDeOuvintes;
    private int totalDeCurtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void reproduzir() {
        this.totalDeOuvintes++;
    }

    public void curtir() {
        this.totalDeCurtidas++;
    }

}