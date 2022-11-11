public class SubArrays {

    public static void SubArray(int[] arr) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Number of SubArrays are : " + ts);
        // Total SubArrays = [n * (n + 1)]/2;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 34, 2, 45, 5 };
        SubArray(nums);
    }
}
