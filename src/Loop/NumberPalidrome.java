package Loop;

public class NumberPalidrome {

    public static void main(String[] args) {
        System.out.println("The number is palindrome: " + isPalindrome(-1221));
        System.out.println("The number is palindrome: " + isPalindrome(707));
        System.out.println("The number is palindrome: " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /=10;
        }
        return number == reverse;
    }
}