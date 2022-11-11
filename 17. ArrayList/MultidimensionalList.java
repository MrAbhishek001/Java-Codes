import java.util.ArrayList;

public class MultidimensionalList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(54);
        arr.add(86);
        mainList.add(arr);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(62);
        mainList.add(list);
        System.out.println(mainList);

        // Printing Lists of mainList
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> newlist = mainList.get(i);
            System.out.print("List " + (i + 1) + " = ");
            for (int j = 0; j < newlist.size(); j++) {
                System.out.print(newlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
