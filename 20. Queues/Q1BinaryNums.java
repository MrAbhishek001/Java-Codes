import java.util.Stack;

public class Q1BinaryNums {

    public static void Binary(int n) {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                s.push(j % 2);
                j /= 2;
            }
            while (!s.isEmpty()) {
                System.out.print(s.pop());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Binary(10);
    }
}
