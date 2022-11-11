//Q.1 : Given an integer array nums, return true if any value appears
// at least twice in the array, and return false if every element is distinct.

public class Q1 {

    public static boolean isTwice(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 21, 21, 4, 11 };
        System.out.println(isTwice(nums));
        ;
    }
}
