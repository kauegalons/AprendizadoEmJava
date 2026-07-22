package BatismoDeJava.NivelIntermediario.Aula5.Enum;

public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.D);

        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Matar o Madara", RankDeMissoes.S);
        missao2.exibirDetalhes();
    }
}
