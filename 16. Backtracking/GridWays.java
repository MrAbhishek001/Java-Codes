public class GridWays {

    public static int Gridways(int row, int col, int TarRow, int TarCol) {
        if (row == TarRow - 1 && col == TarCol - 1) {
            return 1;
        } else if (row == TarRow || col == TarCol) {
            return 0;
        }
        int w1 = Gridways(row + 1, col, TarRow, TarCol);

        int w2 = Gridways(row, col + 1, TarRow, TarCol);

        return w1 + w2;
    }

    public static void main(String[] args) {
        int m = 5, n = 4;
        int ways = Gridways(0, 0, m, n);
        System.out.println(ways);
    }
}
