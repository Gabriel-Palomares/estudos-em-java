package JAVA.Alura.PROGRAMINHAS;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        double media = 0;
        double nota;

        for (int i = 0; i < 3; i++){
            System.out.println("digite sua avaliacao para o filme: ");
            nota = Leitura.nextDouble();
            media += nota / 3;
        }
        System.out.println("media de avaliacao: " + media);
    }
}
