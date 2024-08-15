import java.util.Scanner;

public class loopwhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int quantidade = 0;
        double notas = 0;
        double media = 0;

        while (notas != -1) {
            System.out.println("digite sua avaliação ou -1 para encerrar");
            notas = leitura.nextDouble();
            if (notas != -1){
                media += notas;
                quantidade++;
            }

        }
        System.out.println("a media das notas é: " + media/quantidade);
    }
}
