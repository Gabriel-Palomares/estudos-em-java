package JAVA.Alura.ExerciciosPOO.Carros;

public class Carro {
    String modelo;
    double preco2020, preco2021, preco2022;

    public void definirInformacoes(String modelo, double preco2020, double preco2021, double preco2022){
        this.modelo = modelo;
        this.preco2020 = preco2020;
        this.preco2021 = preco2021;
        this.preco2022 = preco2022;
    }
    private double calcularMenorPreco(){
        double menorPreco = preco2020;
            if (menorPreco > preco2021){
                menorPreco = preco2021;
            }
            if (menorPreco > preco2022){
                menorPreco = preco2022;
            }
        return menorPreco;
    }
    private double calcularMaiorPreco(){
        double maiorPreco = preco2020;
        if (maiorPreco < preco2021){
            maiorPreco = preco2021;
        }
        if (maiorPreco < preco2022){
            maiorPreco = preco2022;
        }
        return maiorPreco;
    }
    public void exibirInformacoes(){
        System.out.println("Modelo " + modelo);
        System.out.println("Preço 2020 " + preco2020);
        System.out.println("Preço 2021 " + preco2021);
        System.out.println("Preço 2022 " + preco2022);
        System.out.println("O menor preço é: " + calcularMenorPreco());
        System.out.println("O maior preço é: " + calcularMaiorPreco());
    }
}
