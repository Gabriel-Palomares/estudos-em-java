package AulasFaculdadeUnicesumar.POO.Escola;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Diretoria {
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("""
                     ***************************************
                                  BEM VINDO
                    
                    ESCOLHA O SERVIÇO:
                    
                    1 - Cadastrar Aluno
                    2 - Remover aluno pela ID
                    3 - Exibir alunos
                    4 - Buscar aluno pelo nome
                    5 - Calcular média de notas
                    ***************************************
                    """);
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("qual o nome do aluno: ");
                String nome = scanner.next();
                System.out.println("qual a id: ");
                int id = scanner.nextInt();
                System.out.println("qual a média: ");
                double media = scanner.nextDouble();
                lista.add(new Aluno(nome, id, media));

            } else if (escolha == 2) {
                System.out.println("qual aluno deseja encontrar pelo id: ");
                int buscaId = scanner.nextInt();
                int indexToRemove = -1;

                for (int i = 0; i < lista.size(); i++) {
                    Aluno aluno = lista.get(i);
                    if (aluno.getId() == buscaId) {
                        aluno.exibir();
                        System.out.println("Deseja remover mesmo este aluno? (sim ou não): ");
                        String excluir = scanner.next();
                        if (Objects.equals(excluir, "sim")) {
                            indexToRemove = i;
                            System.out.println("Aluno removido");
                        } else {
                            System.out.println("Operação cancelada");
                        }
                        break;
                    }
                }

                if (indexToRemove != -1) {
                    lista.remove(indexToRemove);
                } else {
                    System.out.println("Aluno não encontrado");
                }
            } else if (escolha == 3) {
                for(Aluno aluno:lista){
                    aluno.exibir();
                }
            } else if (escolha == 4) {
                System.out.println("qual aluno deseja encontrar pelo nome: ");
                String nomeAluno = scanner.next();
                for (Aluno aluno:lista){
                    if (aluno.getNome().toUpperCase(Locale.ROOT).equals(nomeAluno.toUpperCase())){
                        aluno.exibir();
                    }else {
                        System.out.println("Aluno não encontrado");
                    }
                }
            }
        }while(escolha != 5);
        int cont = 0;
        double total = 0;
        for (Aluno aluno:lista){
            cont++;
            total += aluno.getMedia();
        }

        System.out.println("A soma de suas medias1 é de: " + total/cont);
    }
}
