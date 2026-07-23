package BatismoDeJava.NivelIntermediario.Aula8.Generics.CodeSemgeneric;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {
    private List<Kunai> kunais;

    public BolsaKunai() {
        this.kunais = new ArrayList<>();
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString(){
        return "Bolsa de kunais: " + kunais.toString();
    }

    public void adcionarKunais(Kunai kunai){
        kunais.add(kunai);
    }

}
