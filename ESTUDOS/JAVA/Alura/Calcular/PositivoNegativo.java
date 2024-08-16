package JAVA.Alura.Calcular;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor para verificar se é positivo ou não");
        int numero = scanner.nextInt();


            if (numero > 0){
                System.out.println("este valor é positivo");
            }else {
                System.out.println("este valor é negativo");
            }
        }
    }

