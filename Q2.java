import java.util.Scanner;

// In a program, input the side of a square.You have to output the area of the square.
// (Hint : area of a square is (side x side))

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        System.out.println("Area of Square is " + side * side);
    }
}
