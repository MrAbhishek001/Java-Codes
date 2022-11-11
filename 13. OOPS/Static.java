public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.schoolName = "Divine Mercy School";
        System.out.println(s2.schoolName); // Will display the school name defined for s1
        Student s3 = new Student();
        s3.schoolName = "Allen Career Institute";
        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName); // It will print the changed schoolName
        System.out.println(s1.Percentage(99, 95, 92));
    }
}

class Student {
    String name;
    int roll_no;

    static float Percentage(int maths, int Physics, int CHem) { // Static Function
        return (maths + Physics + CHem) / 3;
    }

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    void setRollno(int roll_no) {
        this.roll_no = roll_no;
    }

    String getName() {
        return name;
    }

    int roll_no() {
        return roll_no;
    }
}