package BatismoDeJava.NivelIntermediario.Aula5.Enum;

public enum RankDeMissoes{
    D("Facil", 2),
    C("Defender o construtor da ponte", 4),
    B("Não é para qualquer um", 6),
    A("Aqui o bixo pega", 8),
    S("Hokage arrega e manda anbu de capacho", 10);

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    private String descricao;

    private int dificuldade;
}
