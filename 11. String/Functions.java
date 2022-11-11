public class Functions {

    public static void PrintChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        // length function
        String name = "Screw it, Let's do it";
        System.out.println("String length : " + name.length());

        // String concatenation
        String firstName = "Harry";
        String lastName = "Potter";
        String FullName = firstName + " " + lastName; // Concatenation
        System.out.println(FullName);

        // charAt function (Gives Position of charracter in String)
        System.out.println(FullName.charAt(4));

        PrintChar(FullName);
    }
}
