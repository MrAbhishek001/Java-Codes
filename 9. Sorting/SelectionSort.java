import java.util.Arrays;

public class SelectionSort {

    public static String Increasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        return Arrays.toString(arr);
    }

    public static String Decreasing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxPos = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 6, 4, 1 };
        System.out.println("Increasing order = " + Increasing(nums));
        System.out.println("Decreasing order = " + Decreasing(nums));
    }
}
