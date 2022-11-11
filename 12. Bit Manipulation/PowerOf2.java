import java.util.Scanner;

public class PowerOf2 {

    public static boolean isPowerOf2(int n) {
        if (n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOf2(n));
    }
}
