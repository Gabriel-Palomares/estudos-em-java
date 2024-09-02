package AulasFaculdade.LinguagensETecnicasDeProgramacao;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
                11 - Descubra quanto tempo você ja viveu
                12 - Calculo de média simples de 3 inteiros
                13 - Verificação de Número Par ou Ímpar
                14 - Calculadora de Fatorial
                15 - Soma de Números até o Zero
                16 - Gerador de Calendário Mensal
                17 - Calculadora de Potências
                18 - Verificador de Número Primo
                19 - fibbonat
                20 - PI (inacabado)
                21 -
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

                if (diaDaSemana >= 2 && diaDaSemana <= 6) {
                    System.out.print("Que horas são: ");
                    int horarioDiaDeSemana = scanner.nextInt();
                    if (horarioDiaDeSemana >= 9 && horarioDiaDeSemana <= 18) {
                        System.out.println("a loja esta aberta");
                        break;
                    } else if (horarioDiaDeSemana < 9) {
                        System.out.println("a loja esta fechada, tente em algumas horas");
                        break;
                    } else {
                        System.out.println("Volte outro dia");
                    }

                } else if (diaDaSemana == 7) {
                    System.out.println("que horas são: ");
                    int horarioSabado = scanner.nextInt();
                    if (horarioSabado >= 10 && horarioSabado <= 14) {
                        System.out.println("a loja esta aberta");
                        break;
                    } else if (horarioSabado < 10) {
                        System.out.println("a loja esta fechada, tente em algumas horas");
                        break;
                    } else {
                        System.out.println("A Loja ja fechou, volte na segunda");
                    }
                } else if (diaDaSemana == 1) {
                    System.out.println("Hoje a loja não abre. Volte amanhã");
                    break;
                } else {
                    System.out.println("entrada invalida");
                    break;
                }
                break;
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
                if (media >= 7 && notaPortugues >= 5 && notaMatematica >= 5 && notaCiencias >= 5) {
                    System.out.println("Voce esta aprovado!! Parabens.");
                } else {
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

                if (Objects.equals(usuario, "admin") && Objects.equals(senha, "1234")) {
                    System.out.printf("""
                            ********************************
                            *                              *
                            *         Área de Login        *
                            *                              *
                            *      Login bem sucedido      *
                            *      Bem - Vindo: %s      *
                            *                              *
                            ********************************
                            """, usuario);
                } else if (Objects.equals(usuario, "admin") && !Objects.equals(senha, "1234")) {
                    System.out.print("""
                            *********************************
                            *                               *
                            *         Área de Login         *
                            *         Login Falhou          *
                            *        Senha Incorreta        *
                            *                               *
                            *********************************
                            """);
                } else {
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

                if (!carroAEsquerda && !carroADireita) {
                    System.out.println("É seguro atravessar");
                } else {
                    System.out.println("Não atravesse ainda");
                }
                break;

            case 11:

                System.out.print("que dia, mês e ano voce nasceu formatado em dd/mm/yyyy");
                String nascimento = scanner.next();

                DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(nascimento, formatar);

                int dia = data.getDayOfMonth();
                int mes = data.getMonthValue();
                int ano = data.getYear();

                System.out.printf("""
                       
                        Voce nasceu no
                        dia %d
                        mês %d
                        ano %d
                       
                        """, dia, mes, ano);
                LocalDate dataHoje = LocalDate.now();
                Period periodo = Period.between(data, dataHoje);

                System.out.println("""
                        o que você deseja saber:
                        1 - quantos anos ja vivi
                        2 - quantos meses ja vivi
                        3 - quantos dias ja vivi
                        """);

                int opcao11 = scanner.nextInt();

                switch (opcao11) {

                    case 1:

                        System.out.printf("%d anos de vida", periodo.getYears());
                        break;
                    case 2:
                        int mesesDeVida = (periodo.getYears() * 12) + periodo.getMonths();
                        System.out.printf("%d meses de vida", mesesDeVida);
                        break;
                    case 3:
                        double diasDeVida = ((periodo.getYears() * 12) * 30.416) + (periodo.getMonths() * 30.416) + periodo.getDays();
                        //aproximadamente 30.416 é uma média de dias que cada mês tem.
                        System.out.printf("%.1f dias de vida aproximadamente", diasDeVida);
                        break;

                    default:
                        System.out.print("entrada invalida");
                        break;
                }
                break;

            case 12:

                System.out.print("""
                    bem vindo a calculadora de média
                    Insira o primeiro valor:
                    """);
                double num1 = scanner.nextInt();
                System.out.print("Insira o proximo valor");
                double num2 = scanner.nextInt();
                System.out.print("Insira o ultimo valor");
                double num3 = scanner.nextInt();
                double mediaDos3 = ((num1 + num2 + num3) / 3);

                System.out.printf("A média dos 3 valores é %.2f", mediaDos3);
                break;

            case 13:

                System.out.println("qual numero voce deseja conferir: ");
                int numero = scanner.nextInt();
                int resto = numero % 2;

                if(resto == 0){
                    System.out.println("o numero é par");
                }else{
                    System.out.println("o numero é impar");
                }
                break;

            case 14:

                System.out.println("qual numero inteiro voce deseja saber o fatorial: ");
                int numFatorial = scanner.nextInt();
                int fatorial = 1;

                for (int i = 1; i <= numFatorial; i++){
                    fatorial *= i;
                }
                System.out.printf("fatorial de %d é igual a %d",numFatorial, fatorial );
                break;

            case 15:

                System.out.println("""
                        me informe qual valor inicial.
                        some 0 se deseja encerrar.
                        """);
                int valor = scanner.nextInt();
                int soma = 0;
                while (valor != 0){
                    soma += valor;
                    System.out.printf("""
                            insira qual valor deseja somar com o %d
                            """, soma);
                    valor = scanner.nextInt();
                }

            case 16:

                System.out.println("Não tem nada por aqui, fiquei com preguiça de fazer esse");
                break;

            case 17:

                System.out.println("""
                        Calculadora de potencia
                        me informe qual numero deseja calcular (informe sua base):
                        """);
                double numeroPotencia = scanner.nextInt();
                System.out.printf("o numero %.0f sera elevado a qual portencia: ", numeroPotencia);
                double potencia = scanner.nextInt();
                double resultado = numeroPotencia;
                double resultadoUm = 1;

                if (potencia == 0){
                    System.out.println("resultado é 1");
                    break;

                } else if (potencia == 1){
                    System.out.printf("resultado é %.0f ", numeroPotencia);
                    break;

                }else if (potencia > 1){
                    for (int i = 1; i < potencia; i++){
                        resultado *= numeroPotencia;
                    }
                    System.out.printf("resultado de %.0f elevado a %.0f é %.0f ", numeroPotencia, potencia, resultado);
                    break;
                }else{
                    if (potencia == -1){
                        resultadoUm = resultadoUm / numeroPotencia;
                        System.out.printf("%.0f elevado a %.0f é igual a %.3f", numeroPotencia, potencia, resultadoUm);
                    }else {
                        for (int i = -1; i > potencia; i--){
                           resultado *= numeroPotencia;
                        }
                        resultadoUm /= resultado;
                        System.out.printf("%.0f elevado a %.0f é igual a %.3f", numeroPotencia, potencia, resultadoUm);
                        System.out.println(1 / resultadoUm);
                    }
                }
                break;

            case 18:

                System.out.print("Bem-vindo ao verificador de numeros primos");
                System.out.print("Digite qual numero deseja verificar: ");
                int numeroPrimo = scanner.nextInt();

                int resto1 = numeroPrimo % 2;
                int resto2 = numeroPrimo % 3;
                int resto3 = numeroPrimo % 5;

                if (resto1 != 0 && resto2 != 0 && resto3 != 0) {
                    System.out.printf("%d é um numero primo", numeroPrimo);
                }else {
                    System.out.printf("%d não é um numero primo", numeroPrimo);
                }

            case 19:

                System.out.println("""
                        vamos iniciar
                        qual intervalo voce deseja fazer de fibonacci
                        """);
                int intervalo = scanner.nextInt();
                int termo1 = 0;
                int termo2 = 1;
                for (int i = 1; i < intervalo; i++){
                    int resultadoFibonacci = termo1 + termo2;

                    termo1 = termo2;
                    termo2 = resultadoFibonacci;
                    System.out.printf("""
                            %dº - %d
                            """, i, resultadoFibonacci);
                }
                break;

            case 20:

                System.out.println("""
                        Até qual numero voce deseja obter de PI:
                        """);

                for (float n = 1; n <= 16; n++){
                    System.out.println(1 / n);
                }
                break;


            default:
                System.out.print("entrada invalida");
                break;
        }



    }
}

