public class LogicalOperators {
    public static void main(String[] args) {
        // Logical AND Operator ( && )
        System.out.println((30 > 5) && (21 > 1)); // Both True will Give Answer as True
        System.out.println((30 > 5) && (21 > 120)); // Only One True will give False
        System.out.println((30 > 50) && (21 > 100)); // Both False will Give Answer as False

        // Logical OR Operator ( || )
        System.out.println((30 > 5) || (21 > 1)); // Both True will Give Answer as True
        System.out.println((30 > 5) || (21 > 120)); // Only One True will give True
        System.out.println((30 > 50) || (21 > 100)); // Both False will Give Answer as False

        // Logical Not ( ! )
        System.out.println(!(12 > 10)); // True will give False
        System.out.println(!(12 < 10)); // False will give True
    }
}
