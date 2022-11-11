import java.util.Arrays;

public class BubbleSort {

    public static String Increasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static String Decreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 3, 6, 2 };
        System.out.println("Increasing order = " + Increasing(nums));
        System.out.println("Decreasing order = " + Decreasing(nums));
    }
}