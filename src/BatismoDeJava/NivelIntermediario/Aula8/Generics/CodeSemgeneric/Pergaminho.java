package BatismoDeJava.NivelIntermediario.Aula8.Generics.CodeSemgeneric;

public class Pergaminho {

    private String nome;

    public Pergaminho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + nome;
    }

}
