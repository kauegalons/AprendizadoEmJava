package NivelBasico;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nomesNinja = new String[5];

        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        int i = 0;

        while (opcao != 3) {
            switch (opcao) {
                case 1:

                    char escolha;

                    do {
                        if (i >= nomesNinja.length) {
                            System.out.println("Lista cheia!");
                            break;
                        }

                        System.out.println("Digite o nome do ninja: ");
                        sc.nextLine();
                        nomesNinja[i] = sc.nextLine();


                        System.out.println("Deseja adicionar um ninja s/n: ");
                        escolha = sc.next().charAt(0);
                        i++;
                    }while (escolha == 's');
                    break;

                case 2:
                    if (i == 0) {
                        System.out.println("nenhum ninja!");
                        break;
                    }
                    for (int j = 0; j < 5; j++) {
                        System.out.println(nomesNinja[j]);
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida, tente novamente.");
                    break;
            }
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
        }




    }
}
