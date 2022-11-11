import java.util.*;

public class DequeB {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println("After removing first element, Deque : " + deque);
        deque.removeLast();
        System.out.println("After removing last element, Deque : " + deque);
        System.out.println("First Element of Deque : " + deque.getFirst());
        System.out.println("Last Element of Deque : " + deque.getLast());
    }
}
