package JAVA.Alura.Calcular;

import java.util.Scanner;

public class MaiorMaior {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um numero");
        int numero1 = scanner.nextInt();
        System.out.println("insira um segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("os numeros são iguais");
        } else if (numero1 > numero2) {
            System.out.printf("valores são diferentes e o %d é maior que o %d ", numero1, numero2);
        }else {
            System.out.printf("valores são diferentes e o %d é maior que o %d", numero2, numero1);
        }
    }
}
