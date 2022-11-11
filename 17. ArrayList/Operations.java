import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add an Element to the List
        list.add(1); // TC = O(1);
        list.add(10);
        list.add(45);
        list.add(76);
        System.out.println("Original List : " + list);

        // Size Of ArrayList
        System.out.println("Size of the list : " + list.size());

        // Add element at index
        list.add(3, 52); // TC = O(n)
        System.out.println("List after adding element at index : " + list);

        // Get an element froim the list
        int element = list.get(2); // TC = O(1)
        System.out.println("Element at Required index : " + element);

        // Remove element from list
        list.remove(2); // TC = O(n)
        System.out.println("List After Deletion : " + list);

        // Set an element at any index
        list.set(2, 56); // TC = O(n)
        System.err.println("list after setting element : " + list);

        // Contains an element
        boolean ans = list.contains(5); // TC = O(n)
        boolean ans2 = list.contains(10);
        System.out.println(ans);
        System.out.println(ans2);

        // Iterating over the list and printing elements of the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
