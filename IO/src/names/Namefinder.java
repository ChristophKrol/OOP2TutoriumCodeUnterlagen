package names;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Namefinder {


    public static boolean findName( String name ){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/names/names.txt"));
            String txtLine;

            while ((txtLine = reader.readLine()) != null) {
                if (txtLine.equals(name)){
                    return true;
                }

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }



    public static void main(String[] args) {

        boolean found = findName("Michelle");
        System.out.println(found);


    }

}
