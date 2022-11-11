import java.util.Scanner;

// Q.5 : Write a Java method to compute the sum of the digits in an integer.

public class Q5 {

    public static int SumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The Sum of digits of " + n + " is " + SumOfDigits(n));
    }
}
