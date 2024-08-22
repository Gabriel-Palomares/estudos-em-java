package JAVA.DIO.Atividades;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }
    public void proxCanal(){
        canal++;
    }
    public void anteCanal(){
        canal--;
    }
    public void mudarCanal(int canal){
        this.canal = canal;
    }
}
