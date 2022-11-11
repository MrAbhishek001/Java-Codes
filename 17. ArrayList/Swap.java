import java.util.ArrayList;

public class Swap {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(65);
        list.add(4);
        list.add(51);
        list.add(24);
        System.out.println("Before Swapping : " + list);
        swap(list, 2, 4);
        System.out.println("After Swapping : " + list);
    }
}
