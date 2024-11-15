package JAVA.Alura.ExerciciosPOO.Carros;

public class CarroModelo extends Carro {

}
class CarroTestes {
    public static void main(String[] args) {
        CarroModelo meuCarro = new CarroModelo();
        meuCarro.definirInformacoes("Sedan", 30000, 33000, 35000);
        meuCarro.exibirInformacoes();
    }
}