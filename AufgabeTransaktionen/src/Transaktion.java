
public class Transaktion {
    private Betrag x;

    public Transaktion(Betrag x){
        this.x = x;
    }
    public void ueberweise(){
        System.out.println(x + " wurde ueberwiesen.");
    }
}
