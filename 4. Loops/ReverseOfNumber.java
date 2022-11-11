import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int Reverse = 0;
        while (n != 0) {
            int rem = n % 10;
            Reverse = (Reverse * 10) + rem;
            n /= 10;
        }
        System.out.println(Reverse);
    }
}
