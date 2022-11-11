public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 5) {
                continue; // It simply skips the iteration for which condition satisfy.
            }
            System.out.print(i + " ");
        }
    }
}
