package JAVA.Alura.ExerciciosPOO.Animais;

public class Animal {
    protected String nome;

    public Animal (String nome){
        this.nome = nome;
    }
    public void EmitirSom(){
        System.out.println("Emitindo Som");
    }
}
