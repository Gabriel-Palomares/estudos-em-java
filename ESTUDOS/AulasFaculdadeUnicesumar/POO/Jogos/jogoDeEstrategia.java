package AulasFaculdadeUnicesumar.POO.Jogos;

public class jogoDeEstrategia extends Jogo{
    private String nivelDificuldade;

    public jogoDeEstrategia(String titulo, String plataforma, double preco, String nivelDificuldade) {
        super(titulo, plataforma, preco);
        this.nivelDificuldade = nivelDificuldade;
    }

    public void exibirDetalhes(){
        System.out.println("O jogo " + getTitulo() + " esta presente na plataforma " + getPlataforma() +" e tem dificuldade " + getNivelDificuldade() + " custando " + getPreco());
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}
