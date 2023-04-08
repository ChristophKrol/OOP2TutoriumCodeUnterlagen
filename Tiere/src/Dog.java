public class Dog extends Pet{



    private void walk(){}

    @Override
    public void move() {
        this.walk();

    }

    @Override
    public void sound() {
        System.out.println("Wuff!");
    }
}
