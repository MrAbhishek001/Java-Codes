public class SubString {

    public static String Substring(String str, int si, int ei) {
        String substring = "";
        for (int i = si; i < ei; i++) {
            substring += str.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args) {
        String str = "Daredevil : Born Again";
        System.out.println("Substring : " + Substring(str, 4, 9));
        System.out.println("Substring : " + str.substring(4, 9)); 
        // str.substring(4, 9); ( Inbuilt Function )
    }
}
