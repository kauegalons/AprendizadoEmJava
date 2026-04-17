package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi Uchiha";
        itachi.aldeia = "Aldeia da Folha";
        itachi.idade = 21;
        itachi.sharinganAtivado();


        //obj2
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 24;
        kakashi.BoasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
    }
}
