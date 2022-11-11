public class an {
    public static void main(String[] args) {
        String s = "abhishek";
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(s);
        System.out.println(s.length());
        s = s.substring(s.length() - 3);
        System.out.println(s);
    }
}
