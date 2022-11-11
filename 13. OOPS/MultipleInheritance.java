public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eats();
    }
}

interface Herbivore {
    void eats();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {  //Call
    public void eats() {
        System.out.println("Eats bots flesh and Green Food");
    }
}