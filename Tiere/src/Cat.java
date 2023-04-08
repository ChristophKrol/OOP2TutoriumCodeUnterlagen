public class Cat extends Pet{



    private void sneak(){}
    @Override
    public void move() {
        this.sneak();
    }

    @Override
    public void sound() {
        System.out.println("Miau!");
    }
}
