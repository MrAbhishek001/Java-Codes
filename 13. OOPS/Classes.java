public class Classes {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a Pen object called p1
        p1.setColor("Red");  
        p1.setTip(5);
        System.out.println("Color : " + p1.color + " and Size Of Tip : " + p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}