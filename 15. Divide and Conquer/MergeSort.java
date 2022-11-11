import java.util.Arrays;

public class MergeSort {

    public static void Mergesort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        Mergesort(arr, si, mid);
        Mergesort(arr, mid + 1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // Merging Arrays in original Array
        for (i = 0, j = si; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
        // System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 3, 1, 15, 94, 54, 25 };
        Mergesort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}