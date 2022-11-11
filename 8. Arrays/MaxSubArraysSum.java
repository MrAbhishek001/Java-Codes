public class MaxSubArraysSum {

    public static void MaxSum_SubArray(int[] arr) {
        int CurSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    CurSum += arr[k];
                }
                System.out.println(CurSum);
                if (CurSum > MaxSum) {
                    MaxSum = CurSum;
                }
                CurSum = 0;
            }
        }
        System.out.println("The Maximum sum Of Subarray is : " + MaxSum);
    }

    public static void main(String[] args) {
        int[] nums = { 12, 34, 2, 45, 5 };
        MaxSum_SubArray(nums);
    }
}
