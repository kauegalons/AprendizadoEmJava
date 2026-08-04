package BatismoDeJava.NivelAvancado.Aula1.AnaliseComplexidadeAlgoritmo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;


        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //O(n) - complexidade linear
        for(int i = 0; i < 10000500; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("------------------ Acessar -----------------------");


        inicio = System.nanoTime(); //quanto tempo a jvm leva para entender e rodar esse algoritimo
        arrayList.get(50);
        fim = System.nanoTime();
        tempo= fim-inicio;
        System.out.println("Tempo gasto para acessar o índice no ArrayList: " + tempo + " nanosegundos");


        inicio = System.nanoTime();
        linkedList.get(50);
        fim = System.nanoTime();
        tempo= fim-inicio;
        System.out.println("Tempo gasto para acessar o índice no LinkedList: " + tempo + " nanosegundos");


        System.out.println("------------------ Add -----------------------");

        inicio = System.nanoTime();
        arrayList.add(100);
        fim = System.nanoTime();
        tempo= fim-inicio;
        System.out.println("Tempo gasto para adicionar o índice no ArrayList: " + tempo + " nanosegundos");


        inicio = System.nanoTime();
        linkedList.add(100);
        fim = System.nanoTime();
        tempo= fim-inicio;
        System.out.println("Tempo gasto para adicionar o índice no LinkedList: " + tempo + " nanosegundos");




        System.out.println("------------------ Remove -----------------------");

        inicio = System.nanoTime();
        arrayList.remove(100);
        fim = System.nanoTime();
        tempo= fim-inicio;
        System.out.println("Tempo gasto para remover o índice no ArrayList: " + tempo + " nanosegundos");


        inicio = System.nanoTime();
        linkedList.remove(100);
        fim = System.nanoTime();
        tempo= fim-inicio;
        System.out.println("Tempo gasto para remover o índice no LinkedList: " + tempo + " nanosegundos");



    }
}
