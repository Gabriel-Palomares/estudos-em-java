import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 4000.00;
        String nome = "GABRIEL PALOMARES";
        String tipoDeConta = "CORRENTE";
        String agencia = "00001";
        String conta = "11110";


            System.out.print("""
                    ***************************************
                                  BEM VINDO
                    
                    ESCOLHA O SERVIÇO:
                    
                    1 - VISUALIZAR DADOS
                    2 - VER SALDO
                    3 - ENVIAR VALOR
                    4 - RECEBER VALOR
                    0 - SAIR
                    ***************************************
                    
                    
                    """);
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:


                    System.out.printf("""
                            ***************************************
                            Dados do Cliente:     %s
                            Tipo de Conta:        %s
                            Agencia:              %s
                            Conta:                %s

                            ***************************************
                            
                            
                            """, nome, tipoDeConta, agencia, conta);

                    break;

                case 2:
                    System.out.printf("""
                            ***************************************
                            Dados do Cliente:     %s
                            Saldo em Conta:       R$ %.2f

                            ***************************************
                            
                            
                            """, nome, saldo);
                    break;

                case 3:
                    System.out.println("qual valor será enviado");
                    double transferencia = scanner.nextDouble();

                    if (saldo < transferencia) {
                        System.out.print("""
                                ***************************************
                                             TRANSFERENCIA

                                           SALDO INSUFICIENTE
                                ***************************************
                                
                                
                                """);

                    } else {

                        System.out.printf("""
                                *******************************************
                                      TRANSFERENCIA BEM SUCEDIDA
                                
                                EXTRATO: SALDO %.2f VALOR TRANSFERIDO %.2f
                                
                                SALDO ATUAL: %.2f
                                
                                *******************************************
                                
                                
                                """, saldo, transferencia, (saldo - transferencia));
                    }
                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();
                    break;

                case 4:
                    System.out.println("qual valor foi recebido: ");

                    double novaTransferencia = scanner.nextDouble();

                    double saldoTransferencia = novaTransferencia + saldo;

                    System.out.printf("""
                                    ***************************************
                                            EXTRATO DE TRANSFERENCIA
                                    
                                    VALOR RECEBIDO DA TRANSFERENCIA: %.2f
                                  
                                    SALDO ATUAL: %.2f
                                    
                                    ***************************************
                                    
                                    
                                    """, novaTransferencia, saldoTransferencia);

                    System.out.println("Pressione Enter para continuar...");
                    scanner.nextLine();

                    break;

                case 0:
                    break;
                default:
                    System.out.println("Comando Invalido");
                    break;
            }

        }
    }


