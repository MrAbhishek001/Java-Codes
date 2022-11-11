import java.util.Stack;

public class ReverseStack {

    public static void Bottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        Bottom(s, data);
        s.push(top);
    }

    public static void Reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        // Popping out elements
        int top = s.pop();
        Reverse(s);
        Bottom(s, top);
    }

    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("Before Reversing Stack : " + s);
        Reverse(s);
        System.out.println("After Reversing the Stack : " + s);
    }
}
