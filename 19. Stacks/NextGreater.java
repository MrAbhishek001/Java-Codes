import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

    // Brute Force Approach
    /*
     * public static void Next_Great(int[] arr, int[] nextGreat) {
     * for (int i = 0; i < arr.length; i++) {
     * int Curr = arr[i];
     * for (int j = i + 1; j < arr.length; j++) {
     * if (arr[j] > Curr) {
     * nextGreat[i] = arr[j];
     * break;
     * } else {
     * nextGreat[i] = -1;
     * }
     * }
     * }
     * nextGreat[arr.length - 1] = -1;
     * }
     */

    public static void Next_Great(int[] arr, int[] nextGreat) {  // TC = O(n)
        Stack<Integer> s = new Stack<>();
        int i = arr.length - 1;
        while (i >= 0) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreat[i] = -1;
            } else {
                nextGreat[i] = arr[s.peek()];
            }
            s.push(i);
            i--;
        }
        System.out.println(s);
        // Next Greater Right
        // Next Greater Left
        // Next Smallest Right
        // next Smallest Left
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] nextGreat = new int[arr.length];
        Next_Great(arr, nextGreat);
        System.out.println(Arrays.toString(nextGreat));
    }
}
