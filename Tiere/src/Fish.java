public class Fish extends Animal{

    public boolean isSweetWaterFish;



    private void swim(){}

    @Override               // Methoden von Klasse Animal wird hier redefiniert
    public void move() {
        this.swim();
    }

    @Override
    public void sound() {
        System.out.println("Blub!");
    }
}
