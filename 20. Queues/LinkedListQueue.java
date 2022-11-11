public class LinkedListQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node front = null;
        static Node rear = null;

        public boolean isEmpty() {
            return front == null && rear == null;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is already Empty!!");
                return;
            }
            if (rear == front) {
                rear = front = null;
            } else {
                front = front.next;
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is already Empty!!");
                return -1;
            } else {
                return front.data;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.addFirst(1);
        q.addFirst(1);
        q.addFirst(2);
        q.addFirst(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
