package JAVA.Alura.PROGRAMINHAS;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito:");
        String filme = Leitura.nextLine();
        System.out.println("qual o ano de lancamento:");
        int anoDoFilme = Leitura.nextInt();
        System.out.println("qual sua nota para este filme: (0 a 5 estrelas)");
        double nota = Leitura.nextDouble();
        System.out.printf("""
                %s
                %s
                %.1f
                %n""", filme, anoDoFilme, nota);
    }
}