public class GridWaysTrick {

    public static int Gridways(int row, int col, int m, int n) {
        return fact(n + m - 2) / ((fact(n - 1)) * fact(m - 1));
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int m = 4, n = 3;
        int ways = Gridways(0, 0, m, n);
        System.out.println("Total ways = " + ways);
    }
}
