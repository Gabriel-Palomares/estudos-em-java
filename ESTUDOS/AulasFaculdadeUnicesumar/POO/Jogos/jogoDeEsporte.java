package AulasFaculdadeUnicesumar.POO.Jogos;

public class jogoDeEsporte extends Jogo{
    private String modalidade;

    public jogoDeEsporte(String titulo, String plataforma, double preco, String modalidade) {
        super(titulo, plataforma, preco);
        this.modalidade = modalidade;
    }

    public void exibirDetalhes(){
        System.out.println("O jogo " + getTitulo() + " esta presente na plataforma " + getPlataforma() +" e na modalidade " + getModalidade() + " custando " + getPreco());
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}
