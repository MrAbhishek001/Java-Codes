import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sum of n Natural Numbers
        int n = sc.nextInt();
        int Sum = 0;
        while (n != 0) {
            Sum += n;
            n--;
        }
        System.out.println(Sum);
    }
}
