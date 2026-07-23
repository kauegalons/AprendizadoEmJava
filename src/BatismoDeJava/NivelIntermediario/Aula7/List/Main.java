package BatismoDeJava.NivelIntermediario.Aula7.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Array:
        São estáticos, não podem mudar de tamanho.
         */
        String[] ninjasArray = new String [3];

        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sakura";
        ninjasArray[2] = "Sasuke";

        //printando array
        System.out.println("Array: " + ninjasArray[0]);

        //ou

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }

        /*
        List:
        Não são estáticas, podem aumentar e diminuir de tamanho
         */
        List<String> ninjasList = new ArrayList<>();
        //Adding elements to the list
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Kakashi Hatake");

        System.out.println("List: " + ninjasList);

        //Remove from List
        ninjasList.remove("Sasuke Uchiha");

        System.out.println("List after removing Sasuke: " + ninjasList);

        //Changing an element in the list
        ninjasList.set(1, "Sai Anbu");

        System.out.println("List after changing Sakura to Sai: " + ninjasList);

        //Seeing length of the list
        System.out.println("Size of the list: " + ninjasList.size());
    }
}
