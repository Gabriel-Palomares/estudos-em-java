package AulasFaculdadeUnicesumar.POO.MatchMaking;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    Esporte esporte;
    ModoDeJogo modo;
    List<Equipe> equipes;

    public Partida(Esporte esporte, ModoDeJogo modo) {
        this.esporte = esporte;
        this.modo = modo;
        this.equipes = new ArrayList<>();
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public ModoDeJogo getModo() {
        return modo;
    }

    public List<Equipe> getEquipes() {
        return (List<Equipe>) equipes;
    }

    public void adicionarEquipe(Equipe equipe){
        if (equipe != null){
            this.equipes.add(equipe);
        }
    }
}
