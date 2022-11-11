import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/*Q.2 : There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at
an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the 
resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],  
nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might   
be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums, or -1  
if it is not in nums.You must write an algorithm with O(log n) runtime complexity.
Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2],
                      target = 0 Output:   4 */

public class Q2 {

    public static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (target < arr[start]) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    start = mid + 1;  //Becoz first element is already greater than target and sorted in Ascending
                } else {
                    end = mid - 1;
                }
            } else {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 1 };
        int target = 0;
        System.out.println(Search(nums, target));
    }
}
