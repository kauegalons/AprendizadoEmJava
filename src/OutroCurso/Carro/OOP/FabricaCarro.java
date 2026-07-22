package OutroCurso.Carro.OOP;


public class FabricaCarro {

    public Car ContruindoCarro (){
        Car carrinho = new Car("Civic", "Honda", 4, true);
        return carrinho;
    }
}
