import java.util.Scanner;

// Q.2 : Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even, or false otherwise.
// Also write a program to test your method.

public class Q2 {

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("Number is Even.");
        } else {
            System.out.println("Number is Odd.");
        }
    }
}
