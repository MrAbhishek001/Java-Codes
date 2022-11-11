import java.util.Scanner;

public class Factorial {

    public static int Fact(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + Fact(n));
    }
}
