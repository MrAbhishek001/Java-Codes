import java.util.Arrays;

public class ReverseArray {

    public static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 12, 213, 11, 10, 5, 94, 57, 1 };
        Reverse(nums);
        System.out.println("Reversed Array is : " + Arrays.toString(nums));
    }
}
