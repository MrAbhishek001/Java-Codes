public class Permutation {

    public static void Permutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Time Complexity == O(n * n!);
        for (int i = 0; i < str.length(); i++) {
            char Curr = str.charAt(i);
            // Now remove the Character from the String
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            Permutations(NewStr, ans + Curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        Permutations(str, ans);
    }
}
