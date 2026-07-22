package BatismoDeJava.NivelIntermediario.Aula3.Overload;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: " + numeroDeMissoesConcluidas + " missoes." );
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " Essa é minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi >150){
            System.out.println("Meu nome é: " + nome + " Minha inteligencia de combate é de nivel genio");
        }else if(qi <= 130){
            System.out.println("Meu nome é: " + nome + " Minha inteligencia de combate é promissora");
        }else {
            System.out.println("Meu nome é: " + nome + " Minha inteligencia de combate precisa ser treinada");
        }
    }

}
