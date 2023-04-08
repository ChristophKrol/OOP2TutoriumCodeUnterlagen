import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        //Animal animal = new Animal();     // Abstrakte Klassen können nicht als Objekte instanziiert werden
        //Pet pet = new Pet();
        Pet cat = new Cat();
        Cat catty = new Cat();
        Dog doggo = new Dog();
        Animal dog = new Dog();
        Fish fish = new Fish();
        System.out.println(dog instanceof Animal); // instanceof Dog/Pet auch true
        System.out.println(cat instanceof Pet);    // instanceof Cat/Animal auch möglich
        //System.out.println(fish instanceof Pet);

        List<String> list = new ArrayList<String>();
    }
}
