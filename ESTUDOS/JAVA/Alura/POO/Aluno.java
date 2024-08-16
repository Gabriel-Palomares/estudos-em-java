package JAVA.Alura.POO;

public class Aluno {
    private String nome;
    private int idade;
    private double notaPort;
    private double notaMat;
    private double notaCien;
    private double notaHist;
    private double notaFisi;

    void exibirInformacoes(){
        System.out.println("o aluno " + getNome() + "idade: " + getIdade());
        System.out.printf("o aluno " + getNome() + " esta com a media total das notas de: " + mediaNotas());
    }

    double mediaNotas(){
        double mediaNotas = ((notaCien + notaFisi + notaHist + notaPort + notaMat) / 5);
        System.out.println(mediaNotas);
        return mediaNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaCien() {
        return notaCien;
    }

    public void setNotaCien(double notaCien) {
        this.notaCien = notaCien;
    }

    public double getNotaFisi() {
        return notaFisi;
    }

    public void setNotaFisi(double notaFisi) {
        this.notaFisi = notaFisi;
    }

    public double getNotaHist() {
        return notaHist;
    }

    public void setNotaHist(double notaHist) {
        this.notaHist = notaHist;
    }

    public double getNotaMat() {
        return notaMat;
    }

    public void setNotaMat(double notaMat) {
        this.notaMat = notaMat;
    }

    public double getNotaPort() {
        return notaPort;
    }

    public void setNotaPort(double notaPort) {
        this.notaPort = notaPort;
    }


}

