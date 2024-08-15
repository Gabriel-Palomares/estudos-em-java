package POO;

public class Livros {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setTitulo("A Mina de Ouro");
        livro1.setAutor("Maria José Dupré");

        livro2.setTitulo("Harry Potter");
        livro2.setAutor("J.K.Rowling");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}
