import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(65);
        list.add(4);
        list.add(51);
        list.add(24);
        // Max Element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max value in the list : " + max);
    }
}
