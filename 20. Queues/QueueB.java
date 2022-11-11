public class QueueB {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full!!");
                return;
            }
            rear += 1;
            arr[rear] = data;
        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is already Empty!!");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear -= 1;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}