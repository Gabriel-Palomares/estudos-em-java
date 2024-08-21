package JAVA.Alura.Calcular;

import java.util.Scanner;

public class Teste {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                qual a sua idade
               
                """);
        int idade = scanner.nextInt();

        int anoDeNascimento = 2024 - idade;

        System.out.printf("voce tem %d e nasceu em %d", idade, anoDeNascimento);
        int i = 1;
        while (i < 10){
            int numero = i;
            System.out.print(numero);

            i++;
        }


    }
}
