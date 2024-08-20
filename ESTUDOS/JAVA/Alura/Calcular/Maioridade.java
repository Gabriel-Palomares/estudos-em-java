package JAVA.Alura.Calcular;

import java.util.Scanner;
//importe a biblioteca scanner

public class Maioridade {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        //escreva o Scanner maiusculo.
        System.out.println("me informe a sua idade: ");
        int idade = scanner.nextInt();
        //usei o SOUT para escrever na tela e usei o comando "scanner.nextInt();" para que idade seja solicitado ao usuario
        if (idade > 18){
            System.out.println("voce é maior de idade");
        }else {
            System.out.println("voce ainda é menor de idade");
        }//fiz o uso de if else para condicionar qual opção seria exibida de acordo com o valor inserido pelo usuario.
    }
}
