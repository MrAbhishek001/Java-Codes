import java.util.Stack;

public class TwoStackQueue {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Using push() in O(n) Time Complexity
        public void addFirst(int data) {
            s1.push(data);
        }

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Already Empty!!");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int ans = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return ans;
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
            System.out.println(q.remove());
        }
    }
}
