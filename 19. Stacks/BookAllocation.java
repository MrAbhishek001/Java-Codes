import java.util.Scanner;

public class BookAllocation {

    public static int isPossible(int[] pages) {
        int[] max = new int[pages.length];
        // Case 1
        int m = 0;
        while (m < pages.length) {
            int sum1 = 0;
            int k;
            for (k = 0; k < m + 1; k++) {
                sum1 += pages[k];
            }
            int sum2 = 0;
            for (int j = k; j < pages.length; j++) {
                sum2 += pages[j];
            }
            max[m] = Math.max(sum1, sum2);
            m++;
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < max.length; j++) {
            ans = Math.min(ans, max[j]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] pages = { 10, 20, 30, 40 };
        // int sum = 0;
        // for (int i = 0; i < pages.length; i++) {
        // sum += pages[i];
        // }
        // System.out.println("Enter the Number of Students : ");
        // int n = sc.nextInt();
        System.out.println(isPossible(pages));
    }
}
