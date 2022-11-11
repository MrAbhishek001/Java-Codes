import java.util.Scanner;

public class FloydsTriangle {

    public static void Print_Floyd(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int n = sc.nextInt();
        Print_Floyd(n);
    }
}
