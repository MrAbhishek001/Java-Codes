import java.util.Arrays;
import java.util.Scanner;

public class Representation {

    public static int[] search(int[][] arr, int target, int rows, int col) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
            System.out.println();
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][4];
        int rows = matrix.length; // Will give number of rows
        int col = matrix[0].length; // will give number of columns
        // Taking input of 2D Array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Printing 2D Array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int target = 15;
        System.out.println("The target element is found at : " + Arrays.toString(search(matrix, target, rows, col)));
    }
}