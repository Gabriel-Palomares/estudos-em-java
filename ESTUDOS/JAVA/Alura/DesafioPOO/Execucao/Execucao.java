package JAVA.Alura.DesafioPOO.Execucao;

import JAVA.Alura.DesafioPOO.Modelos.Musica;
import JAVA.Alura.DesafioPOO.Modelos.PodCast;

public class Execucao {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 40; i++) {
            minhaMusica.curtir();
        }

        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("Bolha DEV");
        meuPodcast.setApresentador("Gabriel");

        for (int i = 0; i < 100; i++) {
            meuPodcast.curtir();
        }
    }
}

