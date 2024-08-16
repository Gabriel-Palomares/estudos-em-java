package JAVA.Alura.Calcular;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quais valores voce quer obter os resultados das 4 operacoes: ");
        System.out.println("valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.println("valor 2: ");
        int valor2 =  scanner.nextInt();
        int resultadoSoma = valor1 + valor2;
        int resultadoSub = valor1 - valor2;
        int resultadoDiv = valor1 / valor2;
        int resultadoMult = valor1 * valor2;

        System.out.printf("""
                soma: %d
                subtracao: %d
                multiplicacao: %d
                divisao: %d
                
                """, resultadoSoma, resultadoSub, resultadoMult, resultadoDiv);
    }
}

