package NivelIntermediario;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }


    //Polimorfismo em tempo de execução (Sobrescrita)
    public void metodoDeBatalhaNinja(){
        System.out.println("Meu nome é " + nome + " e minha estrategia é usa o Rasengan.");
    }
}
