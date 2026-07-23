package BatismoDeJava.NivelIntermediario.Aula8.Generics.CodeSemgeneric;

public class Main {
    public static void main(String[] args) {
        Kunai kunai1 = new Kunai("Kunai");
        Kunai kunai2 = new Kunai("Kunai explosiva");
        Kunai kunai3 = new Kunai("Kunai de agua");

        BolsaKunai bolsaKunai1 = new BolsaKunai();
        bolsaKunai1.adcionarKunais(kunai1);
        bolsaKunai1.adcionarKunais(kunai2);
        bolsaKunai1.adcionarKunais(kunai3);

        System.out.println(bolsaKunai1);

        BolsaPergaminho bolsaPergaminho1 = new BolsaPergaminho();
        Pergaminho pergaminho1 = new Pergaminho("Pergaminho de invocação");
        Pergaminho pergaminho2 = new Pergaminho("Pergaminho de selamento");
        bolsaPergaminho1.adcionarPergaminhos(pergaminho1);
        bolsaPergaminho1.adcionarPergaminhos(pergaminho2);

        System.out.println(bolsaKunai1);
        System.out.println(bolsaPergaminho1);

    }
    //Se eu quisesse adicionar um pergaminho ou uma shuriken, por exemplo, teria que criar uma classe nova inteira
    // e por aí vai, daria muito mais trabalho
}

