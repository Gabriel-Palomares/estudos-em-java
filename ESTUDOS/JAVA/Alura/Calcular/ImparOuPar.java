package JAVA.Alura.Calcular;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual numero voce deseja conferir: ");
        int numero = scanner.nextInt();
        int resto = numero % 2;

        if(resto == 0){
            System.out.println("o numero é par");
        }else{
            System.out.println("o numero é impar");
        }
    }
}
