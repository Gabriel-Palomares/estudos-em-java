package POO;

public class Musicas {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "chihiro";
        musica.artista = "billie";
        musica.anoDeLancamento = 2024;

        musica.exibirFichaTecnica();

        musica.avalia(9);
        musica.avalia(10);
        System.out.println(musica.mediaDasNotas());

    }
}