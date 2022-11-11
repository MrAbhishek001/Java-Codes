public class LinkedListStack {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if(top == null) {
            return -1;
        }
        int var = top.data;
        top = top.next;
        return var;
    }

    public int peek() {
        return top.data;
    }

    public void display() {
        Node temp = top;
        System.out.println("The Stack is : ");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListStack list = new LinkedListStack();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.display();
        System.out.println("Popped element is : " + list.pop());
        System.out.println("The top element in Stack is : " + list.peek());
        list.display();
    }
}
