import java.util.Scanner;

public class FastExponentiation {

    public static int FastExpo(int n, int power) {
        int ans = 1;
        while (power > 0) { // POwer ko Binary form me change krke use kar rhe hai
            if ((power & 1) != 0) {
                ans *= n;
            }
            n *= n;
            power = power >> 1;  
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();
        System.out.println("Ans : " + FastExpo(n, power));
    }
}
