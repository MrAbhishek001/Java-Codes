import java.util.Arrays;
import java.util.Scanner;

public class SearchInSortedArray {

    // //Taking Right Top Most element as Reference
    // public static int[] Search(int[][] arr, int target) {
    //     int row = 0, col = arr.length - 1;
    //     while (row < arr.length && col >= 0) {
    //         if (arr[row][col] == target) {
    //             return new int[] { row, col };
    //         } else if (arr[row][col] > target) {
    //             col--;
    //         } else {
    //             row++;
    //         }
    //     }
    //     return new int[] { -1, -1 };
    // }

    //Taking Left lower Most element as Reference
    public static int[] Search(int[][] arr, int target) {
        int row = arr.length-1, col = 0;
        while (col < arr.length && row >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            } else if (arr[row][col] > target) {
                row--;
            } else {
                col++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int target = sc.nextInt();
        System.out.println("Target element is at index : " + Arrays.toString(Search(matrix, target)));
    }
}
