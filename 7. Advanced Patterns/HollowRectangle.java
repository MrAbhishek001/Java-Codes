import java.util.Scanner;

public class HollowRectangle {

    public static void Hollow_Rectangle(int n1, int n2) {
        for (int row = 1; row <= n1; row++) {
            for (int col = 1; col <= n2; col++) {
                if (row == 1 || row == n1 || col == 1 || col == n2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns : ");
        int col = sc.nextInt();
        Hollow_Rectangle(row, col);
    }
}