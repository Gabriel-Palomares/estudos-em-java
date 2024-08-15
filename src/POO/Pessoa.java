package POO;

public class Pessoa {
    private String nome;
    private int idade;


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

    void maioridade(){
        if (getIdade() >= 18){
            System.out.println(getNome() + " é maior de idade");
        }else {
            System.out.println(getNome() + " é menor de idade");
        }

    }

}
