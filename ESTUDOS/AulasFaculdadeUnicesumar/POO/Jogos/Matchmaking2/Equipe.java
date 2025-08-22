package AulasFaculdadeUnicesumar.POO.Jogos.Matchmaking2;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
        List<Jogador> membros;

        public Equipe() {
            this.membros = new ArrayList<>();
        }

        public List<Jogador> getMembros() {
            return membros;
        }

        public void adicionarMembro(Jogador jogador) {
            // Uso de try-catch para lidar com possíveis valores nulos
            try {
                if (jogador == null) {
                    throw new IllegalArgumentException("Jogador não pode ser nulo.");
                }
                this.membros.add(jogador);
            } catch (IllegalArgumentException e) {
                System.err.println("Erro ao adicionar membro à equipe: " + e.getMessage());
            }
        }

        public void exibirMembros() {
            System.out.print("Membros da equipe: ");
            for (Jogador j : membros) {
                System.out.print(j.getNome() + " ");
            }
            System.out.println();
        }
    }

