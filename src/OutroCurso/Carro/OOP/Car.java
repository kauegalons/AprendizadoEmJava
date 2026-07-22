package OutroCurso.Carro.OOP;

public class Car {

    private String modelo;
    private String marca;
    private int nPortas;

    public void setModeloConversivel(boolean modeloConversivel) {
        this.modeloConversivel = modeloConversivel;
    }

    private boolean modeloConversivel;


    public Car(){
    }

    public Car(String modelo, String marca, int nPortas, boolean modeloConversivel){

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null) modelo = "Desconhecido";
        String modeloMinusculo = modelo.toLowerCase();
        switch (modeloMinusculo){
            case "Civic", "Laferrarri", "CarroDoSenna" -> this.modelo = modelo;
            default -> {
                this.modelo = "invalido";
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null) marca = "Desconhecido";
        String marcaMinusculo = marca.toLowerCase();
        switch (marcaMinusculo){
            case "Honda", "Ferrari", "F1" -> this.marca = marca;
            default -> {
                this.marca = "invalido";
            }
        }
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        switch (nPortas){
            case 2, 4, 1 -> this.nPortas = nPortas;
            default -> {
                String valorNaoValido = "Invalido";
            }
        }
    }

    public boolean isModeloConversivel() {
        return modeloConversivel;
    }



}


