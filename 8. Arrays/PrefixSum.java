//Prefix = prefix[i-1] + arr[i]

public class PrefixSum {

    public static void Prefix_Sum(int[] arr) {
        int CurSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int[] Prefix = new int[arr.length];
        Prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            Prefix[i] = Prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                CurSum = (i == 0) ? Prefix[0] : Prefix[j] - Prefix[i - 1];
            }
            if (CurSum > MaxSum) {
                MaxSum = CurSum;
            }
            System.out.println(CurSum);
        }
        System.out.println("Maximum SubArray Sum is : " + MaxSum);
    }

    public static void main(String[] args) {
        int[] nums = { 1, -2, 6, -1, 3 };
        Prefix_Sum(nums);
    }
}
