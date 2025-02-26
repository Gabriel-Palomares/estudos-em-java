package JAVA.Alura.PROGRAMINHAS;

public class Conta {
    private final int numeroDaConta;
    private double saldo;
    private final double limite;

    public Conta(int numeroDaConta, double saldo, double limite){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limite = limite;

    }
    public void exibirSaldoLimite(){
        System.out.printf("""
                            ********************************
                            Numero da Conta:      %d
                            Saldo:                %.2f
                            Limite:               %.2f

                            ********************************
                            """, numeroDaConta, saldo, limite);
    }
    public void retirar(double retirada){
        while (retirada > saldo){
            if (retirada > saldo + limite){
                System.out.println("Saldo indisponivel");
            }else{
                retirada -= saldo;
            }
        }
    }
    public void depositar(double deposito){
        deposito += saldo;
    }
}
