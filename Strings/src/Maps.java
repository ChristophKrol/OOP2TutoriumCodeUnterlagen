import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, String > empIDs = new HashMap<Integer, String>(); //<Key, Value>

        empIDs.put(1000, "Carl Johnson");   // put() fügt neue Einträge hinzu put(Key, Value)
        empIDs.put(2204, "Pamela Milton");
        empIDs.put(1102, "Greg Heffley");   // Map-Einträge haben keine definierte Reihenfolge



        System.out.println(empIDs);

        System.out.println(empIDs.get(1000));
        System.out.println(empIDs.containsKey(2201));
        System.out.println(empIDs.containsValue("Greg Heffley"));

        empIDs.put(2204, "Sebastian Milton");   // replace in dem Falle
        System.out.println(empIDs);

        empIDs.replace(1000, "Trevor Phillips");
        System.out.println(empIDs);
        empIDs.replace(1001, "Franklin Clinton"); // Es gibt diesen Eintrag nicht, also kein Replace
        System.out.println(empIDs);
        empIDs.remove(1102, "Greg Heffley");
        System.out.println(empIDs);



    }
}
