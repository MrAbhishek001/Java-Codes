/* 
         Type Conversion

   * Java automatically promotes each byte, short or char operand to int
     when evaluating an expression.
   * If one operand is long, float or double the whole expression is 
     converted to long, float or double respectively.

 */

public class TypePromotion {
    public static void main(String[] args) {
        short a = 54;
        byte b = 21;
        char c = 'f';
        byte d = (byte) (a * b + c);
        /*
         * byte d = a * b + c; error: incompatible types: possible lossy conversion
         * from int to byte
         * System.out.println(d);
         */
        System.out.println(d);
    }
}
