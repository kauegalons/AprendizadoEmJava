package BatismoDeJava.NivelIntermediario.Aula1.Desafio3;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        saldo += valor * 0.01;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso na Conta Corrente.");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da Conta Poupanca: R$ " + saldo);
    }

}
