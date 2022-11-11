public class Q1 {
    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        int NoOf7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    NoOf7++;
                }
            }
        }
        System.out.println("Number of 7 is : " + NoOf7);
    }
}
