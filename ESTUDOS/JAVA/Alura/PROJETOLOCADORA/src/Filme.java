public class Filme {
    private String nome;
    private int duracaoEmMin;
    private int codigoDoFilme;
    private String sinopse;
    private double notasSoma;
    private int numeroDeAvaliacoes;


    public void cadastrarFilme(String nome, int codigoDoFilme, String sinopse){
        Filme filme;
        filme = new Filme();
        filme.setNome(nome);
        filme.setCodigoDoFilme(codigoDoFilme);
        filme.setSinopse(sinopse);

    }
    public double avaliarFilme(double nota){
        numeroDeAvaliacoes++;
        return notasSoma += nota;
    }
    public double mediaDoFilme(){
        return notasSoma / numeroDeAvaliacoes;
    }

    public void exibirInformacoes(){
        System.out.print("""
                Filme: %s
                Duração: %d
                Nota: %f
                Sinopse: %s
                
                """);
    }
    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    public String getSinopse() {
        return sinopse;
    }
    public String getNome(Filme filme) {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCodigoDoFilme() {
        return codigoDoFilme;
    }
    public void setCodigoDoFilme(int codigoDoFilme) {
        this.codigoDoFilme = codigoDoFilme;
    }

}
