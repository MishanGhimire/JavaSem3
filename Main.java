class Animal {
    String species;
    String habitat;

    Animal(String s, String h) {
        species = s;
        habitat = h;
    }

    void display() {
        System.out.println("Species: " + species + ", Habitat: " + habitat);
    }
}

class Mammal extends Animal {
    int numberOfLegs;
    String sound;

    Mammal(String species, String habitat, int legs, String sound) {
        super(species, habitat);
        numberOfLegs = legs;
        this.sound = sound;
    }

    void display() {
        super.display();
        System.out.println("Number of Legs: " + numberOfLegs + ", Sound: " + sound);
    }
}

class NonMammal extends Animal {
    boolean canFly;
    String color;

    NonMammal(String species, String habitat, boolean fly, String color) {
        super(species, habitat);
        canFly = fly;
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Can Fly: " + canFly + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog", "Domestic", 4, "Bark");
        NonMammal snake = new NonMammal("Snake", "Trees", false, "Brown");

        System.out.println("Mammal Details:");
        dog.display();

        System.out.println("\nNon-Mammal Details:");
        snake.display();
    }
}
