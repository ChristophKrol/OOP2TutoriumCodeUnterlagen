public class Notarzt extends Arzt{

    public String wagennummer;

    public Notarzt(){}

    public Notarzt(String wagennummer){
        this.wagennummer = wagennummer;
    }

    public Notarzt(String wagennummer, int alter, String studienOrt, String name){
        super(alter, studienOrt, name);         // super() immer als erste Anweisung
        this.wagennummer = wagennummer;


    }


    public void ersteHilfeLeisten(){}


}
