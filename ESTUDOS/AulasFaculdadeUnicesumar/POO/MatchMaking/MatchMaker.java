package AulasFaculdadeUnicesumar.POO.MatchMaking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatchMaker {

    public Partida criarPartida(Esporte esporte, ModoDeJogo modo, List<Jogador>jogadoresDisponiveis){
        if ((null == jogadoresDisponiveis) || jogadoresDisponiveis.isEmpty()){
            System.out.println("Não há jogadores disponiveis para criar a partida.");
            return null;
        }
        Collections.shuffle(jogadoresDisponiveis);

        int totalJogadoresNecessarios = modo.getJogadoresPorEquipe() * 2; //para 2 equipes

        if (jogadoresDisponiveis.size() < totalJogadoresNecessarios) {
            System.out.println("Numero de jogadores Insuficiente para este modo de jogo");
            return null;
        }

        Partida novaPartida = new Partida(esporte, modo);

    // Lógica de formação das equipes
    List<Jogador> equipe1Jogadores = jogadoresDisponiveis.subList(0, modo.getJogadoresPorEquipe());
    List<Jogador> equipe2Jogadores = jogadoresDisponiveis.subList(modo.getJogadoresPorEquipe(), totalJogadoresNecessarios);

    Equipe equipe1 = new Equipe("Equipe A");
        for (Jogador j : equipe1Jogadores) {
        equipe1.adicionarMembro(j);
    }

    Equipe equipe2 = new Equipe("Equipe B");
        for (Jogador j : equipe2Jogadores) {
        equipe2.adicionarMembro(j);
    }

        novaPartida.adicionarEquipe(equipe1);
        novaPartida.adicionarEquipe(equipe2);

        return novaPartida;
}
}

