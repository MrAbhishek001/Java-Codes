import java.util.Stack;

public class TwoSatckQueue {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Using push() in O(n) Time Complexity
        public void addFirst(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public void remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is already Empty!!");
                return;
            }
            s1.pop();
        }

        public int peek() {
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.addFirst(1);
        q.addFirst(2);
        q.addFirst(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
