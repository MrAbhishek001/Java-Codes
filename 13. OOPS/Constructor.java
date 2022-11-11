public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Abhishek Kushwaha");
        s1 = new Student(10);
        s1.setName("Abhi");
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 90;
        System.out.println("name : " + s2.name);
        Student s3 = new Student(s1);
        System.out.println(s3.name + " " + s3.roll_no);
        s1.marks[2] = 98; // It will also change marks of s3 as reference is passed( in Shallow)
        for (int i = 0; i < 3; i++) {
            System.out.println(s3.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll_no;
    int[] marks = new int[3];

    void setName(String name) {
        this.name = name;
    }

    // Non Parameterized Constructor
    Student() { // It is default constructor which is automatically called without defining
        System.out.println("Constructor is called....");
    }

    // Parameterized Constructor
    Student(String name) { // To Put some input we need to define the constructor
        this.name = name;
    }

    Student(int roll_no) { // To Put some input we need to define the constructor
        this.roll_no = roll_no;
    }

    // Shallow Copy Constructor
    // Student(Student s1) {
    // this.name = s1.name;
    // this.roll_no = s1.roll_no;
    // this.marks = s1.marks;
    // }

    // Deep Copy Constructor : By using it the changes in s1 won't reflect in s3
    Student(Student s1) {
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}