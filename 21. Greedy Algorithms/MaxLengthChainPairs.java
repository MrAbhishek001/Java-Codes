import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairs {  // TC : O(nlogn)
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int Chain_Len = 1;
        int Chain_end = 0;
        for (int i = 1; i < 5; i++) {
            if (pairs[i][0] > pairs[Chain_end][1]) {
                Chain_Len++;
                Chain_end = i;
            }
        }
        System.out.println("Length of Chain : " + Chain_Len);
    }
}
