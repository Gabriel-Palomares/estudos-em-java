package AulasFaculdadeUnicesumar.POO.Jogos.Matchmaking2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Matchmaking ---");
        System.out.println("------------------------------");

        // 1. Criando uma lista de jogadores para o teste
        List<Jogador> jogadoresDisponiveis = new ArrayList<>();

        jogadoresDisponiveis.add(new Jogador("Ana", 25));
        jogadoresDisponiveis.add(new Jogador("Bruno", 28));
        jogadoresDisponiveis.add(new Jogador("Carla", 22));
        jogadoresDisponiveis.add(new Jogador("Daniel", 30));
        jogadoresDisponiveis.add(new Jogador("Emilia", 26));
        jogadoresDisponiveis.add(new Jogador("Felipe", 29));
        jogadoresDisponiveis.add(new Jogador("Gabriel", 24));
        jogadoresDisponiveis.add(new Jogador("Helena", 27));

        System.out.println("Jogadores disponíveis: " + jogadoresDisponiveis.size());
        System.out.println("------------------------------");

        // 2. Instanciando a classe Matchmaking
        Matchmaking matchmaking = new Matchmaking();

        // 3. Testando diferentes modos de jogo

        // Teste 1: Partida de 2x2 (por exemplo, tênis de duplas ou beach tennis)
        System.out.println("\n--- Teste 1: Partida 2x2 com 4 jogadores ---");
        List<Jogador> jogadoresPara2x2 = jogadoresDisponiveis.subList(0, 4);
        List<Equipe> equipes2x2 = matchmaking.criarPartida(jogadoresPara2x2, 2);

        if (equipes2x2 != null) {
            System.out.println("Partida 2x2 criada com sucesso!");
        }

        System.out.println("------------------------------");

        // Teste 2: Partida de 4x4 (por exemplo, voleibol de quadra)
        System.out.println("\n--- Teste 2: Partida 4x4 com 8 jogadores ---");
        List<Equipe> equipes4x4 = matchmaking.criarPartida(jogadoresDisponiveis, 4);

        if (equipes4x4 != null) {
            System.out.println("Partida 4x4 criada com sucesso!");
        }

        System.out.println("------------------------------");

        // Teste 3: Tentando criar uma partida com número incompatível de jogadores
        System.out.println("\n--- Teste 3: Partida com jogadores incompatíveis ---");
        List<Jogador> jogadoresIncompativeis = new ArrayList<>();
        jogadoresIncompativeis.add(new Jogador("José", 35));
        jogadoresIncompativeis.add(new Jogador("Paula", 31));
        jogadoresIncompativeis.add(new Jogador("Ricardo", 33)); // 3 jogadores

        matchmaking.criarPartida(jogadoresIncompativeis, 2); // Tenta criar 2x2 com 3 jogadores


    }
}