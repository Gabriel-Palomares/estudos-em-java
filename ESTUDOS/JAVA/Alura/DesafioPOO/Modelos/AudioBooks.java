package JAVA.Alura.DesafioPOO.Modelos;

public class AudioBooks extends Audio{
    private String autor;
    private String descricao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
