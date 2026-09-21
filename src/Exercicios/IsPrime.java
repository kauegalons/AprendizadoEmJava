package Exercicios;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("The number is prime: " + isPrime(23));
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Check for factors from 2 to the square root of the number
        // This is more efficient than checking up to number - 1
        // because if a number is divisible by any number greater than its square root,
        // it must also be divisible by a number smaller than its square root.
        // For example, if 36 is divisible by 9 (which is greater than its square root, 6),
        // it is also divisible by 4 (which is smaller than its square root).
        // Therefore, we only need to check for factors up to the square root of the number.
        // This reduces the number of iterations needed to determine if a number is prime,
        // especially for larger numbers.
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}