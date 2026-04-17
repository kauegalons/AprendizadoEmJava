package NivelIntermediario.Desafio3;

public class ContaCorrente extends ContaBancaria  {

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da Conta Corrente: R$ " + saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso na Conta Corrente.");

    }

}
