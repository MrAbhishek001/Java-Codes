import java.util.Scanner;

//Q.3 : Write a Java program that takes a year from the user and print whether that year
//      is a leap year or not.

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Leap Year");
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
