package aufgabe2;

public class Elektrogeraet {


    private int watt;

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        if (this.watt <= 0){
            throw new IllegalWattException("Wattanzahl zu gering!");
        }
        else{
            this.watt = watt;
        }
    }




}
