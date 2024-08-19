package AulasFaculdade.LinguagensETecnicasDeProgramacao;

import java.util.Scanner;

public class ExerciciosAplicadosEmSala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                qual exercicio você deseja resolver:
                1 - exercicio Cálculo de Combustível
                2 - exercicio Conversão de Celsius para Fahrenheit e Conversão de Fahrenheit para Celsius
                3 - exercicio Cálculo do Volume de uma Lata de Óleo
                4 - exercicio Troca de Valores entre Variáveis
                5 - exercicio Operações de Adição e Multiplicação
               
                """);
        int opcao = scanner.nextInt();

        switch (opcao) {

                case 1:
                    System.out.println("Vamos calcular quantos litros foram gastos na viagem");
                    System.out.println("quantos km seu carro faz por litro: ");
                    int consumo = scanner.nextInt();
                    System.out.print("Quanto tempo durou a viagem em horas: ");
                    double tempo = scanner.nextInt();
                    System.out.print("Qual foi a velocidade média durante a viagem: ");
                    int velocidade = scanner.nextInt();

                    double distancia = tempo * velocidade;
                    double litrosGastos = (distancia / consumo);

                    System.out.printf("Voce percorreu %.1fkm e consumiu %.2fLitros de combustivel", distancia, litrosGastos);
                    break;
                case 2:
                    System.out.print("""
                            Bem vindo ao Conversor de Temperatura
                            qual a conversao desejada:
                            1 - Celsius -> Fahrenheit.
                            2 - Fahrenheit -> Celsius
                            
                            """);
                    //fiz um layout para o usuario selecionar qual conversão sera utilizada. neste layout usei printf ao inves de println e aspas triplas.
                    int opcao2 = scanner.nextInt();
                    //nomeei a escolha do usuario como "opcao".

                    switch (opcao2) {

                        case 1:
                            System.out.println("insira a temperatura em Celsius: ");
                            int tempCPF = scanner.nextInt();

                            System.out.println("a temperatura em Fahrenheit é: " + ((tempCPF * 9 / 5) + 32));
                            break;

                        case 2:
                            System.out.println("insira a temperatura em Fahrenheit: ");
                            int tempFPC = scanner.nextInt();

                            System.out.println("a temperatura em Fahrenheit é: " + ((tempFPC - 32) * 5 / 9));
                            break;

                        default:
                            System.out.println("entrada invalida");
                        break;
                    }
                break;
                case 3:
                    System.out.println("Vamos calcular o volume do objeto me passe as medidas em metros");
                    System.out.println("qual o raio do objeto: ");
                    float raio = scanner.nextFloat();
                    System.out.println("qual valor da altura do objeto: ");
                    float altura = scanner.nextFloat();
                    double volume = (3.14159 * ((raio * raio) * altura));
                    System.out.printf("o volume é igual a %.4fm³", volume);
                    break;

                case 4:
                    System.out.print("""
                            Vamos começar.
                            Quais são os valores que você deseja testar
                            Valor 1:
                            """);
                    int valor1 = scanner.nextInt();
                    System.out.print("Valor 2: ");
                    int valor2 = scanner.nextInt();
                    valor1 = valor1 + valor2;
                    valor2 = valor1 - valor2;
                    valor1 = valor1 - valor2;
                    System.out.println("prontinho os valores atribuídos foram invertidos");
                    System.out.printf("valor 1 = " + valor1 + " e o valor 2 = " + valor2);
                    break;

                case 5:
                    System.out.print("""
                            vamos começar
                            insira os 4 valores para serem feitas as operações
                            """);
                    System.out.print("insira o valor A: ");
                    int valorA = scanner.nextInt();
                    System.out.print("insira o valor B: ");
                    int valorB = scanner.nextInt();
                    System.out.print("insira o valor C: ");
                    int valorC = scanner.nextInt();
                    System.out.println("insira o valor D: ");
                    int valorD = scanner.nextInt();

                    System.out.printf("""
                            devem ser somados e multiplicados os valores de:
                            A com B = %d e %d respectivamente
                            """, valorA + valorB, valorA * valorB);
                    System.out.printf("""
                            devem ser somados e multiplicados os valores de:
                            A com C = %d e %d respectivamente
                            """, valorA + valorC, valorA * valorC);
                    System.out.printf("""
                            devem ser somados e multiplicados os valores de:
                            A com D = %d e %d respectivamente
                            """, valorA + valorD, valorA * valorD);
                    System.out.printf("""
                            devem ser somados e multiplicados os valores de:
                            B com C = %d e %d respectivamente
                            """, valorB + valorC, valorB * valorC);
                    System.out.printf("""
                            devem ser somados e multiplicados os valores de:
                            B com D = %d e %d respectivamente
                            """, valorB + valorD, valorB * valorD);
                    System.out.printf("""
                            devem ser somados e multiplicados os valores de:
                            C com D = %d e %d respectivamente
                            """, valorC + valorD, valorC * valorD);
                    break;

            default:
                System.out.print("entrada invalida");
                break;
        }


    }

}
