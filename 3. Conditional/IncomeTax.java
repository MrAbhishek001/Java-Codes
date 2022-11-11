import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Income : ");
        int income = sc.nextInt();
        if (income <= 500000) {
            System.out.println("Amount of payable tax is 0");
        } else if (income > 500000 && income <= 1000000) {
            System.out.println("Amount of payable tax is : " + 0.2 * (income - 500000));
        } else {
            System.out.println("Amount of payable tax is : " + 0.3 * (income - 1000000));
        }
    }
}
