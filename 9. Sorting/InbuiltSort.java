import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer[] nums = { 5, 8, 2, 4, 3, 6, 9 };
        // Arrays.sort(nums); // Inbuilt Sort
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));

        Integer[] nums2 = { 5, 8, 2, 4, 3, 6, 9 };
        Arrays.sort(nums2, 2, 6, Collections.reverseOrder()); // To sort between two Indices
        System.out.println(Arrays.toString(nums2));
    }
}
