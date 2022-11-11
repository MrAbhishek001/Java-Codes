import java.util.LinkedList;

public class LinkedListCollections {
    public static void main(String[] args) {
        // declaration
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);
        System.out.println("List : " + list);
        list.removeFirst();
        list.remove(1);
        System.out.println("After Removing elements : " + list);
    }
}
