package JAVA.Alura.POO;

public class Alunos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("luis");
        aluno1.setIdade(19);

        aluno1.setNotaCien(9);
        aluno1.setNotaFisi(10);
        aluno1.setNotaHist(8);
        aluno1.setNotaMat(8);
        aluno1.setNotaPort(7);

        aluno1.mediaNotas();

        aluno1.exibirInformacoes();
    }

}