public class Arzt {
    public int alter;
    public String hochschule;
    public String name;

    public Arzt(){} //super()

    public Arzt(int alter, String hochschule, String name){
        this.alter = alter;
        this.hochschule = hochschule;
        this.name = name;
    }



    public void patientEmpfangen(){}

    @Override
    public String toString() {
        return "Arzt: " + this.name + " Studienort: " + this.hochschule + " Alter: " + this.alter;
    }
}
