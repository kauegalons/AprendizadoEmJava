import OOP.Carro.Car;
import OOP.Carro.FabricaCarro;
import OOP.Carro.RecebendoCarro;

public class Application {
    public static void main(String[] args) {

        FabricaCarro fabrica = new FabricaCarro();
        Car carroConstruido = fabrica.ContruindoCarro();

        RecebendoCarro MeuCarroPronto = new RecebendoCarro();
        MeuCarroPronto.CarroPronto(carroConstruido);

    }
}