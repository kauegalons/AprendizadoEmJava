package BatismoDeJava.NivelAvancado.Aula1.IntroducaoBigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- Exemplo de complexidade com ninjas ----------------\n");


        ArrayList<Ninjas> ninjas = new ArrayList<>();
        ninjas.add(new Ninjas("Naruto", 17));
        ninjas.add(new Ninjas("Sasuke", 17));
        ninjas.add(new Ninjas("Sakura", 17));

        // Algoritmo - o(1) - Complexidade constante
        System.out.println("Exemplo de complexidade constante:");
        System.out.println(ninjas.get(1)); // O(1) - acesso direto ao índice 0
        System.out.println("\n");

        //Algoritimo - o(n) - Complexidade linear
        System.out.println("Exemplo de complexidade linear:");
        for (Ninjas ninja : ninjas) {
            System.out.println(ninja); // O(n) - iteração sobre todos os elementos da lista
        }
        System.out.println("\n");

        //Algoritimo - o(n^2) - Complexidade quadrática
        System.out.println("Exemplo de complexidade quadrática:");
        for (int i = 0; i<ninjas.size(); i++){
            for (int j = 0; j<ninjas.size(); j++){
                System.out.println(ninjas.get(i).nome + " vs " + ninjas.get(j).nome);
            }
        }
        System.out.println("\n");


        System.out.println("---------- Exemplos de complexidade de tempo ----------------");

        // O(1) - complexidade constante
        int[] array = {1, 2, 3, 4, 5};
        int elemento = array[2]; // Acesso direto ao índice 2
        System.out.println("Elemento no índice 2: " + elemento);

        // O(n) - complexidade linear
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        System.out.println("Soma dos elementos: " + soma);

        // O(n^2) - complexidade quadrática
        System.out.println("Tabela de multiplicação:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
