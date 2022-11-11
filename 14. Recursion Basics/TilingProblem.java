import java.util.Scanner;

public class TilingProblem {

    public static int Tiling_Ways(int length) {
        if (length == 0 || length == 1) {
            return 1;
        }
        // Horizontal(initial placing) ways
        int w1 = Tiling_Ways(length - 1);
        // Vertical(initial Placing) ways
        int w2 = Tiling_Ways(length - 2);

        return w1 + w2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Ways to Arrange Tiles are : " + Tiling_Ways(length));
    }
}
