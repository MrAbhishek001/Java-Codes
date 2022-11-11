public class Abstract {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Chicken c1 = new Chicken();
        h1.eat();
        h1.walk();
        System.out.println("Color of Horse initially : " + h1.color);
        h1.changeColor();
        System.out.println("Color of Horse after function call : " + h1.color);
        c1.eat();
        c1.walk();
        System.out.println("Color of Chicken initially : " + c1.color);
        c1.changeColor();
        System.out.println("Color of Chicken after function call : " + c1.color);
    }
}

abstract class Animal {
    String color;

    Animal() { // By default ye color sare child classes ko assign ho jayga until u change.
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "Dark Brown";
    }

    void walk() { // This function needs to be there in sub classes of Animal
        System.out.println("Horse walks on 4 legs.");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "Yellow";
    }

    void walk() {
        System.out.println("Walks on 2 legs.");
    }
}