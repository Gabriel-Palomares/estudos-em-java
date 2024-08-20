package JAVA.Alura.Calcular;

import java.util.Scanner;

public class Area {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
        qual tipo de area voce deseja calcular:
        1 - area de um quadrado;
        2 - area do circulo;
        0 - para encerrar;
        """);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("digite o valor da altura: ");
                int lado1 = scanner.nextInt();
                System.out.println("digite o valor do comprimento: ");
                int lado2 = scanner.nextInt();

                double areaDoQuadrado = lado1 * lado2;
                System.out.printf("a area do quadrado é igual a %.1fm²", areaDoQuadrado);
                break;

            case 2:
            System.out.println("insira o tamanho do raio do circulo: ");
            double raio = scanner.nextDouble();
            final double resultadoCirculo = 3.14 * Math.pow(raio, 2);
            System.out.printf("a area do circulo é de %.1fm²", resultadoCirculo);

            break;

            case 3:
                System.out.println("opcao invalida inserida");
                break;
        }

    }
}
