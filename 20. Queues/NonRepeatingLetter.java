import java.util.LinkedList;
import java.util.Queue;

public class NonRepeatingLetter {

    public static void Repetition(String str) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            q.add(str.charAt(i));
            freq[str.charAt(i) - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(q.peek());
            }
        }

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        Repetition(str);
    }
}
