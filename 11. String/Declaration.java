import java.util.Scanner;

public class Declaration {
    public static void main(String[] args) {
        String str1 = "Abhishek";
        String str2 = new String("Abhishek");

        // String are IMMUTABLE (i.e. Strings can't be changed.)

        // String Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // it will take only upto void spaces
        System.out.println(name);
        String FullName = sc.nextLine(); // It will take full line or sentence with void spaces
        System.out.println(FullName);
    }
}