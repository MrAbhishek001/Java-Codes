import java.util.Arrays;

//Q.1 : Apply Merge sort to sort an array of Strings. 
//     (Assume that all the characters in all the Strings are in lowercase). (EASY)
//     Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
//     Sample Output 1: arr = { "earth", "mars", "mercury","sun"}

public class Q1 {

    public static void Mergesort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        Mergesort(arr, si, mid);
        Mergesort(arr, mid + 1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void Merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) { // Function to Conpare Strings : (str1 < str2)
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int l = 0, m = si; l < temp.length; l++, m++) {
            arr[m] = temp[l];
        }
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        Mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
