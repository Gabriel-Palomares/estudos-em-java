package JAVA.Alura.ExerciciosPOO.Animais;

public class AnimalCachorro extends Animal{
    String nome;
    public AnimalCachorro(String nome){
        super(nome);
    }
    public void EmitirSom(){
        System.out.println("Au-Au-Au");
    }
    public void AbanarORabo(){
        System.out.println("Abanando o rabo");
    }
    public void BuscarBola(){
        System.out.println("Buscando Bola");
    }
}
