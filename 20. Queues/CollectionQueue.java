import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        // Implrementation using ArrayDeque<>()
        q.add(1);
        q.add(2);
        q.add(30);
        System.out.println(q);
        q.remove();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);

        // Implrementation using LinkedList<>()
        Queue<Integer> r = new LinkedList<>();
        r.add(1);
        r.add(30);
        r.add(2);
        System.out.println(r);
        r.remove();
        System.out.println(r.peek());
        r.remove();
        System.out.println(r);
    }
}