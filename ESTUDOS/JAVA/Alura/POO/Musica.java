package JAVA.Alura.POO;

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double somaAvaliacao;
    int numeroDeAvaliacoes;

    void exibirFichaTecnica(){

    }

    void avalia(double nota){
        somaAvaliacao += nota;
        numeroDeAvaliacoes++;

    }

    double mediaDasNotas(){
        return somaAvaliacao / numeroDeAvaliacoes;
    }
}


