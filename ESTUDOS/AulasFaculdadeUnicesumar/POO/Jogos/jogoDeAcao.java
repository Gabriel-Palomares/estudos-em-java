package AulasFaculdadeUnicesumar.POO.Jogos;

public class jogoDeAcao extends Jogo{
    private boolean temViolencia;


    public jogoDeAcao(String titulo, String plataforma, double preco, boolean temViolencia) {
        super(titulo,plataforma,preco);
        this.temViolencia = temViolencia;
    }

    public void exibirDetalhes(){
        System.out.println("O jogo " + getTitulo() + " esta presente na plataforma " + getPlataforma() +" este jogo " + isViolencia() + " custando " + getPreco());
    }

    public String isViolencia() {
        if (temViolencia = true){
            return " contem violencia";
        }else {
            return " não contem violencia";
        }
    }

    public void setViolencia(boolean violencia) {
        this.temViolencia = temViolencia;
    }
}
