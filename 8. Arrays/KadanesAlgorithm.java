public class KadanesAlgorithm {

    public static void Max_Subarray_Sum(int[] arr) {
        int CurSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            CurSum += arr[i];
            if (CurSum < 0) {
                CurSum = 0;
            }
            MaxSum = Math.max(CurSum, MaxSum);
        }
        if (MaxSum == 0) {  //If all the Elements in Array are Negative
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
        System.out.println("Maximum Subarray Sum is : " + MaxSum);
    }

    public static void main(String[] args) {
        int[] nums = { 12, 34, 2, 45, 5 };
        Max_Subarray_Sum(nums);
    }
}
