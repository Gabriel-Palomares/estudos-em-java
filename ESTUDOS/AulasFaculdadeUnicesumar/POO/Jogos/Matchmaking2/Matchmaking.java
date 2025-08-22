package AulasFaculdadeUnicesumar.POO.Jogos.Matchmaking2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matchmaking {

        public boolean validarJogadores(List<Jogador> jogadoresDisponiveis, int jogadoresPorEquipe) {
            if (jogadoresDisponiveis == null || jogadoresDisponiveis.size() < (jogadoresPorEquipe * 2)) {
                System.out.println("Número insuficiente de jogadores para formar pelo menos duas equipes.");
                return false;
            }

            if (jogadoresDisponiveis.size() % jogadoresPorEquipe != 0) {
                System.out.println("Número de jogadores incompatível com o tamanho da equipe.");
                return false;
            }

            return true;
        }

        /**
         * Cria uma partida para qualquer modo de jogo (nxn, nxm, etc.).
         * Retorna uma lista de equipes formadas para a partida.
         */
        public List<Equipe> criarPartida(List<Jogador> jogadoresDisponiveis, int jogadoresPorEquipe) {
            if (!validarJogadores(jogadoresDisponiveis, jogadoresPorEquipe)) {
                return null;
            }

            Collections.shuffle(jogadoresDisponiveis);

            int numeroDeEquipes = jogadoresDisponiveis.size() / jogadoresPorEquipe;
            List<Equipe> equipes = new ArrayList<>();
            int jogadorIndex = 0;

            try {
                for (int i = 0; i < numeroDeEquipes; i++) {
                    Equipe novaEquipe = new Equipe();
                    for (int j = 0; j < jogadoresPorEquipe; j++) {
                        // O controle de índice já é feito pelos loops, mas o try-catch
                        // é uma camada de segurança extra.
                        novaEquipe.adicionarMembro(jogadoresDisponiveis.get(jogadorIndex));
                        jogadorIndex++;
                    }
                    equipes.add(novaEquipe);
                }

                System.out.println("Partida criada com sucesso!");
                System.out.println("Total de equipes formadas: " + equipes.size());
                for (Equipe equipe : equipes) {
                    equipe.exibirMembros();
                }

                return equipes;

            } catch (IndexOutOfBoundsException e) {
                System.err.println("Erro ao formar equipes: Índice de jogador fora do limite. " + e.getMessage());
                return null;
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
                return null;
            }
        }
    }

