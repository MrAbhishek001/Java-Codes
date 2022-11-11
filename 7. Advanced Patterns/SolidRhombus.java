import java.util.*;

public class SolidRhombus {

    public static void Sol_Rhomb_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n + 5 - i); j++) {
                if (j <= (n - i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sol_Rhomb_Pattern(n);
    }
}
