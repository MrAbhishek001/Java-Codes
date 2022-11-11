import java.util.*;

public class OptimizedExponent {

    public static int Power(int base, int power) {  // Complexity : O(log n)
        if (power == 1) {
            return base;
        }
        int halfPower = Power(base, power / 2);
        int halfPowerSquare = halfPower * halfPower;
        if (power % 2 == 0) {
            return halfPowerSquare;
        } else {
            return base * halfPowerSquare;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x + " to the power " + n + " is : " + Power(x, n));
    }
}