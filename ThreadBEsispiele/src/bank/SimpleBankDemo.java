package bank;

public class SimpleBankDemo {
  public static void main(String[] args) throws InterruptedException {
    Angestellter a1, a2, a3;
    SimpleBank b = new SimpleBank(); // Konten: 100 500 70

    System.out.println("Vorher:");
    b.kontostand();

    a1 = new Angestellter(b, 0, 1, 20);     // 100 gibt 20 an 500 -> 80 520 70
    a2 = new Angestellter(b, 1, 2, 200);    // 520 gibt 200 an 70 -> 80 320 270
    a3 = new Angestellter(b, 2, 0, 20);     // 270 gibt 20 an 80 -> 100 320 250 = 670

    a1.start();
    a2.start();
    a3.start();
    
    a1.join();
    a2.join();
    a3.join();
    
    System.out.println();
    System.out.println("Nachher:");
    b.kontostand();
  }
}