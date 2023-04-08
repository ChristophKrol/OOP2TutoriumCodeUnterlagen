public class Dog extends Animal{

    String owner;

    public Dog(String owner){
        this.owner = owner;
    }
    public Dog(){}

    public void sound(){
        System.out.println("Woof!");
    }

    public void catchBall(){
        System.out.println("Happily brings back the ball...");
    }
}
