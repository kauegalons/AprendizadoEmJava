package BatismoDeJava.NivelIntermediario.Aula4.Encapsulamento;

public abstract class Ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private int nDeMissoes;
    private double altura = 1.71;

    public Ninja(String nome, String aldeia, int idade, int nDeMissoes, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.nDeMissoes = nDeMissoes;
        this.altura = altura;
    }
    public Ninja(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getnDeMissoes() {
        return nDeMissoes;
    }

    public void setnDeMissoes(int nDeMissoes) {
        this.nDeMissoes = nDeMissoes;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

