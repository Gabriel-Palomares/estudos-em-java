package AulasFaculdadeUnicesumar.POO.Mercado;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Carrinho {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int escolha;
        do {
            System.out.println("""
                     ***************************************
                                  BEM VINDO
                    
                    ESCOLHA O SERVIÇO:
                    
                    1 - Cadastrar Produto
                    2 - Remover produto pela ID
                    3 - Exibir Cadastros
                    4 - Buscar produto pelo nome
                    5 - Calcular total dos produtos
                    ***************************************
                    """);
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("qual o nome do produto: ");
                String nome = scanner.next();
                System.out.println("qual a id: ");
                int id = scanner.nextInt();
                System.out.println("qual o preço: ");
                double preco = scanner.nextDouble();
                lista.add(new Produto(nome, id, preco));

            } else if (escolha == 2) {
                int i = 0;
                System.out.println("qual produto deseja encontrar pelo id: ");
                int buscaId = scanner.nextInt();
                for (Produto produto:lista){
                    i++;
                    if (produto.getId() == (buscaId)){
                        produto.exibir();
                        System.out.println("Deseja excluir mesmo este produto sim ou não: ");
                        String excluir = scanner.next();
                        if (excluir.toUpperCase(Locale.ROOT).equals("SIM")){
                            lista.remove(i);
                        }else {
                            System.out.println("operação cancelada");
                        }
                    }else {
                        System.out.println("Produto não encontrado");
                    }
                }
            } else if (escolha == 3) {
                for(Produto produto:lista){
                    produto.exibir();
                }
            } else if (escolha == 4) {
                System.out.println("qual produto deseja encontrar pelo nome: ");
                String nomeProduto = scanner.next();
                for (Produto produto:lista){
                    if (produto.getNome().toUpperCase(Locale.ROOT).equals(nomeProduto.toUpperCase())){
                        produto.exibir();
                    }else {
                        System.out.println("Produto não encontrado");
                    }
                }
            }
        }while(escolha != 5);
        for (Produto produto:lista){
            total += produto.getPreco();
        }
        System.out.println("A soma de seus produtos é de: " + total + "reais");
    }



    }



