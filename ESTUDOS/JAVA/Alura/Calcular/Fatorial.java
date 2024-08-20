package JAVA.Alura.Calcular;

import java.util.Scanner;

public class Fatorial {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual numero inteiro voce deseja saber o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
        fatorial *= i;
        }
        System.out.printf("fatorial de %d é igual a %d",numero, fatorial );
    }
}