import java.util.Scanner;

public class HollowRhombus {

    public static void Hol_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int k = 1; k <= n; k++) {
                    if (k == 1 || k == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hol_Rhombus(n);
    }
}
