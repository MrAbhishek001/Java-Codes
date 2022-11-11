import java.util.Scanner;

public class Binomial {

    public static int Fact(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int BinCoefficient(int n, int r) {
        return Fact(n) / (Fact(r) * Fact(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient is : " + BinCoefficient(n, r));
    }
}
