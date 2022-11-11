import java.util.*;

public class Syntax {

    public static int Sum(int n1, int n2) { // Parameters or Formal Parameters
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is : " + Sum(a, b)); // a, b are Arguments or Actual Parameters.
    }
}