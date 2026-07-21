package NivelIntermediario.Overload2;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade) {
    }

    public Ninja() {
    }

    //criar um metodo public personalizado
    public void SharinganAtivado(){
        System.out.println("Sharingan ativado");
    }

    /*
    Metodo String vai ter q retornar uma string
     */
    public String EuSouUmNinja(){
        return "Eu sou um ninja";
    }

    /*
    Metodo int vai ter que retornar int
     */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

    //Sobreescrevendo o metodo da interface
    @Override
    public void metodoDeBatalhaNinja(){
        System.out.println("Meu nome e "+ nome+ " e minha estratégia é shuriken.");

    }
}
