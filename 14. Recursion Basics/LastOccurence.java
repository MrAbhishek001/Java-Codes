import java.util.Scanner;

public class LastOccurence {

    // One Approach
    public static int Last_Occ(int[] arr, int target, int ei) {
        if (ei == 0) {
            if (arr[ei] != target) {
                return -1;
            } else {
                return ei;
            }
        }
        if (arr[ei] == target) {
            return ei;
        }
        return Last_Occ(arr, target, ei - 1);
    }

    // AnotherApproch
    public static int last_Occ(int[] arr, int target, int si) {
        if (si == arr.length) {
            return -1;
        }
        int isFound = last_Occ(arr, target, si + 1);
        if (isFound == -1 && arr[si] == target) {
            return si;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 5, 6, 9, 24, 15, 24, 8, 6, 1, 84, 67 };
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("Last Occurence of " + n + " is at index : " + Last_Occ(arr, n, arr.length - 1));
            System.out.println("Last Occurence of " + n + " is at index : " + last_Occ(arr, n, 0));
        }
    }
}
