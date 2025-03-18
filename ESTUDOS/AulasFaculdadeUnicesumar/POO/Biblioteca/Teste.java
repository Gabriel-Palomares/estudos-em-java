package AulasFaculdadeUnicesumar.POO.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> lista = new ArrayList<>();
        ArrayList<Autor> listA = new ArrayList<>();
        int escolha;
        do {
            System.out.println("""
                     ***************************************
                                  BEM VINDO
                    
                    ESCOLHA O SERVIÇO:
                    
                    1 - Cadastrar Livro
                    2 - Cadastrar Autor
                    3 - Exibir Cadastros
                    ***************************************
                    """);
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("qual o nome do autor: ");
                String nome = scanner.next();
                System.out.println("qual a nacionalidade");
                String nacionalidade = scanner.next();
                listA.add(new Autor(nome, nacionalidade));

            } else if (escolha == 2) {
                System.out.println("qual o titulo do livro: ");
                String titulo = scanner.next();
                System.out.println("qual ano de publicação: ");
                int anoDePublicacao = scanner.nextInt();
                lista.add(new Livro(titulo, anoDePublicacao));
            }
        }while(escolha != 3);
        for (Autor autores:listA){
            autores.exibir();
        }
        for (Livro livros:lista){
            livros.exibir();
        }
    }

}
