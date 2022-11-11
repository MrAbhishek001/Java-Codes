public class GettersSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println("Color : " + p1.getColor());
        p1.setTip(9);
        System.out.println("TipSize : " + p1.getTip());
        // System.out.println(p1.tip); // This won't work as tip is Private
    }
}

class Pen {
    private String color;
    private int tip;
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}