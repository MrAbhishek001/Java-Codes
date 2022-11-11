import java.util.Arrays;
import java.util.Scanner;

public class Search {

    public static int[] Search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();
        System.out.println("The target element is found at index : " + Arrays.toString(Search(matrix, target)));
    }
}
