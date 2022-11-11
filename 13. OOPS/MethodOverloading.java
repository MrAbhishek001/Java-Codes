public class MethodOverloading {
    public static void main(String[] args) {
        Calculator sum = new Calculator();
        System.out.println(sum.sum(3, 5)); // int sum is used
        System.out.println(sum.sum(1.5f, 1.3f));// float sum is used
        System.out.println(sum.sum(3, 5, 98)); // int sum is used
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}