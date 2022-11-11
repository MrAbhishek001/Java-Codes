import java.util.Scanner;

public class NthFibonacciNumber {

    public static int Fibo(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + "th Fibonacci Number is : " + Fibo(n));
    }
}
