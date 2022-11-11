import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };

        double[][] ratio = new double[value.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        // Ascending Order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = 50;
        int ans = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
                ans += weight[idx] * ratio[i][1];
                capacity -= weight[idx];
            } else {
                weight[idx] = capacity;
                ans += weight[idx] * ratio[i][1];
                break;
            }
        }
        System.out.println("Maximum Total VAlue : " + ans);
    }
}
