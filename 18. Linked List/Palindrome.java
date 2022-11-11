public class Palindrome {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Finding Mid Node by Slow-Fast Approach / Turtle-Hare Approach
    public Node findMid(Node head) { // Helper Function
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Becoz slow is my mid Node
    }

    // Function to check if Linked List is Palindrome or Not
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // Find Mid of Linked List
        Node midNode = findMid(head);
        // Reverse the Second Half Of Linked List
        Node prev = null;
        Node Curr = midNode;
        Node next;
        while (Curr != null) {
            next = Curr.next;
            Curr.next = prev;
            prev = Curr;
            Curr = next;
        }
        Node Right = prev; // SEcond Half ka Head
        Node Left = head;
        // Compare First and Second half of the Linked List
        while (Right != null) {
            if (Left.data != Right.data) {
                return false;
            }
            Left = Left.next;
            Right = Right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome list = new Palindrome();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        if (list.isPalindrome()) {
            System.out.println("Linked List is Palindrome!!");
        } else {
            System.out.println("Linked List is not a Palindrome!!");
        }
    }
}
