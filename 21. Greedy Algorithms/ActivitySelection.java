import java.util.ArrayList;

public class ActivitySelection {

    public static int Solutions(int[] start, int[] end) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        int chosen_Ac = 0;
        ans.add(0);
        for (int j = 1; j < end.length; j++) {
            if (start[j] >= end[chosen_Ac]) {
                count++;
                ans.add(j);
                chosen_Ac = j;
            }
        }
        System.out.println("Chosen Activities are : " + ans);
        return count;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        System.out.println("Total activities : " + Solutions(start, end));
    }
}