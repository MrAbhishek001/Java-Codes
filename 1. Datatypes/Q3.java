import java.util.Scanner;

// Enter cost of 3 items from the user(using float data type)-a pencil,a pen and an eraser. 
// You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int $ = 24; // It Won't give any Error          : Question 5
        float C1 = sc.nextFloat(); // Cost of pencil
        float C2 = sc.nextFloat(); // Cost of pen
        float C3 = sc.nextFloat(); // Cost of eraser
        float Tcost = C1 + C2 + C3;
        double bill = Tcost + (.18 * Tcost);
        System.out.println("Total Cost of items are : " + Tcost + "  and Bill is " + bill);
    }
}
