import java.util.Scanner;

//Q.3 : Write a Java program to check if a number is a palindrome in Java?
// (121 is a palindrome, 321 is not) A number is called a palindrome if the number is 
// equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 
// is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321
// is 123, which is not equal to 321.

public class Q3 {

    public static boolean isPalindrome(int n) {
        int original = n;
        int Palin = 0;
        while (n > 0) {
            Palin = (Palin * 10) + (n % 10);
            n /= 10;
        }
        if (Palin == original) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Given Number is Palindrome.");
        } else {
            System.out.println("Given Number is Not Palindrome.");
        }
    }
}
