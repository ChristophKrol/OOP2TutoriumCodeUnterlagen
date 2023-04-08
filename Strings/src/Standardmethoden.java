public class Standardmethoden {

    public static void main(String[] args) {
        String str1 = "Hallo";
        String str2 = new String(str1);
        String str3 = "Bye Bye";

        // Vergleiche
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str1));

        String abc = "abc";
        String xyz = "xyz";
        String abcd = "abcd";

// Alphabetische Vergleiche
        System.out.println(abc.compareTo("abcd"));  // negativ = abc kommt vor dem String im Parameter
        System.out.println(abc.compareTo("ab"));    // positiv = "ab" im Parameter kommt vor dem abc
        System.out.println(abcd.compareTo(abc));



        String oop2 = "Herzlich Willkommen zum OOP2-Tutorium";

        // Strings haben Eigenschaften von Arrays
        System.out.println(oop2.indexOf("OOP2"));   //OOP2 fängt bei Index 24 an
        System.out.println(oop2.substring(9));  // Gib Inhalt ab Position 9
        System.out.println(oop2.length());
    }
}
