import java.util.Arrays;

public class ArraysBacktrack {

    public static void Backtrack(int[] arr, int si) {
        if (si == arr.length) {
            // while (si >= 1) {
            // arr[si - 1] -= 2;
            // si--;
            // }
            System.out.println("Before BackTracking Array : " + Arrays.toString(arr));
            return;
        }
        arr[si] = si + 1;
        Backtrack(arr, si + 1);  // Recursive Function call
        arr[si] -= 2;  // Backtracking Call
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Backtrack(arr, 0);
        System.out.println("After BackTracking Array : " + Arrays.toString(arr));
    }
}