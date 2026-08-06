package BatismoDeJava.NivelAvancado.Aula2.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();

        ninjas.add(new Ninja("Naruto", "Konoha", 15));
        ninjas.add(new Ninja("Sasuke", "Konoha", 17));
        ninjas.add(new Ninja("Sakura", "Konoha", 19));
        ninjas.add(new Ninja("kakashi", "Konoha", 30));
        ninjas.add(new Ninja("Guy", "Konoha", 31));
        ninjas.add(new Ninja("Temari", "Suna", 18));
        ninjas.add(new Ninja("Gaara", "Suna", 13));

        // stream são utilizados para filtros, ordenação, mapeamento e redução de coleções de dados

        // Filtragem dos ninjas por vila
        /*ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha") )
                .forEach(System.out::println); // atalho - soutc
        */


        // Ordenação dos ninjas
        /*ninjas.stream()
                .sorted((ninja1, ninja2) -> Integer.compare(ninja1.getIdade(), ninja2.getIdade()))
                .forEach(System.out::println);*/


        // Ordenação por nome
        /*ninjas.stream()
                .sorted((ninja1, ninja2) -> ninja1.getNome().toUpperCase().compareTo(ninja2.getNome().toUpperCase()))
                .forEach(System.out::println);

        ninjas.stream()
                .sorted((ninja1, ninja2) -> String.CASE_INSENSITIVE_ORDER.compare(ninja1.getNome(),ninja2.getNome()))
                .forEach(System.out::println);*/


        // Mostrar e mapear um atributo
        /*ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);*/


        // Mas - filtrar por ninja mais velhos
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((ninja1, ninja2) -> Integer.compare(ninja1.getIdade(), ninja2.getIdade()))
                .orElse(null); // retorna o ninja mais velho ou null se a lista estiver vazia

        System.out.println("Ninja mais velho: " + ninjaMaisVelho);
    }
}
