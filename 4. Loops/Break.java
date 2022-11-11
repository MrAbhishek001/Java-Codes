import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter the Number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
        }
    }
}
