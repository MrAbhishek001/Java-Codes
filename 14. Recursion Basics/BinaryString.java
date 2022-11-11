import java.util.Scanner;

public class BinaryString {

    public static void Bin_String(int n, String str, int lp) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        Bin_String(n - 1, str + "0", 0);
        if (lp == 0) {
            Bin_String(n - 1, str + "1", 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        System.out.println("Binary Strings are : ");
        Bin_String(n, str, 0);
    }
}
