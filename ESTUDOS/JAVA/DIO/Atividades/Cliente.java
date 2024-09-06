package JAVA.DIO.Atividades;

import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
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
                
                    ESCOLHA O SERVIÇO:
                
                    1 - VISUALIZAR DADOS
                    2 - VER SALDO
                    3 - ENVIAR VALOR
                    4 - RECEBER VALOR
                    5 -
                    0 - SAIR
                ***************************************
                """);
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    cliente1.visualizarDados();
                    break;
                case 2:
                    cliente1.verSaldo();
                    break;
                case 3:
                    System.out.print("qual valor deseja enviar: ");
                    double novoValor = scanner.nextDouble();
                    if (novoValor <= cliente1.getSaldo()){
                        cliente1.sacar(novoValor);
                    }else {
                        System.out.println("saldo insuficiente");
                    }

                    break;
                case 4:
                    System.out.print("qual valor voce recebeu: ");
                    novoValor = scanner.nextDouble();
                    cliente1.receberValor(novoValor);
                    break;
                case 0:
                    break;

            }
        }else {
            System.out.println("Senha incorreta");
        }

    }
}
