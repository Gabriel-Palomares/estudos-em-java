package AulasFaculdadeUnicesumar.EstruturaDeDados;

public class AulaFilaCircular {
    private int dadosInseridos;
    private int primeiro;
    private int ultimo;

    private int[] filaCircular;

    public AulaFilaCircular(int tam) {
        this.dadosInseridos = 0;
        this.primeiro = -1;
        this.ultimo = -1;
        this.filaCircular = new int[tam];
    }

    public boolean estaCheia(){
            return dadosInseridos == filaCircular.length;
    }

    public boolean estaVazia(){
        return dadosInseridos == 0;
    }

    public void inserir(int dado){
        if (estaCheia()){
            System.out.println("A fila esta cheia");
            return;
        }
        if (estaVazia()){
            this.primeiro++;
            this.ultimo++;
            this.filaCircular[ultimo] = dado;
            this.dadosInseridos++;
            return;
        }
        ultimo = ((ultimo + 1) % this.filaCircular.length);
        this.filaCircular[ultimo] = dado;
        this.dadosInseridos++;
    }

    public void exibirFilaCircular(){
        for (int i = 0; i <= this.ultimo; i++){
            System.out.println(" " + this.filaCircular[i]);
        }
        System.out.println("");
    }

    public int remover(){
        if (estaVazia()){
            System.out.println("Esta fila esta vazia");
            return Integer.MIN_VALUE;
        }
        int retorno = this.filaCircular[primeiro];
        primeiro = ((primeiro + 1) % this.filaCircular.length);
        this.dadosInseridos--;


    }
}
