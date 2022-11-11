import java.util.Scanner;

public class BinaryToDecimal {

    public static int BinToDec(int n) {
        int sum = 0;
        int i = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(2, i++) * rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Decimal of " + n + "is : " + BinToDec(n));
    }
}
