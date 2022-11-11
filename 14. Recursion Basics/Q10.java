import java.util.Scanner;

//Q.1: For a given integer array of size N. You have to find all the occurrences(indices)
// of a given element(Key) and print them. Use a recursive function to solve this problem.

public class Q10 {

    public static void Occurence(int[] arr, int target, int si) {
        if(si == arr.length) {
            return;
        }
        if(arr[si] == target) {
            System.out.print(si + " ");
        }
        Occurence(arr, target, si + 1);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 8, 5, 9, 3, 5, 9, 7, 5, 10 };
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Occurence(arr, n, 0);
    }
}
