package JAVA.DIO.Atividades;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " +smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("Volume atual " + smartTv.volume);
    }
}
