package JAVA.DIO.Atividades;

public class ContaBanco {

    private int numero = 1021;
    private String agencia = "067-8";
    private String titular = "Gabriel Palomares";
    private double saldo = 237.48;

    public double sacar(double novoSaldo){
        saldo -= novoSaldo;
        System.out.printf("saldo atual %.2f", saldo);
        return saldo;
    }
    public double receberValor(double novoSaldo){
        saldo += novoSaldo;
        System.out.printf("saldo atual %.2f", saldo);
        return saldo;
    }
    public void verSaldo(){
        System.out.printf("seu saldo atual é: %.2f", saldo);
    }
    public void visualizarDados(){
        System.out.printf("""
                Olá %s
                agencia %s numero %d
                Seu saldo atual é: %.2f
                """, titular, agencia, numero, saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
