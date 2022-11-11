public class Operators {
    public static void main(String[] args) {
        // Bitwise AND ( & )
        System.out.println(5 & 6);
        // Bitwise OR ( | )
        System.out.println(5 | 6);
        // Bitwise NOT ( ~ )
        System.out.println(~5); // Firstly 2's complement then 1's complement then add 1
        // Bitwise LeftShift operator ( << )
        System.out.println(5 << 2); // ( a << b ; Answer = a * pow(2, b);
        // Bitwise RightShift operator ( >> )
        System.out.println(6 >> 1); // ( a >> b ; Answer = a / pow(2, b);
    }
}