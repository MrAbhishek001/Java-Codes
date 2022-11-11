import java.util.ArrayList;

public class MultiList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(1 * i);
            list2.add(2 * i);
            list3.add(3 * i);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        // Nested loops to Print
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> CurList = mainList.get(i);
            System.out.print("List " + (i + 1) + " = ");
            for (int j = 0; j < CurList.size(); j++) {
                System.out.print(CurList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
