package JAVA.Alura.ExerciciosPOO.Animais;

public class AnimalGato extends Animal{
    String nome;
    public AnimalGato(String nome){
        super(nome);
    }
    @Override
    public void EmitirSom(){
        System.out.println("Miau");
    }
    public void ArranharMoveis(){
        System.out.println("Arranhando os Móveis");
    }
}
