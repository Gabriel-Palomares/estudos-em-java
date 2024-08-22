package JAVA.Alura.Calcular;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor para verificar se é positivo ou não");
        int numero = scanner.nextInt();


            if (numero > 0){
                System.out.println("este valor é positivo");
            }else if (numero < 0){
                System.out.println("este valor é negativo");
            }else {
                System.out.println("seu valor é igual a 0!");
            }
        }
    }

