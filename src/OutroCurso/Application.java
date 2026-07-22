package OutroCurso;

import OutroCurso.Carro.OOP.Car;
import OutroCurso.Carro.OOP.FabricaCarro;
import OutroCurso.Carro.OOP.RecebendoCarro;

public class Application {
    public static void main(String[] args) {

        FabricaCarro fabrica = new FabricaCarro();
        Car carroConstruido = fabrica.ContruindoCarro();

        RecebendoCarro MeuCarroPronto = new RecebendoCarro();
        MeuCarroPronto.CarroPronto(carroConstruido);

    }
}