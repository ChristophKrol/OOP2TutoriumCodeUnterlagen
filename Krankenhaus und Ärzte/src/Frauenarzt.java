import java.util.Arrays;

public class Frauenarzt extends Arzt{
    public String [] patientinnen;

    public Frauenarzt(String ... patientinnen){
        this.patientinnen = patientinnen;
    }

    public Frauenarzt(){
        super();
    }

    public Frauenarzt(String name, String ... patientinnen){
        this(patientinnen); // Frauenarzt(String ... patientinnen)
        this.name = name;
    }

    @Override //optional
    public void patientEmpfangen() {    // Spezialisierte Methode für den Frauenarzt
        for (String patientin : patientinnen) {
            super.patientEmpfangen();           //super = Das "this" der Oberklasse
        }
    }


    public String toString() {
        return this.name + ", " + Arrays.toString(this.patientinnen);
    }
}
