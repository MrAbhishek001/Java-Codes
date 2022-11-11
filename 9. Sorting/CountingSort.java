import java.util.Arrays;

public class CountingSort {

    public static String sort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest + 1];
        System.out.println(count.length);
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.println(count.length);
        System.out.println(Arrays.toString(count));
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 1, 3, 2, 4, 3, 7, 5, 5, 1 };
        System.out.println("Sorted Array : " + sort(nums));
    }
}
