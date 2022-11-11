import java.util.Arrays;

public class QuickSort {

    public static void Quicksort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivIdx = partition(arr, si, ei);
        Quicksort(arr, si, pivIdx - 1);
        Quicksort(arr, pivIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        System.out.println(Arrays.toString(arr));
        System.out.println("i : " + i);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 5, 2, 9, 16, 24, 15, 94, 108, 5 };
        Quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
