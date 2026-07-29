package BatismoDeJava.NivelIntermediario.Aula9.Records;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro  = new Ninja("Naruto Uzumaki","naruto@konoha.com", 12345678 );
        System.out.println("Cadastro: " + cadastro.getNome() + ", " + cadastro.getEmail() + ", " + cadastro.getTelefone());
        System.out.println("Cadastro " + cadastro);

        System.out.println("------------------------------");

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke","999.111.888-45", 1283);
        System.out.println("Cadastro com record: " + cadastroRecord.nome() + ", " + cadastroRecord.id() + ", " + cadastroRecord.cpf());
        System.out.println("Nome em caixa alta: " + cadastroRecord.emailCaixaAlta());
    }

}
