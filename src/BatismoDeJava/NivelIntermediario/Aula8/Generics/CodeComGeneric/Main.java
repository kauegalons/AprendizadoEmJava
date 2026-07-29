package BatismoDeJava.NivelIntermediario.Aula8.Generics.CodeComGeneric;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho de invocação");

        BolsaGenerica<EquipamentosNinja> bolsaGenericaNinja = new BolsaGenerica<>();

        /*
        * <Object> aceita qualquer tipo de objeto (String, Integer, EquipamentosNinja, etc)
        * Já <EquipamentosNinja> acima aceita APENAS objetos do tipo EquipamentosNinja
        * Usamos Object quando precisa de flexibilidade total, e tipos específicos para type-safety
        * */
        BolsaGenerica<Object> bolsaGenericaObject = new BolsaGenerica<>();
        bolsaGenericaNinja.adicionarEquipamentos(new EquipamentosNinja("Kunai explosiva"));

        bolsaGenericaNinja.adicionarEquipamentos(kunai);
        bolsaGenericaNinja.adicionarEquipamentos(shuriken);
        bolsaGenericaNinja.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenericaNinja);


        //itens da nossa bolsa ninja generica
        System.out.println("\nItens da bolsa ninja generica: ");
        bolsaGenericaNinja.mostrarEquipamentos();
        //Podemos colocar qualquer tipo de equipamento dentro desse Arraylist, não precisamos criar uma classe para cada um deles
    }
}
