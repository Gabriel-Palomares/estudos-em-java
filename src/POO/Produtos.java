package POO;

public class Produtos {
    public static void main() {

        Produto produto1 = new Produto();
        produto1.setNome("Shampoo");
        produto1.setPreco(20);

        produto1.descontoNoProduto(25);
        System.out.println("o produto " + produto1.getNome() + " e com o desconto aplicado custa " + produto1.getPreco());
    }
}
