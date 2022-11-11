import java.util.Arrays;

public class InsertionSort {

    public static String IncSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int Current = arr[i];
            int j = i - 1;
            while (j >= 0 && Current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            System.out.println(j);
            // Placement
            arr[j + 1] = Current;
        }
        return Arrays.toString(arr);
    }

    public static String DecSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int Current = arr[i];
            int j = i - 1;
            while (j >= 0 && Current > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Placement
            arr[j + 1] = Current;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 3, 2 };
        System.out.println("Increasing Order : " + IncSort(nums));
        System.out.println("Decreasing Order : " + DecSort(nums));
    }
}
