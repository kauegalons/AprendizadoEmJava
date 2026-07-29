package BatismoDeJava.NivelIntermediario.Aula8.Generics.CodeComGeneric;

import java.util.ArrayList;
import java.util.List;

/*
    Generic:
    Colocamos o T, pois é genérico, pois ele aguenta qualquer TIPO, T = TIPO
    Mas poderia ser qualquer coisa no lugar do T, por exemplo, a palavra genérico
 */
public class BolsaGenerica <T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    //Colocar equipamentos Genericos na nossa lista
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }


    @Override
    public String toString(){
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }


    //Mostrar equipamentos
    public void mostrarEquipamentos(){
        for(T equipamento: equipamentos){
            System.out.println(equipamento);
        }
    }

}
