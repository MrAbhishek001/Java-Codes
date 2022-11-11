public class DoublyList {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Linked List is already empty!!");
        }
        if (size == 1) {
            head = tail = null;
            size--;
        } else {
            Node temp = head.next;
            temp.prev = null;
            size--;
            head = temp;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Linked List is already empty!!");
        }
        if (size == 1) {
            head = tail = null;
            size--;
        } else {
            Node temp = tail.prev;
            temp.next = null;
            size--;
            tail = temp;
        }
    }

    public void reverse() {
        Node prev = null;
        Node Curr = head;
        Node next;
        while (Curr != null) {
            next = Curr.next;
            Curr.next = prev;
            Curr.prev = next;

            prev = Curr;
            Curr = next;
        }
        head = prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(6);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        System.out.println("Size of the Linked Lsit is : " + size);
        list.reverse();
        System.out.print("Reversed Linked List : ");
        list.print();
    }
}