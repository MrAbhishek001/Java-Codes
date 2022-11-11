public class PairsInArray {

    public static void Pairs(int[] arr) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + ", " + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs are : " + tp);
        //Total Pairs = (n * (n - 1))/2;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 9, 15, 16 };
        Pairs(nums);
    }
}
