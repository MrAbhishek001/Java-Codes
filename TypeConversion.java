/* 
              Type Conversion :
 
   Conversion happens when ;
      * type compatible           
      * destination type > source type

    byte -> short -> int -> float -> long -> double
*/


public class TypeConversion {
    public static void main(String[] args) {
        int a = 54;
        long b = a;    // This Conversion is Possible 
        int c = b;
        System.out.println(b);
        System.out.println(c);
    }
}
