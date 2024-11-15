package AulasFaculdadeUnicesumar.LinguagensETecnicasDeProgramacao;

import java.util.Scanner;

public class ExercicioParaNota2 {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        switch (exibirMenu()){
            case 1:
                System.out.println("Qual temperatura em celsius deseja converter");
                double cels = scanner.nextDouble();
                celsius(cels);
               break;
            case 2:
                System.out.println("Qual temperatura em Fahrenheit deseja converter");
                double fahr = scanner.nextDouble();
                fahrenheit(fahr);
                break;
            case 3:
                System.out.println("Qual temperatura em Kelvin deseja converter");
                double kelv = scanner.nextDouble();
                kelvin(kelv);
                break;

            default:
                System.out.println("entrada invalida selecione novamente");
                exibirMenu();
        }
    }
    public static int exibirMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                        Bem vindo ao Conversor de Temperatura
                        qual a conversao desejada:
                        1 - Celsius -> Fahrenheit
                        1 - Celsius -> Kelvin
                        2 - Fahrenheit -> Celsius
                        2 - Fahrenheit -> Kelin
                        3 - Kelvin -> Celsius
                        3 - Kelvin -> Fahrenheit
                        """);
        return scanner.nextInt();
    }
    public static void celsius(double cels){
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Voce deseja converter de Celsius para:
                1 - Fahrenheit
                2 - Kelvin
                """);
        int converter = scanner.nextInt();
        if (converter == 1){
            System.out.printf("sua conversão deu: %.1f", ((cels * 9 / 5) + 32));
        }else {
            System.out.printf("sua conversão deu: %.1f",  cels + 273);
        }
    }
    public static void fahrenheit(double fahr){
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Voce deseja converter de Fahrenheit para:
                1 - Celsius
                2 - Kelvin
                """);
        int converter = scanner.nextInt();
        if (converter == 1){
            System.out.printf("sua conversão deu: %.1f", ((5 / 9) * (fahr - 32)));
        }else {
            System.out.printf("sua conversão deu: %.1f", fahr + 273);
        }
    }
    public static void kelvin(double kelv){
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Voce deseja converter de Kelvin para:
                1 - Celsius
                2 - Fahrenheit
                """);
        int converter = scanner.nextInt();
        if (converter == 1){
            System.out.printf("sua conversão deu: %.1f", kelv - 273);
        }else {
            System.out.printf("sua conversão deu: %.1f", ((kelv - 273) * 1.8 + 32));
        }
    }

}
