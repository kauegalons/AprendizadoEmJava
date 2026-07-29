package BatismoDeJava.NivelIntermediario.Aula12.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] nomeNinjaArray = new String[7];

        List<String> nomeNinjaList = new ArrayList<>();

        Stack<String> nomeNinjaStack = new Stack<>();

        //QUEUE - FILA
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Shikamaru Nara");

        //mostrar a fila
        System.out.println("Fila de ninjas: " + ninjasQueue);

        //tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Fila de ninjas após remover o Head: " + ninjasQueue);

        //Como ver quem é o primeiro
        ninjasQueue.peek();
        System.out.println("O Head da fila é: " + ninjasQueue.peek());

        //Adicionar a fila
        ninjasQueue.add("kiba Inuzuki");
        System.out.println("Fila de ninjas: " + ninjasQueue);

        //Não tem como retirar o tail sem remover todos os elementos da fila, pois a fila é FIFO (First In First Out)

        //Verificar se está vazio

        if(ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }

        //Esvaziar a fila
        ninjasQueue.clear();
        System.out.println("Fila de ninjas após esvaziar: " + ninjasQueue);


    }
}
