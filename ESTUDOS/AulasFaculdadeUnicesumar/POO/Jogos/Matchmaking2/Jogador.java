
public class Jogador {
        String nome;
        int numeroDeVitorias;

        public Jogador(String nome) {
            this.nome = nome;
            this.numeroDeVitorias = 0; // Começa com 0 vitórias
        }

        public String getNome() {
            return nome;
        }

        public int getNumeroDeVitorias() {
            return numeroDeVitorias;
        }

        public void adicionarVitoria() {
            this.numeroDeVitorias++;
        }
}

