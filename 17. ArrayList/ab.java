import java.util.Arrays;

public class ab {

    // public static void sort(int[] arr) {
    // int count0 = 0;
    // int count1 = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == 0) {
    // count0++;
    // } else {
    // count1++;
    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // if (i < count0) {
    // arr[i] = 0;
    // } else {
    // arr[i] = 1;
    // }
    // }
    // System.out.println(count0 + " " + count1);
    // }

    public static String twoPointer(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp[si] = arr[i];
                si++;
            } else {
                temp[ei] = arr[i];
                ei--;
            }
        }
        return Arrays.toString(temp);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0 };

        System.out.println(twoPointer(arr));
    }
}
