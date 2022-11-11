public class AbstractHeirarchy {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal Constructor called!!");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor called!!");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called!!");
    }
}