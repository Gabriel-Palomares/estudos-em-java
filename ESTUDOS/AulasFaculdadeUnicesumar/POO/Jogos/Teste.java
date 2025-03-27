package AulasFaculdadeUnicesumar.POO.Jogos;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ArrayList<jogoDeEsporte>jogosEsportes = new ArrayList<>();
        ArrayList<jogoDeAcao>jogosDeAcao = new ArrayList<>();
        ArrayList<jogoDeEstrategia>jogosDeEstrategia = new ArrayList<>();
        int escolha;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                    ***************************************
                                  BEM VINDO
                    
                    ESCOLHA O TIPO DE JOGO:
                    
                    1 - Cadastrar JOGO DE AÇÃO
                    2 - Cadastrar JOGO DE ESPORTE
                    3 - Cadastrar JOGO DE ESTRATÉGIA
                    4 - Exibir todos os cadastros
                    ***************************************
                    """);
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("Qual o titulo do jogo: ");
                String titulo = scanner.next();
                System.out.println("Esta presente na plataforma: ");
                String plataforma = scanner.next();
                System.out.println("O jogo custa: ");
                double preco = scanner.nextDouble();
                System.out.println("Este jogo contem violencia: (true ou false)");
                boolean temViolencia = scanner.hasNext();

                jogosDeAcao.add(new jogoDeAcao(titulo,plataforma,preco,temViolencia));

            } else if (escolha == 2) {
                System.out.println("Qual o titulo do jogo: ");
                String titulo = scanner.next();
                System.out.println("Esta presente na plataforma: ");
                String plataforma = scanner.next();
                System.out.println("O jogo custa: ");
                double preco = scanner.nextDouble();
                System.out.println("Qual a modalidade deste jogo: ");
                String modelidade = scanner.next();

                jogosEsportes.add(new jogoDeEsporte(titulo,plataforma,preco,modelidade));

            } else if (escolha == 3) {
                System.out.println("Qual o titulo do jogo: ");
                String titulo = scanner.next();
                System.out.println("Esta presente na plataforma: ");
                String plataforma = scanner.next();
                System.out.println("O jogo custa: ");
                double preco = scanner.nextDouble();
                System.out.println("Qual a modalidade deste jogo: ");
                String nivelDificuldade = scanner.next();

                jogosDeEstrategia.add(new jogoDeEstrategia(titulo,plataforma,preco,nivelDificuldade));

            }
        }while(escolha != 4);
        for (jogoDeAcao jogoDeAcao: jogosDeAcao){
            jogoDeAcao.exibirDetalhes();
        }
        for (jogoDeEsporte jogoDeEsporte: jogosEsportes){
            jogoDeEsporte.exibirDetalhes();
        }
        for (jogoDeEstrategia jogoDeEstrategia: jogosDeEstrategia){
            jogoDeEstrategia.exibirDetalhes();
        }
    }
}

