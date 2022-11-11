// Function overloading is basically where a number of functions can be declared 
// with same name and different parameters

public class Overloading {

    // Overloading Using Parameters

    public static int product(int n1, int n2) {
        return n1 * n2;
    }

    public static int product(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    public static float product(int n1, int n2, int n3, int n4) {
        return n1 * n2 * n3 * n4;
    }

    // Overloading Using Datatypes

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int c = 11;
        int d = 10;
        float e = 54.25f;
        System.out.println(product(a, b) + " " + product(a, b, c) + " " + product(a, b, c, d));
        System.out.println(Sum(a, b) + " " + Sum(c, e));
    }
}
