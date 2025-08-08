package AulasFaculdadeUnicesumar.POO.MatchMaking;

public class ModoDeJogo {
    String nome;
    int jogadoresPorEquipe;

    public ModoDeJogo(String nome, int jogadoresPorEquipe) {
        this.nome = nome;
        this.jogadoresPorEquipe = jogadoresPorEquipe;
    }

    public String getNome() {
        return nome;
    }

    public int getJogadoresPorEquipe() {
        return jogadoresPorEquipe;
    }
}
