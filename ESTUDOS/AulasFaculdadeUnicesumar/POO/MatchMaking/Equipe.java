package AulasFaculdadeUnicesumar.POO.MatchMaking;


import java.util.ArrayList;

public class Equipe {
    String nome;
    ArrayList <Jogador> membros;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Jogador> getMembros() {
        return membros;
    }

    public void adicionarMembro(Jogador jogador){
        if (jogador != null){
            this.membros.add(jogador);
        }
    }
}
