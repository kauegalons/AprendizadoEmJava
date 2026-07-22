package BatismoDeJava.NivelIntermediario.Aula4.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ Naruto Uzumaki ---------");
        Uzumaki Minato = new Uzumaki("Minato Namikaze", "Konoha", 30, 100, 1.80);
        System.out.println("Meu nome é " + Minato.getNome() + " minha idade é " + Minato.getIdade() + " anos, minha aldeia é " + Minato.getAldeia() + " e minha altura é " + Minato.getAltura() + " metros");
        Minato.setNome("Minato Namikaze (nome alterado)");
        Minato.getNome();

        System.out.println("------ Sasuke uchiha ---------");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Konoha", 25, 80, 1.75);
        System.out.println("Meu nome é " + Sasuke.getNome() + " minha idade é " + Sasuke.getIdade() + " anos, minha aldeia é " + Sasuke.getAldeia() + " e minha altura é " + Sasuke.getAltura() + " metros");

    }
}
