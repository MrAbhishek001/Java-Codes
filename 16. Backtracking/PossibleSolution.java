import java.util.Scanner;

public class PossibleSolution {

    public static boolean isSafe(char[][] Board, int row, int col) {
        // For Vertical col
        for (int i = row - 1; i >= 0; i--) {
            if (Board[i][col] == 'Q') {
                return false;
            }
        }
        // For Left Diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (Board[i][j] == 'Q') {
                return false;
            }
        }
        // For Right Diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < Board.length; i--, j++) {
            if (Board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean NQueens(char[][] Board, int row) {
        if (row == Board.length) {
            return true;
        }
        for (int col = 0; col < Board.length; col++) {
            if (isSafe(Board, row, col)) {
                Board[row][col] = 'Q';
                if (NQueens(Board, row + 1)) {
                    return true;
                }
                Board[row][col] = 'X';
            }
        }
        return false;
    }

    public static void printBoard(char[][] Board) {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] Board = new char[n][n];
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                Board[i][j] = 'X';
            }
        }
        if (NQueens(Board, 0)) {
            System.out.println("Solution is Possible.");
            printBoard(Board);
        } else {
            System.out.println("No Solutions");
        }
    }
}
