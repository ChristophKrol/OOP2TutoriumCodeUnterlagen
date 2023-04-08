public class MainClass {

    public static void main(String[] args) {


        //Arzt fa1 = new Frauenarzt();        //Oberklasse-Objekt kann mit UK-Konstruktor initialisiert werden
        //fa1.name = "Katharina";
        Frauenarzt fa2 = new Frauenarzt();
        fa2.name = "Georg";
        //Frauenarzt fa3 = new Arzt();        //Unterklasse-Objekt kann nicht mit OK-Konstruktor initialisiert werden
        Chirurg c1 = new Chirurg();
        c1.name = "Peter";
        //Arzt c2 = new Chirurg();
        //c2.name = "Andreas";
        Notarzt na1 = new Notarzt();
        na1.name = "Andrea";
        Krankenhaus kh1 = new Krankenhaus(fa2, c1, na1);            // In dieses Array werden Frauenärzte, Chirurgen und Notärzte hinzugefügt
        System.out.println(kh1.toString());                        // -> D.h. alle Subklassen von Klasse "Arzt" sind auch gleichzeitig vom Typ Arzt
                                                                  //  -> Das aerzte Array kann also also alle Spezialisierungen vom Typ Arzt aufnehmen



        Chirurg chirurg = new Chirurg(35, "RWTH", "Giuseppe");  // super(int alter, String hochschule, String name)
        System.out.println(chirurg.toString());
        Frauenarzt aerztin = new Frauenarzt("Anna", new String[]{"Claudia", "Melina", "Mary"});
        System.out.println(aerztin.toString());


    }

}
