import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class TimeDate {
    public static void main(String[] args) {
        //System.out.println(LocalTime.now());
        Date today = new Date();
        System.out.println(today.toString());
        System.out.println(today.getTime());    // liefert Zeitpunkt als Anzahl der Millisekunden seit dem 1.1.1970 0:00 Uhr

        SimpleDateFormat ddmmyy = new SimpleDateFormat("dd.MM.yy");
        SimpleDateFormat ddmmyyyy_Hmmss = new SimpleDateFormat("dd.MM.yyyy H:mm:ss");
        String now = ddmmyy.format(today);
        System.out.println(now);

        String reallyNow = ddmmyyyy_Hmmss.format(today);
        System.out.println(reallyNow);

        //SimpleDateFormat sdfFormat = new SimpleDateFormat("MMMM d, yyyy");

        //String test = sdfFormat.format(today);
        //System.out.println(test);

    }
}
