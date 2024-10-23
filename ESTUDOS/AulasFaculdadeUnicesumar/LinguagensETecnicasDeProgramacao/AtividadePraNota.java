package AulasFaculdadeUnicesumar.LinguagensETecnicasDeProgramacao;

import java.util.Scanner;

public class AtividadePraNota {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual tamanho do seu vetor: ");
        int maxVetor = scanner.nextInt();
        int [] array = new int [maxVetor];
        boolean escolha = false;

        for (int i = 0; i < maxVetor; i++){
            System.out.println("Quais os valores da sua array");
            array[i] = scanner.nextInt();
        }
        System.out.print("""
                deseja verificar:
                1 - crescente
                2 - decrescente
                """);
        int opcao = scanner.nextInt();
        if (opcao == 1){
            escolha = true;
        } else if (opcao == 2) {
            System.out.println(" ");
        }else {
            System.out.println("entrada invalida");
        }
        ordenador(array, escolha);
        exibirvalor(array);
    }

    static void exibirvalor(int []array) {
        for (int e = 0; e < array.length; e++){
            System.out.printf("na posição %d o valor é %d", e ,array[e]);
            System.out.println(" ");
        }
    }

    public static void ordenador(int []array, boolean escolha) {
        int n = array.length;
        for (int x = 0; x < n - 1; x++){
            for (int y = 0; y < n - x - 1; y++ ){
                if (escolha){
                    if (array[y] > array[y + 1]){
                        array[y] = array[y] + array[y + 1];
                        array[y + 1] = array[y] - array[y + 1];
                        array[y] = array[y] - array[y + 1];
                    }
                }else {
                    if (array[y] < array[y + 1]){
                        array[y] = array[y] + array[y + 1];
                        array[y + 1] = array[y] - array[y + 1];
                        array[y] = array[y] - array[y + 1];
                    }
                }
            }

        }
    }



}
