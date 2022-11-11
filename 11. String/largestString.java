public class largestString {
    public static void main(String[] args) {
        String[] fruits = { "apple", "Banana", "mango", "litchi" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (fruits[i].compareToIgnoreCase(fruits[i - 1]) > 0) {
                largest = fruits[i];
            }
        }
        System.out.println("Largest String is : " + largest);
    }
}
