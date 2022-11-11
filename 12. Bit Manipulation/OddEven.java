import java.util.Scanner;

public class OddEven {

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
