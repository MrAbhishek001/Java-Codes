import java.util.ArrayList;
import java.util.Collections;

public class Q2 {

    public static ArrayList<Integer> Lonely(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i + 1)) {
                ans.add(list.get(i));
            }
        }
        if (list.size() == 1) {
            ans.add(list.get(0));
        }
        if (list.size() > 1) {
            if (list.get(0) + 1 < list.get(1)) {
                ans.add(list.get(0));
            }
            if(list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                ans.add(list.get(list.size() - 1));
            }
        }
        return ans;
    }
5
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        System.out.println(Lonely(list));
    }
}
