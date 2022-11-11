public class Duplicatelement {

    public static int Duplicate(int[] arr) {
        int i = 0;
        int Cur = arr[i];
        while (i != arr.length) {
            if (arr[i] != (i + 1)) {
                swap(arr, i, arr[i] - 1);
            }
            i++;
        }
        return arr[i - 1];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 4, 1 };
        System.out.println("Duplicate Element : " + Duplicate(arr));
        ;
    }
}
