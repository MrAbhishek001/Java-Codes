import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("Popped element is : " + s.pop());
        System.out.println("The top element in Stack is : " + s.peek());
        System.out.println("The Stack is : ");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
