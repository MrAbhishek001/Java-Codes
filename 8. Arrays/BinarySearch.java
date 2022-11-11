import java.util.Scanner;

public class BinarySearch {

    public static int Bin_Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int target = sc.nextInt();
        if (Bin_Search(nums, target) == -1) {
            System.out.println("not Found!!");
        } else {
            System.out.println("The target element is at index = " + Bin_Search(nums, target));
        }
    }
}
