import java.util.Scanner;

public class ClearLastIBits {

    public static int ClearBits(int n, int bits) {
        return n & ((~0) << bits);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the index of the bit upto which the bits to be cleared : ");
        int bits = sc.nextInt();
        System.out.println("Number after clearing " + bits + " is : " + ClearBits(n, bits));
    }
}
