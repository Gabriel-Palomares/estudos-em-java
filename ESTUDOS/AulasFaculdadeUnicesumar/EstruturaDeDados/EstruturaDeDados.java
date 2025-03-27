package AulasFaculdadeUnicesumar.EstruturaDeDados;

public class EstruturaDeDados extends Teste {
    private int[] pilha;
    private int dadosInseridos;
    private int topo;

    public EstruturaDeDados(int tam) {
        this.pilha = new int[tam];
        this.dadosInseridos = 0;
        this.topo = -1;
    }
    public void getDadosInseridos(){
        System.out.println("Atualmente tem " + this.dadosInseridos + "dados inseridos");
    }

    public void topo(){
        System.out.println("O topo é: " + this.pilha[topo]);
    }

    public boolean estaVazia(){
        if (this.dadosInseridos == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean estaCheia(){
        if (dadosInseridos >= pilha.length){
            System.out.println("Esta pilha esta cheia");
        }
        return false;
    }

    public void empilhar(int valor){
        if (estaCheia()){
            System.out.println("Esta pilha esta cheia");
            return;
        }
        this.pilha[topo+1] = valor;
        this.dadosInseridos++;
        this.topo++;
    }

    public int desempilhar(){
        if (estaVazia()){
            System.out.println("a pilha esta vazia");
            return this.pilha[topo];
        }
        int retorno = this.pilha[topo];
        this.topo--;
        this.dadosInseridos--;
        return retorno;
    }

}
