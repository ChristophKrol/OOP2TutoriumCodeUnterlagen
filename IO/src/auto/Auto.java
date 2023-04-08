package auto;

import java.io.*;

/**
 * Entnommen aus OOP1-Praktikum
 */
public class Auto implements Serializable {

// --- Attribute --- //

    String hersteller;
    int tank;
    int leistung;
    boolean hatTUEV;
    int kilometerStand;
    public static final long serialVersionUID = 10L;    // eigene ID

//  --- --- --- ---  //

// --- Konstruktoren --- //

    public Auto(){}      // parameterloser Standardkonstruktor

    public Auto(String hersteller){
       this.hersteller = hersteller;
    }

    public Auto(String hersteller,int tank,int leistung){
       this.hersteller = hersteller;
       this.tank = tank;
       this.leistung = leistung;
    }

// --- --- --- --- //

// --- Getter/Setter --- //


    public String getHersteller() {
        return this.hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getTank() {
        return this.tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getLeistung() {
        return this.leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public boolean hatTUEV() {
        return this.hatTUEV;
    }

    public void setHatTUEV(boolean tuev) {
        this.hatTUEV = tuev;
    }

    public int getKilometerStand() {
        return this.kilometerStand;
    }

    public void setKilometerStand(int kilometerStand) {
        this.kilometerStand = kilometerStand;
    }

// --- --- --- --- --- //

// --- Methoden --- //

    public void fahren(){
        this.kilometerStand ++;
    }
    public void hupen(){
        System.out.println("Beep Beep");
    }
    public void tanken(int liter){
        this.tank = liter;
    }

    @Override
    public String toString() {
        return
                "Hersteller: " + this.hersteller + '\n' +
                "Aktueller Fuellstand: " + this.tank + '\n' +
                "Leistung in PS: " + this.leistung + '\n' +
                "Inspektion: " + this.hatTUEV + '\n' +
                "Kilometerstand: " + this.kilometerStand;
    }


    // --- --- --- --- //

    public static void main(String[] args) throws IOException {

        Auto auto = new Auto("Audi", 30, 200);
        System.out.println(auto.toString());


        FileOutputStream fileOutputStream = new FileOutputStream("src/auto/auto.ser");      // 1. FileOutputStream aufbauen
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOutputStream);                 // 2. ObjectOutputStream aufbauen
        objectOut.writeObject(auto);                                                             // 3. Objekt schreiben mit ObjectOutputStream
        objectOut.close();                                                                       // 4. Beide Streams schließen
        fileOutputStream.close();
    }



}
