import java.util.Scanner;

public class FriendsPairing {

    public static int PairingWays(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // For first choice as Single
        int w1 = PairingWays(n - 1);
        // For first Choice as pair
        int w2 = (n - 1) * PairingWays(n - 2);
        return w1 + w2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total Number of ways : " + PairingWays(n));
    }
}
