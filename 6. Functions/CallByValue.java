/* When the arguments (Actual parameters) are passed from main function then their 
   copies are send to function and not the real values.
   So whatever happens with the copies (formal parameters) it doesn't affect the 
   values of Actual Parameters.
 */

public class CallByValue {

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2; // Here n1 and n2 are Formal Parameters.
        n2 = temp;
        System.out.println("Value of a and b in function after swap are : " + n1 + " and " + n2);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b); // Here a and b are Arguments (Actual Parameters)
        System.out.println("Value of a and b in main after swap are : " + a + " and " + b);
    }
}
