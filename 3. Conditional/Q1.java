import java.util.Scanner;

//Q.1 :Write a Java program to get a number from the user and print whether it is 
//     positive or negative.

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Nature = (n >= 0) ? "Positive" : "Negative";
        System.out.println(Nature);
    }
}
