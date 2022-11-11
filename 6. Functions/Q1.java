import java.util.Scanner;

// Q.1 : Write a Java method to compute the averageof three numbers..

public class Q1 {

    public static float Average(int a, int b, int c) {
        return (float) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average is :  " + Average(a, b, c));
    }
}
