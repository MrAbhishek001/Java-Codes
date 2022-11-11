import java.util.Scanner;

public class Exponent {

    public static int Power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * Power(base, power - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x + " to the power " + n + " is : " + Power(x, n));
    }
}
