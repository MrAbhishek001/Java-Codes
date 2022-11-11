public class UnaryOperators {
    public static void main(String[] args) {
        // Increment Operators
        int a = 5;
        int b = ++a; // ++a is Pre Increment Unary Operator. (First Increases then Assigns)
        int c = b++; // b++ is Post Increment Unary Operator. (First Assigns then Increases)
        System.out.println(a + " " + b + " " + c);
        // Output is a = 6, b = 7, c = 6
        // first b = 6 then b++ makes it 7
        // firstly a = 5 then ++a makes it 6
        // c = 6 as b = 6 and b++ will first store its value in c
        // then increase its value by 1

        // Decrement operators
        int A = 7;
        int B = A--; // A-- is Post Decrement Unary Operator. (First Assigns then Decreases)
        int C = --B; // --B is Pre Decrement Unary Operator. (First Decreases then Assigns)
        System.out.println(A + " " + B + " " + C);
        // Output is A = 6, B = 6 and C = 6
    }
}