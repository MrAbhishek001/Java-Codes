import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // Entering elements in the list
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // Print the list
        System.out.println("Original List : " + list);
        // Reverse the list
        System.out.print("After Reversing the List : ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
