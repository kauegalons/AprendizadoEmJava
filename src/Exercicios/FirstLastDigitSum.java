package Exercicios;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of first and last digit: " + sumFirstAndLastDigit(252) );
        System.out.println("Sum of first and last digit: " + sumFirstAndLastDigit(257) );
        System.out.println("Sum of first and last digit: " + sumFirstAndLastDigit(0) );
        System.out.println("Sum of first and last digit: " + sumFirstAndLastDigit(-5) );
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int LastDigit = number % 10;
        int FirstDigit = number;

        while (FirstDigit >= 10) {
            FirstDigit /= 10;
        }

        return FirstDigit + LastDigit;
    }

}