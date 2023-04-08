public class MainClass {
    public static void main(String[] args) {

        Animal cat = new Cat();                 // Spezielle Methoden von Cat werden verdeckt
        //cat.huntMouse();                      // cat kann in dem Falle nicht die huntMouse()-Methode ausführen (Upcasting)
        cat.sound();                            // Hier wird aber trotzdem die sound()-Methode von Cat ausgeführt
        Animal animal = new Animal();           // Hier wird sound()-Methode von Animal ausgeführt
        animal.sound();
        Dog dog = new Dog("Julian");
        dog.sound();
        System.out.println(dog.owner);          // Attribut owner vom dog (String owner überdeckt boolean owner)
        Animal animal2 = dog;                   // Upcasting
        System.out.println(animal2.owner);      // boolean owner ist jetzt sichtbar von Oberklasse

    }
}
