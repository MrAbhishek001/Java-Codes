public class SpiralMatrix {

    public static void Print_Spiral(int[][] arr) {
        int SRow = 0, ERow = arr.length - 1;
        int SCol = 0, ECol = arr[0].length - 1;
        while (SRow <= ERow && SCol <= ECol) {
            // Top Row
            for (int j = SCol; j <= ECol; j++) {
                System.out.print(arr[SRow][j] + " ");
            }
            // Right Col
            for (int i = SRow + 1; i <= ERow; i++) {
                System.out.print(arr[i][ECol] + " ");
            }
            // End Row
            for (int j = ECol - 1; j >= SCol; j--) {
                if (SRow == ERow) {
                    break;
                }
                System.out.print(arr[ERow][j] + " ");
            }
            // Start Col
            for (int i = ERow - 1; i > SRow; i--) {
                if (SCol == ECol) {
                    break;
                }
                System.out.print(arr[i][SCol] + " ");
            }
            SRow++;
            SCol++;
            ERow--;
            ECol--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 8 },
                { 4, 5, 6, 7, 9 },
                { 8, 9, 10, 11, 15 },
                { 12, 13, 14, 15, 12 },
                { 5, 7, 1, 0, 15 } };
        Print_Spiral(matrix);
    }
}
