import java.util.Scanner;

public class FirstOccurence {

    public static int First_Occ(int[] arr, int target, int se) {
        if (se == arr.length) {
            return -1;
        }
        if (arr[se] == target) {
            return se;
        }
        return First_Occ(arr, target, se + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 98, 24, 65, 14, 24, 57, 2, 100 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("First occurence of " + n + " is at index : " + First_Occ(arr, n, 0));
    }
}
