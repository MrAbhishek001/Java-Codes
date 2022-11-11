public class Compare {
    public static void main(String[] args) {
        String str1 = "Iman Vellani";
        String str2 = "Iman Vellani";
        String str3 = new String("Iman Vellani");
        // The below case will print String are equal as both str1 and str2 points to
        // same object
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // The below case will print String are not equal as both str1 and str3 points
        // to
        // differnt objects (As str3 is a new String formed)
        if (str1 == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // So, in order to compare Strings we use ( .equals ) method
        if (str1.equals(str3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
