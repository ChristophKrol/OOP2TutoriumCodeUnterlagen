public class Stringbuilders {

    public static void main(String[] args) {

        StringBuilder strb = new StringBuilder("Hello World !");

        strb.delete(6, 14); //Man kann auch über indexe hinaus gehen
        System.out.println(strb.toString());

        strb.replace(0, 5, "Hallo");
        System.out.println(strb.toString());

        strb.append(" Welt!");
        System.out.println(strb.toString()); // So wie +



    }




}
