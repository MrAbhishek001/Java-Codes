import java.util.Scanner;

public class DecimalToBinary {

    public static int DecToBin(int n) {
        int Binary = 0;
        int i = 0;
        while (n > 0) {
            Binary += (n % 2) * (int) Math.pow(10, i++);
            n /= 2;
        }
        return Binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Binary of " + n + " is : " + DecToBin(n));
    }
}
