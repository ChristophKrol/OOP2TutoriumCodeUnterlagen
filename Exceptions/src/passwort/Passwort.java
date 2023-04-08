package passwort;

import java.util.Objects;
import java.util.Scanner;

class Passwort {

    static final String PASSWORD = "OOP2-Tutorium";
    static int counter= 0;

    public static void main(String[] args) throws PasswordException { //throws wichtig sonst Fehler

        typePassword();


    }

     static void typePassword() throws PasswordException{
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type in your password: ");
            String password = scanner.nextLine();
            if (Objects.equals(password, PASSWORD)){    // Wenn Passwort richtig eingetippt
                System.out.println("Password typed correctly.");
            }
            else {
                throw new PasswordException("Wrong Password");
            }

        }
        catch (PasswordException pe){
            System.err.println("Wrong password!");
            counter ++;
            if (counter < 3){
                typePassword();
            }
            else {
                throw pe;
            }

        }
    }


}
