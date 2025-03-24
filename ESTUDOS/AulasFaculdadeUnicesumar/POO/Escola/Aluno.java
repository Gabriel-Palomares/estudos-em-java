package AulasFaculdadeUnicesumar.POO.Escola;

public class Aluno {
    private String nome;
    private int id;
    private double media;

    public Aluno(String nome, int id, double media) {
        this.nome = nome;
        this.id = id;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    public void exibir(){
        System.out.println("O aluno "+getNome()+" de id "+getId()+" tem a media de "+getMedia());
    }
}
