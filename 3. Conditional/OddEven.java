import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 0) {
            System.out.println("Given Number is Even");
        } else {
            System.out.println("Given Number is Odd");
        }
    }
}