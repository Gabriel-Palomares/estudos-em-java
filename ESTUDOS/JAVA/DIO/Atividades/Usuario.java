package JAVA.DIO.Atividades;

public class Usuario {
    public static void main() {
        SmartTv samsung = new SmartTv();

        System.out.println("TV ligada ? " + samsung.ligada);
        System.out.println("Canal atual ? " + samsung.canal);
        System.out.println("Volume atual ? " +samsung.volume);

        samsung.ligar();
        System.out.println("TV ligada ? " + samsung.ligada);

        samsung.aumentarVolume();

        System.out.println("Volume atual " + samsung.volume);

        samsung.mudarCanal(10);

        System.out.println(samsung.canal);
    }
}
