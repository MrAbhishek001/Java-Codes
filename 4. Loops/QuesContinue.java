import java.util.Scanner;

//Q. : Display all Numbers enterd by user Except those of multiple of 10.

public class QuesContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the Number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            if (n == 101) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
