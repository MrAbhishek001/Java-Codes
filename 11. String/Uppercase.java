import java.util.Arrays;

public class Uppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0))); // First letter to uppercase
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) { // check for empty space
                sb.append(str.charAt(i)); // Add empty space to StringBuilder
                i++; // Increase iterator by 1
                sb.append(Character.toUpperCase(str.charAt(i)));
                // Above Command change letter after void space to uppercase
            } else {
                sb.append(str.charAt(i)); // add cahraacter to sb
            }
        }
        return sb.toString();
    }

ṇ    public static void main(String[] args) {
        String str = "hi, this Iṇns abhishek kushwaha.";
        System.out.println(toUpperCase(str));
    }ṇ
}
