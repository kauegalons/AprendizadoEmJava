package BatismoDeJava.NivelIntermediario.Aula14.Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> Listninjas = new LinkedList<>();

        Listninjas.add(new Ninja("Naruto", 16, "Konoha"));
        Listninjas.add(new Ninja("Sasuke", 17, "Konoha"));
        Listninjas.add(new Ninja("Sakura", 17, "Konoha"));
        Listninjas.add(new Ninja("Kakashi", 32, "Konoha"));
        Listninjas.add(new Ninja("Gaara", 15, "Suna"));
        Listninjas.add(new Ninja("Temari", 18, "Suna"));
        Listninjas.add(new Ninja("Killer Bee", 23, "Kumogakure"));

        //Mostrando a lista
        System.out.println("----------Lista de Ninjas----------\n");
        System.out.println("Lista de ninjas: " + Listninjas);

        for (Ninja ninja : Listninjas) {
            System.out.println(ninja);
        }

        //Adicionando no começo da lista
        System.out.println("\n----------Lista de Ninjas após adição no começo----------\n");
        Listninjas.addFirst(new Ninja("Itachi", 21, "Konoha"));
        System.out.println("Lista de ninjas: " + Listninjas);

        //Removendo o primeiro ninja da lista
        System.out.println("\n----------Lista de Ninjas após remoção do primeiro ninja----------\n");
        Ninja removido = Listninjas.removeFirst();
        System.out.println("Ninja removido: " + removido);
        System.out.println("Lista de ninjas: " + Listninjas);

        //Procurar um ninja pelo indice
        System.out.println("\n----------Procurar um ninja pelo indice----------\n");
        Ninja ninjaNoIndice = Listninjas.get(3);
        System.out.println("Ninja no indice: "+ Listninjas.indexOf(ninjaNoIndice) + " - " + ninjaNoIndice);

        //Reorganizar com base no Nome
        System.out.println("\n----------Reorganizar com base no atributo Nome----------\n");
        Listninjas.sort((ninja1, ninja2) -> ninja1.getNome().compareTo(ninja2.getNome()));
        for (Ninja ninja : Listninjas) {
            System.out.println(ninja);
        }

        //Reorganizar com base na idade
        System.out.println("\n----------Reorganizar com base no atributo Idade----------\n");
        Listninjas.sort((ninja1, ninja2) -> Integer.compare(ninja1.getIdade(), ninja2.getIdade()));
        for (Ninja ninja : Listninjas) {
            System.out.println(ninja);
        }

    }
}
