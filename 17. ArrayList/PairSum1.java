import java.util.ArrayList;
import java.util.Arrays;

public class PairSum1 {

    public static void Pairsum(int[] arr, int target) {
        int sum = 0;
        int lp = 0, rp = arr.length - 1;
        int k = 0;
        while (lp < rp) {
            sum = arr[lp] + arr[rp];
            if (sum == target) {
                System.out.println("[" + arr[lp] + ", " + arr[rp] + "]");
                k = 1;
                lp++;
                rp--;
            } else if (sum > target) {
                rp--;
            } else {
                lp++;
            }
        }
        if (k == 0) {
            System.out.println("No Pairs Exist!!");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Pairsum(arr, 5);
    }
}
