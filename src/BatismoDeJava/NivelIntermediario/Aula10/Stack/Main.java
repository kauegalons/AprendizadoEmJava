package BatismoDeJava.NivelIntermediario.Aula10.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        // São estáticos e tem referência de memória prévia (temos que dizer quantos elementos tem nele_
        String[] ninjasArray = new String[10];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";

        // List
        // São dinâmicas, aumentam e diminuem conforme precisam
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        System.out.println("Minha stack atual: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha stack atualizada com pop: " + ninjasStack);
        System.out.println("Minha stack atualizada com peek(elemento do topo): " + ninjasStack.peek());
        System.out.println("Tamanho da stack: " + ninjasStack.size());
    }
}
