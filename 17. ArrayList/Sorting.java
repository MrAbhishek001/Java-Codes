import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(65);
        list.add(4);
        list.add(51);
        list.add(24);
        System.out.println("Before Sorting : " + list);
        Collections.sort(list); // Ascending Order
        System.out.println("After Sorting (Ascending) : " + list);
        // For Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After Sorting (Descending) : " + list);

    }
}
