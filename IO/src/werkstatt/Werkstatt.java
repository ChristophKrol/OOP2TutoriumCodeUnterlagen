package werkstatt;

import auto.Auto;

import java.io.*;

public class Werkstatt implements Serializable {

    public static final long serialVersionUID = 10L;


    public void inspektion(Auto auto){
        if (! auto.hatTUEV()){
            auto.setHatTUEV(true);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Werkstatt werkstatt = new Werkstatt();
        Auto auto;
        FileInputStream fileInputStream = new FileInputStream("src/auto/auto.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        auto = (Auto) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        werkstatt.inspektion(auto);
        System.out.println(auto.toString());
    }
}
