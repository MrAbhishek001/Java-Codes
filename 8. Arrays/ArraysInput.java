import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[100];
        marks[0] = sc.nextInt(); // maths
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // Phy
        System.out.println("Maths : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Physics : " + marks[2]);
        marks[2] += 2;
        System.out.println("Updated Physics : " + marks[2]);
        System.out.println("Percentage of marks is : " + (float)(marks[0] + marks[1] + marks[2]) / 3);
        System.out.println("Length of Array is : " + marks.length);
    }
}
