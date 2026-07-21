package NivelIntermediario.Overload2;

public class Uchiha extends Ninja{


    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }


    public void ativarSharingan(){
            System.out.println("Sharingan ativado");
        }

        //Polimorfismo em tempo de execução (Sobrescrita)
        public void metodoDeBatalhaNinja() {
            System.out.println("Meu nome é " + nome + " e minha estrategia é usa o Chidori.");
        }

        //criar um metodo public personalizado
        public void SharinganAtivado(){
        System.out.println("Sharingan ativado");
    }
}
