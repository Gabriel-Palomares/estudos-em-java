package JAVA.Alura.POO;

public class Carros {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "toyota";
        carro1.ano = 2024;
        carro1.cor = "preto";

        carro1.exibirInfo();

        carro1.idade();
    }

}