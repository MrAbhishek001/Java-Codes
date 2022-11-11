import java.util.Scanner;

public class NQueens {  //Time Complexity : O(n!)

    public static boolean isSafe(char[][] Board, int row, int col) {
        //Vertically Up
        for(int i = row - 1; i >= 0; i--) {
            if(Board[i][col] == 'Q') {
                return false;
            }
        }
        //Left Diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(Board[i][j] == 'Q') {
                return false;
            }
        }
        //Right Diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < Board.length; i--, j++) {
            if(Board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void QueensInRows(char[][] Board, int row) {
        if (row == Board.length) {
            printBoard(Board);
            Count++;
            return;
        }
        for (int i = 0; i < Board.length; i++) {
            if(isSafe(Board, row, i)) {
            Board[row][i] = 'Q';
            QueensInRows(Board, row + 1);
            Board[row][i] = 'X';
            }
        }
    }

    public static void printBoard(char[][] Board) {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------ChessBoard-------");
    }

    static int Count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] Board = new char[n][n];
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board.length; j++) {
                Board[i][j] = 'X';
            }
        }
        QueensInRows(Board, 0);
        System.out.println("Total Ways = " + Count);
    }
}
