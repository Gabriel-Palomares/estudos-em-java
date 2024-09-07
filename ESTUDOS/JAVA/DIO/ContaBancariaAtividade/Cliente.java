package JAVA.DIO.ContaBancariaAtividade;

import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    public static void main() {
        ContaBanco cliente1 = new ContaBanco();

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                ***************************************
                       BEM VINDO a Area de login

                    Insira sua agencia:
                
                    Insira numero da conta:
                
                ***************************************
                """);
        cliente1.setAgencia(scanner.next());

        System.out.printf("""
                ***************************************
                       BEM VINDO a Area de login

                    Insira sua agencia: %s
                
                    Insira numero da conta:
                
                ***************************************
                """, cliente1.getAgencia());
        cliente1.setNumero(scanner.nextInt());


        if (Objects.equals(cliente1.getAgencia(), "067-8") && cliente1.getNumero() == 1021) {
            System.out.println("""
                    ***************************************
                          Login Bem Sucedido BEM VINDO
                    
                        1 - Continuar para area do Cliente
                        0 - SAIR
                    
                    ***************************************
                    """);
            int opcao = scanner.nextInt();
            while (opcao != 0) {
                System.out.println("""
                    
                    
                    ***************************
                            BEM VINDO
                    
                        ESCOLHA O SERVIÇO:
                    
                        1 - VISUALIZAR DADOS
                        2 - VER SALDO
                        3 - ENVIAR VALOR
                        4 - RECEBER VALOR
                    
                        0 - SAIR
                    ***************************
                    """);
                int opcaoMenu = scanner.nextInt();
                double novoValor;
                switch (opcaoMenu) {
                    case 1:
                        cliente1.visualizarDados();
                        scanner.nextLine();
                        scanner.nextLine();
                        break;

                    case 2:
                        cliente1.verSaldo();
                        scanner.nextLine();
                        scanner.nextLine();
                        break;

                    case 3:
                        System.out.println("qual valor deseja enviar: ");
                        novoValor = scanner.nextDouble();
                        if (novoValor <= cliente1.getSaldo()) {
                            cliente1.sacar(novoValor);
                            scanner.nextLine();
                            scanner.nextLine();
                        } else {
                            System.out.println("saldo insuficiente");
                            scanner.nextLine();
                        }
                        break;

                    case 4:
                        System.out.println("qual valor voce recebeu: ");
                        novoValor = scanner.nextDouble();
                        cliente1.receberValor(novoValor);
                        scanner.nextLine();
                        scanner.nextLine();
                        break;

                    case 0:
                        opcao = 0;
                        break;

                    default:
                        System.out.println("opcao invalida");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;

                }
            }

        }else {
            System.out.println("Senha incorreta");
        }
    }
}