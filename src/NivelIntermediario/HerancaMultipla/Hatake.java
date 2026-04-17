package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements Sharingan,  AnbuInterface {
    public void BoasVindas(){
        System.out.println("Boas vindas a konoha eu sou um hatake");
    }

    public void sharinganAtivado(){
        System.out.println("Eu sou o " + nome + " e meu Sharingan foi ativado.");
    }

    public void ninjaDeElite(){
        System.out.println("Eu sou o " + nome + " e sou um ninja de elite da anbu da aldeia da folha.");
    }
}
