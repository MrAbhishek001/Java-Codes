import java.util.Scanner;

public class InvertedHalfPyramid {

    public static void InvertHalfPyr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
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
        System.out.print("Enter the Number of Rows : ");
        int n = sc.nextInt();
        InvertHalfPyr(n);
    }
}
