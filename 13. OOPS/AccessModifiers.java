public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        Pen p2 = new Pen();
        p2.setColor("Purple");
        myAcc.username = "Abhishek";
        // myAcc.password = "12345"; // Accessing password is denied as it is private
        myAcc.setPassword("12344"); // It will modify the password
        System.out.println(myAcc.username);
        // System.out.println(myAcc.password); // You can't access password but can
        // modify it
        // System.out.println("Color : " + p2.color);
    }
}

class BankAccount {
    public String username; // public is visible to all
    private String password; // private is only visible within class and not anywhere else

    void setPassword(String newPassword) {
        password = newPassword;
    }

}
