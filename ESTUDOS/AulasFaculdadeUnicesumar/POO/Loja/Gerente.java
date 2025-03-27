package AulasFaculdadeUnicesumar.POO.Loja;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override public void exibirFuncionario(){
        System.out.println("O funcionario " + getNome() + " e seu salário é: " + getSalario() + bonus);
    }
}
