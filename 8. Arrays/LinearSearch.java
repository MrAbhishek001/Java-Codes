import java.util.Scanner;

public class LinearSearch {

    public static int Lin_Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int target = sc.nextInt();
        if (Lin_Search(arr, target) == -1) {
            System.out.println("Not Found!!");
        } else {
            System.out.println("The Target element is at index = " + Lin_Search(arr, target));
        }
    }
}
