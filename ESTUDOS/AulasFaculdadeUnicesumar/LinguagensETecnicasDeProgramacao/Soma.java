package AulasFaculdadeUnicesumar.LinguagensETecnicasDeProgramacao;

import java.util.Scanner;

public class Soma {
    public static void main() {

        double valor1 = atribuirValor("Insira o primeiro valor da soma: ");
        double valor2 = atribuirValor("Insira o segundo valor da soma: ");
        double resultado = somaDosValores(valor1, valor2);

        exibirResultado(resultado);
    }

    public static double atribuirValor(String mensagem){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensagem);
        return scanner.nextDouble();
    }
    public static double somaDosValores(double valor1, double valor2){
        return valor1 + valor2;
    }
    public static void exibirResultado(double resultado){
        System.out.printf("A soma dos valores é: %.1f", resultado);
    }
}
