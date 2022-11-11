import java.util.ArrayList;

public class PairSum2 {

    public static boolean Pairsum(ArrayList<Integer> list, int target) {
        int lp = 0, rp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                rp = i;
                lp = i + 1;
                break;
            }
        }
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % list.size();
            } else {
                rp = (list.size() + rp - 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(Pairsum(arr, 14));
    }
}
