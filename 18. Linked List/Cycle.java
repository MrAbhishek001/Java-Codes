public class Cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void isCycle() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                flag = true;
                System.out.println("Cycle is present in Linked List!!");
                break;
            }
        }
        if (flag == false) {
            System.out.println("Cycle is not present in Linked List!!");
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
        System.out.print("After REmoving Cycle the Resultant Linked List : ");
        print();
    }

    public static void print() {
        Node p = head;
        System.out.print("Linked List : ");
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        // Linked List : 1->2->3->4->5->1
        System.out.println();
        isCycle();
    }
}
