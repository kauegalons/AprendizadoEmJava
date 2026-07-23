package BatismoDeJava.NivelIntermediario.Aula8.Generics.CodeComGeneric;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho de invocação");

        BolsaGenerica<EquipamentosNinja> bolsaGenericaNinja = new BolsaGenerica<>();
        bolsaGenericaNinja.adcionarEquipamentos(kunai);
        bolsaGenericaNinja.adcionarEquipamentos(shuriken);
        bolsaGenericaNinja.adcionarEquipamentos(pergaminho);

        System.out.println(bolsaGenericaNinja);

        //Podemos colocar qualquer tipo de equipamento dentro desse Arraylist, não precisamos criar uma classe para cada um deles
    }
}
