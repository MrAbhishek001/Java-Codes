public class ZigZAgLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node findMid() {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void zigZag() {
        // Find the mid Node
        Node mid = findMid();
        // REverse the second half
        Node prev = null;
        Node Curr = mid;
        Node next;
        while (Curr != null) {
            next = Curr.next;
            Curr.next = prev;
            prev = Curr;
            Curr = next;
        }
        Node RH = prev;
        Node LH = head;
        Node temp_L = null;
        Node temp_R = null;
        // Coneecting the Left and Right Halves in Zog Zag manner
        while (RH != null && LH != null) {
            temp_L = LH.next;
            LH.next = RH;
            temp_R = RH.next;
            RH.next = temp_L;
            LH = temp_L;
            RH = temp_R;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZAgLinkedList list = new ZigZAgLinkedList();
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.print();
        list.zigZag();
        list.print();
    }
}
