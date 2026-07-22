package BatismoDeJava.NivelIntermediario.Aula3.Overload2;


public class main {
    public static void main(String[] args) {
        //Criar ninja sasuke
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Konoha", 20);

        System.out.println("-------------------");
        Sasuke.SharinganAtivado();

        System.out.println();
        System.out.println("-------------------");
        String chamandoMetodo  = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        System.out.println();
        System.out.println("-------------------");
        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage( 50);
        System.out.println("Falta no minimo " +quantoTempoFalta+" anos para você se tornar hokage");


        System.out.println();
        System.out.println("-------------------");
        Senju Senju = new Senju();
        Senju.nome = "Tobirama Senju";
        Senju.aldeia = "Aldeia da folha";
        Senju.idade = 20;
        Senju.liderarAldeia();

        System.out.println();
        Sarutobi Sarutobi = new Sarutobi();
        Sarutobi.nome = "Hiruzen Sarutobi";
        Sarutobi.aldeia = "Aldeia da folha";
        Sarutobi.idade = 60;
        Sarutobi.liderarAldeia();

        System.out.println();
        System.out.println("-------------------");
        Sasuke.metodoDeBatalhaNinja();
        System.out.println();

        Uzumaki Uzumaki = new Uzumaki();
        Uzumaki.nome = "Naruto Uzumaki";
        Uzumaki.aldeia = "Aldeia da folha";
        Uzumaki.idade = 20;
        Uzumaki.metodoDeBatalhaNinja();

        System.out.println();
        Figurante Figurante = new Figurante();
        Figurante.nome = "Anbu";
        Figurante.aldeia = "Aldeia da folha";
        Figurante.idade = 20;
        Figurante.metodoDeBatalhaNinja();

    }

}
