package BatismoDeJava.NivelIntermediario.Aula13.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
            Todas elas implementam a interface Collections
         */

        //Classes
        ArrayList<String> nomes = new ArrayList<>();
        Stack<String> pilha = new Stack<>();
        LinkedList<String> lista = new LinkedList<>();


        //Interfaces
        Queue<String> fila = new LinkedList<>();

        //Classe que implementa o Queue
        PriorityQueue<Integer> pilha2 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pilha3 = new PriorityQueue<>(Collections.reverseOrder());

        pilha2.offer(1);
        pilha2.offer(3);
        pilha2.offer(2);

        System.out.println("pilha2: " + pilha2);

        pilha2.poll();
        System.out.println("pilha2: " + pilha2);

        System.out.println("---------------------");

        pilha3.offer(1);
        pilha3.offer(3);
        pilha3.offer(2);

        System.out.println("pilha3: " + pilha3);

        pilha3.poll();
        System.out.println("pilha3: " + pilha3);

    }
}
