import java.util.Scanner;

public class SortedAndRotatedArray {

    public static int Search(int[] arr, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] < arr[mid]) {
            if (target >= arr[si] && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            } else {
                return Search(arr, target, mid + 1, ei);
            }
        } else {
            if (target <= arr[ei] && target >= arr[mid]) {
                return Search(arr, target, mid + 1, ei);
            } else {
                return Search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int result = Search(arr, target, 0, arr.length - 1);
        System.out.println(target + " is found at Index : " + result);

    }
}
