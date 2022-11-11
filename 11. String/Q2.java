import java.util.Arrays;

/*Q.2 : Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order, they can be said 
to be anagrams. 
Consider race and care. In this case, race's characters can be formed into a study, 
or care's characters can be formed into race. 
Below is a java program to check if two strings are anagrams or not. */

public class Q2 {

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        // Convert Strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check if the lengths are same
        if (str1.length() == str2.length()) {
            // Convert Strings to charArray
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // sort the charArrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // If sorted char arrays are equal then Strings are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are Anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not Anagrams.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not Anagrams.");
        }
    }
}
