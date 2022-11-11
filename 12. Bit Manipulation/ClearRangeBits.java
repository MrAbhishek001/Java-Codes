public class ClearRangeBits {

    public static int ClearRange(int n, int startIndex, int endIndex) {
        int a = ((~0) << (endIndex + 1));
        int b = (1 << startIndex) - 1;
        return n & (a | b);
    }

    public static void main(String[] args) {
        System.out.print("Updated Number : " + ClearRange(10, 2, 4));
    }
}