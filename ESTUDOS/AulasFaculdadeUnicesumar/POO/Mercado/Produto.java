package AulasFaculdadeUnicesumar.POO.Mercado;

public class Produto extends Carrinho{
    private String nome;
    private int id;
    private double preco;

    public Produto(String nome, int id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibir(){
        System.out.println("O produto " + getNome() + " de id " + getId() + " custa: " + getPreco());
    }
}
