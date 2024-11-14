package AulasFaculdadeUnicesumar.LinguagensETecnicasDeProgramacao;

import java.util.Scanner;

public class CalculadoraFuncional {

    public static void main() {
        int menu = exibirMenu();

        switch (menu){

            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                dividir();
                break;
            case 4:
                multiplicar();
                break;
            case 0:
                break;


        }


    }
    public static int exibirMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                        qual das operações deseja realizar
                        1 - Soma
                        2 - Subtração
                        3 - Divisão
                        4 - Multiplicação
                        0 - Fechar programa
                        """);
        int escolha = scanner.nextInt();
        if (escolha >= 1 && escolha <= 4 || escolha == 0){
            return escolha;
        }else {
            System.out.println("Entrada invalida");
            exibirMenu();
        }

        return escolha;
    }
    public static void somar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Quais valores deseja somar:
                Some 0 para encerrar
                """);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        try {
            double resultado = x + y;
            while (x != 0 || y != 0){
                try {
                    System.out.printf("A soma deu = %.1f Qual sua proxima soma passe os 2 valores: ", resultado);
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    resultado = 0;
                    resultado = x + y;
                }catch (ArithmeticException e){
                    somar();
                }
            }
        }catch (ArithmeticException e){
            somar();
        }
        exibirMenu();
    }

    public static void subtrair(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Quais valores deseja subtrair:
                Subtraia 0 para encerrar
                """);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
            try {
                double resultado = x - y;
                while (x != 0 || y != 0) {
                    try {
                        System.out.printf("A subtração deu = %.1f Qual sua proxima subtração passe os 2 valores: ", resultado);
                        x = scanner.nextDouble();
                        y = scanner.nextDouble();
                        resultado = 0;
                        resultado = x - y;
                    } catch (ArithmeticException e) {
                        subtrair();
                    }
                }
            } catch (ArithmeticException e) {
                exibirMenu();
            }
    }

    public static void dividir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Quais valores deseja somar:
                Some 0 para encerrar
                """);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        try {
            double resultado = x / y;
            while (x != 0 || y != 0) {
                try {
                    System.out.printf("A soma deu = %.1f Qual sua proxima soma passe os 2 valores: ", resultado);
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    resultado = 0;
                    resultado = x / y;
                } catch (ArithmeticException e) {
                    dividir();
                }
            }
        }catch (ArithmeticException e){
            exibirMenu();
        }
    }

    public static void multiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Quais valores deseja multiplicar:
                Multiplique 0 para encerrar
                """);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        try {
            double resultado = x * y;
            while (x != 0 || y != 0){
                try {
                    System.out.printf("A multiplicação deu = %.1f Qual sua proxima  passe os 2 valores: ", resultado);
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    resultado = 0;
                    resultado = x * y;
                }catch (ArithmeticException e){
                    multiplicar();
                }
            }
        }catch (ArithmeticException e){
            multiplicar();
        }
        exibirMenu();
    }
}
