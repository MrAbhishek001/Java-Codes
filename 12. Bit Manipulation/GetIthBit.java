import java.util.Scanner;

public class GetIthBit {

    public static int GetBit(int n, int index) {
        return ((n & (1 << index)) >> index);
    }

    public static int SetBit(int n, int index) {
        return (n | (1 << index)); // Setbit is changing the bit to 1 at directed index.
    }

    public static int ClearBit(int n, int index) {
        return (n & ~(1 << index));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the index of bit to be found : ");
        int index = sc.nextInt();
        System.out.println("Bit at index : " + index + " position is : " + GetBit(n, index));
        System.out.println("Number After setting the bit is : " + SetBit(n, index));
        System.out.println("Number After Clearing the bit is : " + ClearBit(n, index));
    }
}
