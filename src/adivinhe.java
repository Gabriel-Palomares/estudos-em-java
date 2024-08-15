import java.util.Random;
import java.util.Scanner;

public class adivinhe {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        int tentativas = 0;
        int palpite = 0;

        System.out.print("""
                Bem vindo ao jogo de adivinhacao.
                neste jogo, voce tera que adivinhar qual o numero secreto
                que esta entre os valores de 1 ~ 100.
                digite -1 para encerrar
                Boa Sorte.
                """);

        while (tentativas < 5){
            System.out.println("qual é o seu palpipe: ");
            palpite = leitura.nextInt();
            tentativas++;

            if (palpite == numeroSorteado){
                System.out.printf("parabens Voce Acertou era o numero " + palpite);
                break;
            } else if (palpite > numeroSorteado) {
                System.out.println("o numero é menor");

            }else {
                System.out.println("o numero é maior");
            }
        }
        if (tentativas == 5 && numeroSorteado != palpite){
            System.out.printf("""
                    Voce Falhou
                    o numero era %d
                    Jogo Encerrado.
                    """, numeroSorteado);

        }
    }
}
