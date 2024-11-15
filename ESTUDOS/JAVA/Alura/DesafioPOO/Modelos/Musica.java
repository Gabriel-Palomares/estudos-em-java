package JAVA.Alura.DesafioPOO.Modelos;

public class Musica extends Audio {
    private String album;
    private String cantor;
    private String ganero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGanero() {
        return ganero;
    }

    public void setGanero(String ganero) {
        this.ganero = ganero;
    }
}
