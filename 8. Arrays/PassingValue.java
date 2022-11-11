import java.util.Arrays;
import java.util.Scanner;

public class PassingValue {

    public static void Update(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        int[] marks = { 98, 93, 96 };
        Update(marks);
        System.out.println("Updated marks : " + Arrays.toString(marks));
    }
}
