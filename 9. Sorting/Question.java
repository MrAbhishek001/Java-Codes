import java.util.Arrays;

public class Question {

    public static String BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
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

    public static String SelectionSort(int[] arr) {

        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("Bubble Sort : " + BubbleSort(nums));
        System.out.println(SelectionSort(nums));
    }
}
