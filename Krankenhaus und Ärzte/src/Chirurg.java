public class Chirurg extends Arzt{
    public int anzahlOps = 0;
    public void opDurchfuehren(){
        anzahlOps++;
    }

    public Chirurg (){
        //super();  //Arzt()
    }

    public Chirurg(int alter, String studienort, String name){
        super(alter, studienort, name);        // Arzt(alter, hochschule, name)
    }
}
