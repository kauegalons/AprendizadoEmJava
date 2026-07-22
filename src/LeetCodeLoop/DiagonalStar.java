package LeetCodeLoop;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(4);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        for (int linha = 1; linha <= number; linha ++){
            for (int coluna = 1; coluna <= number; coluna ++){
                if (linha == 1 || linha == number || coluna == 1 || coluna == number || linha == coluna || coluna == number - linha +1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}