package NivelIntermediario.Overload2;

public abstract class Hokage {
    String nome;
    int idade;
    String aldeia;
    int missoes;
    boolean vivo;

    //Construtor All Args
    public Hokage(String nome, int idade, String aldeia, int missoes, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.vivo = vivo;
    }

    //Construtor vazio
    public Hokage() {}

    public abstract void liderarAldeia();

}
