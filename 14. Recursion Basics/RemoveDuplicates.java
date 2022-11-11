import java.util.Scanner;

public class RemoveDuplicates {

    // Without Recursion
    public static StringBuilder Remove_Dupli(String str) {
        StringBuilder newStr = new StringBuilder();
        boolean[] map = new boolean[26];
        int i = 0;
        while (i != str.length()) {
            if (map[str.charAt(i) - 'a'] == false) {
                newStr.append(str.charAt(i));
            }
            map[str.charAt(i) - 'a'] = true;
            i++;
        }
        return newStr;
    }

    // UsingRecursion
    public static StringBuilder Remove_Duplic(String str, StringBuilder newStr, boolean[] map, int i) {
        if (i == str.length()) {
            return newStr;
        }
        // Check if character is present or not and take the char in new string
        if (map[str.charAt(i) - 'a'] == true) {
            Remove_Duplic(str, newStr, map, i + 1);
        } else {
            newStr.append(str.charAt(i));
        }
        // ENter true for if char comes
        map[str.charAt(i) - 'a'] = true;
        Remove_Duplic(str, newStr, map, i + 1);
        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder newStr = new StringBuilder(); // Yahi define karenge else ye bar
        boolean[] map = new boolean[26]; // bar define hoga during Recursion Call
        System.out.println("After removing Duplicates, str : " + Remove_Dupli(str));
        System.out.println("After removing Duplicates, str : " + Remove_Duplic(str, newStr, map, 0));
    }
}
