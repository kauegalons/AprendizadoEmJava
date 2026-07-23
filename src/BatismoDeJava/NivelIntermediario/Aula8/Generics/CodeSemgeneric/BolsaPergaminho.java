package BatismoDeJava.NivelIntermediario.Aula8.Generics.CodeSemgeneric;

import java.util.ArrayList;
import java.util.List;

public class BolsaPergaminho {
    private List<Pergaminho> pergaminhos;

    public BolsaPergaminho() {
        this.pergaminhos = new ArrayList<>();
    }

    public List<Pergaminho> getPergaminhos() {
        return pergaminhos;
    }

    public void setPergaminhos(List<Pergaminho> pergaminhos) {
        this.pergaminhos = pergaminhos;
    }

    @Override
    public String toString(){
        return "Bolsa de pergaminhos: " + pergaminhos.toString();
    }

    public void adcionarPergaminhos(Pergaminho pergaminho){
        pergaminhos.add(pergaminho);
    }
}
