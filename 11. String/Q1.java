import java.util.Scanner;

//Q.1 : Count how many times lower case vowels occurred in a String entered by the user.

public class Q1 {

    public static int lowerVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("No. of lowercase vowels : " + lowerVowels(str));
    }
}
