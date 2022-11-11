import java.util.Scanner;

public class UpdateIthBit {

    public static int UpdateBit(int n, int index, int newBit) {
        n = (n & ~(1 << index));  // clearBit
        return n | (newBit << index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the index of the bit to be updated : ");
        int index = sc.nextInt();
        System.out.print("Updated Number is : " + UpdateBit(n, index, 0));
    }
}
