import java.util.Stack;

public class ReverseString {

    public static StringBuilder Reverse(Stack<Character> s, String str, StringBuilder newStr) {
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()) {
            newStr.append(s.pop());
        }
        return newStr;
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "Abhishek";
        StringBuilder newStr = new StringBuilder();
        System.out.println(Reverse(s, str, newStr));
        System.out.println(s.capacity());
        System.out.println(newStr);
    }
}
