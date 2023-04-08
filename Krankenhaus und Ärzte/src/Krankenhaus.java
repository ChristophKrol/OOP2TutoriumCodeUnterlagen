import java.util.Arrays;

public class Krankenhaus {
    Arzt [] aerzte;             // Das Arzt Array nimmt alle Arzt Objekte auf
                                // Siehe weiter bei MainClass

    public Krankenhaus(Arzt ... aerzte) {
        this.aerzte = aerzte;
    }

    @Override
    public String toString() {
        return "Krankenhaus-Ärzte: " + Arrays.toString(aerzte);
    }
}
