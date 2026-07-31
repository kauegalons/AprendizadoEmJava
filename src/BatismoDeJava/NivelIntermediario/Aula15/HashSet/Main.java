package BatismoDeJava.NivelIntermediario.Aula15.HashSet;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> aldeias = new HashSet<>();

        // Adicionando aldeias
        aldeias.add("Konoha");
        aldeias.add("Suna");
        aldeias.add("Kiri");
        aldeias.add("Konoha"); // Tentativa de duplicata

        // Exibindo as aldeias
        System.out.println("Aldeias participantes:");
        for (String aldeia : aldeias) {
            System.out.println(aldeia);
        }

        // Verificando se uma aldeia está presente
        System.out.println("Konoha está no torneio? " + aldeias.contains("Konoha"));

        // Removendo uma aldeia
        aldeias.remove("Kiri");
        System.out.println("Após remover Kiri: " + aldeias);
    }
}