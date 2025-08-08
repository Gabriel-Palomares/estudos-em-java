package AulasFaculdadeUnicesumar.POO.MatchMaking;

import java.util.ArrayList;
import java.util.List;

public class Esporte {
    String nome;
    ArrayList <ModoDeJogo> modosDisponiveis;

    public Esporte(String nome) {
        this.nome = nome;
        this.modosDisponiveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<ModoDeJogo> getModosDisponiveis() {
        return modosDisponiveis;
    }

    public void adicionarModoDeJogo(ModoDeJogo modo){
        if (modo != null){
            this.modosDisponiveis.add(modo);
        }
    }
}
