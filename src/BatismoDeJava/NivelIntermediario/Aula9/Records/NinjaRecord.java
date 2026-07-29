package BatismoDeJava.NivelIntermediario.Aula9.Records;

public record NinjaRecord(String nome, String cpf, int id) {
    //Todos os atributos são finais por padrão
    //Records não tem ‘setter’, não podemos alterar um atributo


    public String emailCaixaAlta(){
        return nome.toUpperCase();
    }

}
