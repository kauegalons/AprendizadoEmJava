package OOP.Carro;

public class RecebendoCarro {

    public void CarroPronto(Car carrinho) {
        System.out.println("O modelo do carro é: " + carrinho.getModelo() +
                ".\nA marca é: " + carrinho.getMarca() +
                ".\nTem " + carrinho.getnPortas() + " portas" +
                ".\nConversivel: " + carrinho.isModeloConversivel());
    }
}