import java.util.Scanner;

public class Palindromic {

    public static void Palin_Num_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Palin_Num_Pattern(n);
    }
}
