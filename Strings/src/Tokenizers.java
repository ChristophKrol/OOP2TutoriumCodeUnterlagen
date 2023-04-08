import java.util.StringTokenizer;

public class Tokenizers {



    public static void main(String[] args) {

        String data = "Gerhard.Müller.41199.Mönchengladbach";

        StringTokenizer tokenizer = new StringTokenizer(data, "."); // Leerzeichen " " ist der Separator

        String firstName = tokenizer.nextToken();   // Anfang d. Strings
        String lastName = tokenizer.nextToken();
        String plz = tokenizer.nextToken();
        String city = tokenizer.nextToken();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(plz);
        System.out.println(city);

    }
}
