public class LargestInArray {

    public static int Largest(int[] arr) {
        int max = Integer.MIN_VALUE; // -infinity
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value in Array is = " + min);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 6, 30, 5 };
        System.out.println("Largest element in Array is = " + Largest(nums));
    }
}
