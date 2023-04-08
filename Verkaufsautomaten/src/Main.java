public class Main {
    public static void main(String[] args) {

        Verkaufsautomat vv = new Verkaufsautomat(); //OK
        vv.beleuchtung = true;
        vv.status();

        Getraenkeautomat gg = new Getraenkeautomat();   //UK
        gg.geld = 20; // Vererbung
        gg.beleuchtung = "Rot"; // Ueberdeckung von boolean beleuchtung
        gg.status();    // Override

        Verkaufsautomat vg = gg;    //Typumwandlung     //Verkaufsautomat vg = new Getraenkeautomat();
        vg.beleuchtung = true; // Jetzt sieht man das boolean-Attribut der Oberklasse
        vg.status();    // Methode der UK (Override)
        //vg.kuehlungAn();    //spezielle Methode der UK

        Verkaufsautomat vg2 = new Getraenkeautomat();
        vg2.beleuchtung = true;




    }
}

class Verkaufsautomat{  // Oberklasse
    int geld;
    boolean beleuchtung;

    void status(){
        System.out.println("Beleuchtung an?: " + this.beleuchtung);
    }
}

class Getraenkeautomat extends Verkaufsautomat{ // Unterklasse
    String beleuchtung; // anderer Typ

    //@Override
    void status() {
        System.out.println("Automat leuchtet in Farbe: " + beleuchtung);
    }

    void kuehlungAn(){  // Diese Methode gibt es nur in der UK (speziell)

    }
}
