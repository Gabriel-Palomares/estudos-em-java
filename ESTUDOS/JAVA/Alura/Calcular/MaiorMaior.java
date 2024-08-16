package JAVA.Alura.Calcular;

import java.util.Scanner;

public class MaiorMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um numero");
        int numero1 = scanner.nextInt();
        System.out.println("insira um segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("os numeros são iguais");
        } else if (numero1 > numero2) {
            System.out.println("valores são diferentes e o " + numero1 + " é maior que o " + numero2);
        }else {
            System.out.println("valores são diferentes e o " + numero2 + " é maior que o " + numero1);
        }
    }
}
