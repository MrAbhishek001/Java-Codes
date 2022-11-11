public class StringSubsets {

    public static void Subsets(String str, String ans, int si) {
        // Base Case
        if (si == str.length()) {
            if (ans.length() == 0) {
                System.out.print("Null ");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }
        // Yes Choice
        Subsets(str, ans + str.charAt(si), si + 1);
        // No Choice
        Subsets(str, ans, si + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        Subsets(str, ans, 0);
    }
}
