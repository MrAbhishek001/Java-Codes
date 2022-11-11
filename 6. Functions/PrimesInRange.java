import java.util.Scanner;

public class PrimesInRange {

    public static void isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.print(n + " ");
        }
    }

    public static void PrimesinRange(int n) {
        for (int i = 2; i <= n; i++) {
            isPrime(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimesinRange(n);
    }
}
