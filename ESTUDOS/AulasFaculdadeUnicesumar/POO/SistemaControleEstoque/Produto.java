package AulasFaculdadeUnicesumar.POO.SistemaControleEstoque;

public class Produto extends Loja {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void exibirInfo(){
        System.out.println("O produto " + getNome() + " tem " + getQuantidade() + " unidades em estoque.");
    }

    public void adicionarNoEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerNoEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
