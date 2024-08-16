package JAVA.Alura.Calcular;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("voce quer saber a tabuada de qual numero: ");
        int numero = scanner.nextInt();
        int i = 1;

        while (i <= 10){
            int resultado = i * numero;
            System.out.printf("""
                    %d * %d = %d
                    """, numero, i, resultado);
            i++;
        }
    }
}
