package entities;

public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;


    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositoConta(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void depositoConta(double valor) {
        saldoConta += valor;
    }

    public void saqueConta(double valor) {
        saldoConta -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "ContaBancaria " +
                "numero da conta = " + numeroConta +
                ", nome do titular = " + nomeTitular +
                ", saldo da conta = $ " +
                 String.format("%.2f", saldoConta);
    }
}

