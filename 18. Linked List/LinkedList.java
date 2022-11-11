import java.util.Scanner;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head; // Bcoz there exists only one Head and tail so they are declared once in class
                             // as Static
    public static Node Tail;
    public static int size; // By default Java initiates Size = 0

    // Function to add an element in the begining of Linked List
    public void addFirst(int data) { // Time Complexity : O(1)
        // Step 1 : Create new Node
        Node newNode = new Node(data);
        size++; // Will update the size of Linked List
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        // Step 2 : new Node - next = Head
        newNode.next = Head;
        // Step 3 : Head = newNode
        Head = newNode;
    }

    // Function to Add Element at last of the Linked List
    public void addLast(int data) {
        // Step 1 : Create a node
        Node newNode = new Node(data);
        size++; // Will update the size of Linked List
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        // Step : 2 => tail next = new Node
        Tail.next = newNode;
        // step 3 : tail = new Node
        Tail = newNode;
    }

    // Function to Add Element in Middle Linked List
    public void addMid(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        int i = 0;
        while (i < (index - 1)) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Function to remove First Element in Linked List
    public int removeFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int var = Head.data;
            Head = Tail = null;
            size--;
            return var;
        }
        int var = Head.data;
        Head = Head.next;
        size--;
        return var;
    }

    // Function to remove Last Element in Linked List
    public int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int var = Head.data;
            Head = Tail = null;
            size--;
            return var;
        }
        int var;
        Node prev = Head;
        int i = 0;
        while (i < (size - 2)) {
            prev = prev.next;
            i++;
        }
        var = Tail.data; // prev.next.data
        prev.next = null;
        size--;
        Tail = prev;
        return var;
    }

    // Iterative Function to Search in Linked List
    public int Search(int target) {
        Node p = Head;
        int i = 0;
        while (p != null) {
            if (p.data == target) {
                return i;
            }
            p = p.next;
            i++;
        }
        return -1;
    }

    // Iterative Function to Search in Linked List
    public int Rec_Search(Node Head, int target, int i) {
        if (Head == null) {
            return -1;
        }
        if (Head.data == target) {
            return i;
        }
        return Rec_Search(Head.next, target, i + 1);
    }

    // Function to reverse Linked List
    public void reverse() {
        Node prev = null;
        Node Curr = Tail = Head;
        Node next;
        while (Curr != null) {
            next = Curr.next;
            Curr.next = prev;
            prev = Curr;
            Curr = next;
        }
        Head = prev;
    }

    // Function to delete Nth Node from the end of Linked List
    public void deleteNthfromLast(int n) {
        // Calculate Size of Linked List
        int sz = 0;
        Node temp = Head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz == n) {
            Head = Head.next;
            return;
        }
        int i = 1;
        Node prev = Head;
        while (i < (sz - n)) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
    }

    // Function to print elements of Linked List
    public void print() {
        if (Head == null) {
            System.out.println("Linked list is Empty!!");
        }
        Node temp = Head;
        System.out.print("Linked List : ");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.print();
        System.out.print("Enter the element to be Inserted and its index in the List : ");
        int n = sc.nextInt();
        int index = sc.nextInt();
        list.addMid(index, n);
        System.out.print("Linked List After insertion of element at given index : ");
        list.print();
        System.out.print("Enter the target element to be Searched(Iterative) in the List : ");
        int target = sc.nextInt();
        System.out.println("The Element is found at index : " + list.Search(target)); // Iterative Search
        System.out.print("Enter the target element to be Searched(Recursive) in the List : ");
        int key = sc.nextInt();
        System.out.println("The Element is found at index : " + list.Rec_Search(Head, key, 0)); // Recursive Search
        System.out.println("Removed Data at the begining of Linked List = " + list.removeFirst());
        System.out.println("Removed Data at last of Linked List : " + list.removeLast());
        list.print();
        System.out.println("The Size of Linked List is : " + size);
        list.reverse();
        System.out.print("Reverse ");
        list.print();
        list.deleteNthfromLast(3);
        System.out.print("After Deleting at given index Resultant ");
        list.print();
    }
}