public class Inheritance {
    public static void main(String[] args) {
        Fish Tuna = new Fish();
        Tuna.eat();
        Tuna.setfins(5); // It wil store values of fins in fins
        System.out.println("Fins : " + Tuna.fins);
        Dog Dobby = new Dog();
        Dobby.breed = "Rottweiler";
        System.out.println("Breed = " + Dobby.breed);
        Dobby.legs = 4;
        System.out.println("Legs = " + Dobby.legs);
        Dobby.eat();
    }
}

class Animal {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Single Level Inheritance
class Fish extends Animal {
    int fins;

    void setfins(int fins) {
        this.fins = fins;
    }

    void swim() {
        System.out.println("swims");
    }
}

// Single Level Inheritance
class Mammal extends Animal {
    int legs;
}

// Multi Level Inheritance
class Dog extends Mammal {
    String breed;
}