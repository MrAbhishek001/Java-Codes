import java.util.Scanner;

public class Sum {

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum = " + Sum(n));
    }
}
