package JAVA.Alura.Calcular;

import java.util.Scanner;
//importei o scanner para usar no codigo.
public class TemperaturaConversor {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Bem vindo ao Conversor de Temperatura
                qual a conversao desejada:
                1 - Celsius -> Fahrenheit.
                2 - Fahrenheit -> Celsius
                
                """);
        //fiz um layout para o usuario selecionar qual conversão sera utilizada. neste layout usei printf ao inves de println e aspas triplas.
        int opcao = scanner.nextInt();
        //nomeei a escolha do usuario como "opcao".

        switch (opcao) {

            case 1:
                System.out.println("insira a temperatura em Celsius: ");
                double tempCPF = scanner.nextInt();
                double convertiCpF = ((tempCPF * 9/5) + 32);
                System.out.printf("a temperatura em Fahrenheit é %f ", convertiCpF);
                break;

            case 2:
                System.out.println("insira a temperatura em Fahrenheit: ");
                double tempFPC = scanner.nextInt();
                double convertiFpC = ( (tempFPC - 32) * 5/9);
                System.out.printf("a temperatura em Fahrenheit é %f ", convertiFpC);
                break;

            default:
                System.out.println("entrada invalida");
                break;
        }
    }
}