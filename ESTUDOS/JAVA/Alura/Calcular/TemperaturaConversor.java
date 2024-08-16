package JAVA.Alura.Calcular;

import java.util.Scanner;
//importei o scanner para usar no codigo.
public class TemperaturaConversor {
    public static void main(String[] args) {
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
                int tempCPF = scanner.nextInt();

                System.out.println("a temperatura em Fahrenheit é: " + ((tempCPF * 9/5) + 32));
                break;

            case 2:
                System.out.println("insira a temperatura em Fahrenheit: ");
                int tempFPC = scanner.nextInt();

                System.out.println("a temperatura em Fahrenheit é: " + ( (tempFPC - 32) * 5/9));
                break;

            default:
                System.out.println("entrada invalida");
                break;
        }
    }
}