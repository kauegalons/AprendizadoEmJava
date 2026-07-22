package BatismoDeJava.NivelIntermediario.Aula5.Enum;

public class Missoes {

    private String nome;

    private RankDeMissoes rank;


    //metodo para mostrar mais informações
    public void exibirDetalhes(){
        System.out.println("------------------------------");
        System.out.println("Missao: " + nome);
        System.out.println("Rank: " + rank);
        System.out.println("Descricao: " + rank.getDescricao());
        System.out.println("Dificuldade: " + rank.getDificuldade());
    }


    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
