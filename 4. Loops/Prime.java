import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = 1;
        int n = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = 0;
                break;
            } else {
                continue;
            }
        }
        if (prime == 1 || n == 2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }
}
