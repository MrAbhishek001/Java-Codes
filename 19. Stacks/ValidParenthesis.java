import java.util.Stack;

public class ValidParenthesis {

    public static boolean Validity(String str) {
        Stack<Character> s = new Stack<>();
        if (str.length() == 0) {
            System.out.println("Not a Valid String");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                if(s.isEmpty()) {
                    return false;
                }
                if (str.charAt(i) == ')' && s.peek() != '(') {
                    return false;
                } else if (str.charAt(i) == '}' && s.peek() != '{') {
                    return false;
                } else if (str.charAt(i) == ']' && s.peek() != '[') {
                    return false;
                } else {
                    s.pop();
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(Validity(str));
        ;
    }
}
