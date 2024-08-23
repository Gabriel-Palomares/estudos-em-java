package AulasFaculdade.LinguagensETecnicasDeProgramacao;


import java.util.Objects;
import java.util.Scanner;

public class ExerciciosAplicadosEmSala {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                qual exercicio você deseja resolver:
                1 - exercicio Cálculo de Combustível
                2 - exercicio Conversão de Celsius para Fahrenheit e Conversão de Fahrenheit para Celsius
                3 - exercicio Cálculo do Volume de uma Lata de Óleo
                4 - exercicio Troca de Valores entre Variáveis
                5 - exercicio Operações de Adição e Multiplicação
                6 - Maioridade e Habilitação
                7 - Verificação de Horário de Funcionamento
                8 - Análise de Notas
                9 - Verificação de Login
                10 - Controle de Tráfego
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
                            double tempCPF = scanner.nextInt();
                            double conversorCpF = ((tempCPF * 9 / 5) + 32);
                            System.out.printf("A temperatura em Fahrenheit é %.1f", conversorCpF);
                            break;

                        case 2:

                            System.out.print("insira a temperatura em Fahrenheit: ");
                            double tempFPC = scanner.nextInt();
                            double conversorFpC = ((tempFPC - 32) * 5 / 9);
                            System.out.printf("A temperatura em Celsius é %.1f ", conversorFpC);
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
                    System.out.printf("valor 1 = %d, valor 2 = %d ", valor1, valor2);
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
                    System.out.print("insira o valor D: ");
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

                case 6:

                    System.out.print("Digite sua idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Você possui carteira de motorista válida? (sim/não): ");
                    String possuiCarteira = scanner.nextLine();
                    if (idade >= 18 && possuiCarteira.equalsIgnoreCase("sim")) {
                        System.out.println("Você está apto a dirigir");
                    } else {
                        System.out.println("Você não está apto a dirigir");
                    }
                    scanner.close();
                    break;


                case 7:

                    System.out.print("Em que dia da semana estamos ");
                    int diaDaSemana = scanner.nextInt();

                    if(diaDaSemana >= 2 && diaDaSemana <= 6){
                        System.out.print("Que horas são: ");
                        int horarioDiaDeSemana = scanner.nextInt();
                        if (horarioDiaDeSemana >= 9 && horarioDiaDeSemana <= 18){
                            System.out.println("a loja esta aberta");
                            break;
                        } else if (horarioDiaDeSemana < 9){
                            System.out.println("a loja esta fechada, tente em algumas horas");
                            break;
                        } else {
                            System.out.println("Volte outro dia");
                        }

                    }else if (diaDaSemana == 7) {
                        System.out.println("que horas são: ");
                        int horarioSabado = scanner.nextInt();
                        if (horarioSabado >=10 && horarioSabado <= 14){
                            System.out.println("a loja esta aberta");
                            break;
                        }else if (horarioSabado < 10){
                            System.out.println("a loja esta fechada, tente em algumas horas");
                            break;
                        }else {
                            System.out.println("A Loja ja fechou, volte na segunda");
                        }
                    }else if (diaDaSemana == 1){
                        System.out.println("Hoje a loja não abre. Volte amanhã");
                        break;
                    }else {
                        System.out.println("entrada invalida");
                        break;
                    }


                case 8:

                    System.out.print("""
                            Bem vindo.
                            Vamos checar o status do seu periodo.
                            Insira sua nota de Matematica:
                            """);
                    double notaMatematica = scanner.nextDouble();
                    System.out.print("insira sua nota de Portugues: ");
                    double notaPortugues = scanner.nextDouble();
                    System.out.print("insira sua nota de Ciencias: ");
                    double notaCiencias = scanner.nextDouble();
                    double media = (notaMatematica + notaPortugues + notaCiencias) / 3;
                    if (media >= 7 && notaPortugues >= 5 && notaMatematica >= 5 && notaCiencias >=5){
                        System.out.println("Voce esta aprovado!! Parabens.");
                    }else {
                        System.out.println("Reprovado");
                    }
                    break;

                case 9:

                //usuario e senha cadastrado por padrao: admin e 1234 respectivamente;

                    System.out.print("""
                            ********************************
                            *                              *
                            *         Área de Login        *
                            *                              *
                            *  Usuário:                    *
                            *  Senha:                      *
                            *                              *
                            *     [ Login ]    [ Sair ]    *
                            *                              *
                            ********************************
                            """);

                    String usuario = scanner.next();
                    System.out.printf("""
                            ********************************
                            *
                            *         Área de Login
                            *
                            *  Usuário: %s
                            *  Senha:
                            *
                            *     [ Login ]    [ Sair ]
                            *
                            ********************************
                            """, usuario);
                    String senha = scanner.next();

                    if (Objects.equals(usuario, "admin") && Objects.equals(senha, "1234")){
                        System.out.printf("""
                            ********************************
                            *                              *
                            *         Área de Login        *
                            *                              *
                            *      Login bem sucedido      *
                            *        Bem - Vindo: %s       *
                            *                              *
                            ********************************
                            """, usuario);
                    }else if (Objects.equals(usuario, "admin") && !Objects.equals(senha, "1234")){
                        System.out.print("""
                            *********************************
                            *                               *
                            *         Área de Login         *
                            *         Login Falhou          *
                            *        Senha Incorreta        *
                            *                               *
                            *********************************
                            """);
                    }else{
                        System.out.print("""
                            ********************************
                            *                              *
                            *        Área de Login         *
                            *         Login Falhou         *
                            *      Usuario Inexistente     *
                            *                              *
                            ********************************
                            """);

                    }
                    break;
                case 10:

                    System.out.print("""
                            Vamos atravessar a rua em segurança
                            responda true para sim.
                            responda false para não.
                            tem algum carro vindo a direita
                            """);
                    boolean carroADireita = scanner.nextBoolean();
                    System.out.println("tem algum carro vindo a esquerda ");
                    boolean carroAEsquerda = scanner.nextBoolean();

                    if (!carroAEsquerda && !carroADireita){
                        System.out.println("É seguro atravessar");
                    }else {
                        System.out.println("Não atravesse ainda");
                    }
                    break;

            default:
                System.out.print("entrada invalida");
                break;
        }
    }
}
