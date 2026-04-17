package NivelIntermediario.Desafio3;

public abstract class ContaBancaria implements Conta {

    double saldo;


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //NoArgs
    public ContaBancaria() {
    }

    public abstract void depositar(double valor);

    public void consultarSaldo(){
        System.out.println("Seu saldo atual: " + saldo);
    }

}
