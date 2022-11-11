public class DiagonalSum {

    public static int Sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Pricipal Diagonal
            sum += arr[i][i];
            // Off Diagonal Except Overlapping Element
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 8 },
                { 4, 5, 6, 7, 9 },
                { 8, 9, 10, 11, 15 },
                { 12, 13, 14, 15, 12 },
                { 15, 7, 1, 0, 15 } };
        System.out.println("The Diagonal Sum of Matrix is : " + Sum(matrix));
        // Diagonal Sum = Principal Diagonal + Off Diagonal - Overlapped Element
    }
}
