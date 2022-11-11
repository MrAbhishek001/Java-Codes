import java.util.Arrays;

public class Transpose {

    public static void Transpose(int[][] arr) {
        int row = 2, col = 3;
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        // print matrix
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        Transpose(matrix);
    }
}
