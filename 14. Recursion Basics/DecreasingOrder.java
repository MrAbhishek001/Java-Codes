import java.util.Scanner;

public class DecreasingOrder {

    public static void Print_Dec_num(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        Print_Dec_num(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print_Dec_num(n);
    }
}