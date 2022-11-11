public class ternary {
    public static void main(String[] args) {
        int n = 44;
        int Marks = 34;
        String type = ((n & 1) == 0) ? "Even" : "Odd"; // Prototype ternary operator
        String Status = (Marks >= 3) ? "Pass" : "Fail";
        System.out.println(type + " " + Status);
    }
}
