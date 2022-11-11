import java.util.Scanner;

public class IncreasingNumbers {

    public static void Print_Inc_Num(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        Print_Inc_Num(n - 1);
        System.err.print(n + " ");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Print_Inc_Num(n);
        }
    }
}
