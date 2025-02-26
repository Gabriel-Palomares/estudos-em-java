package AulasFaculdadeUnicesumar.POO;

public class Pessoa {
    private String nome;
    private int idade;



    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("José", 41);
        p1.exibirPessoa();
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void exibirPessoa(){
        System.out.println(nome + " " + idade + " anos");
    }
}
