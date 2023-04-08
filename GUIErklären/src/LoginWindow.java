import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class LoginWindow extends JFrame {

    public static String username = "OOP2Tutor";
    public static char[] password = {'1', '2', '3'};

    public LoginWindow(){
        JPanel panel = new JPanel();
        this.setTitle("Login Window");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Wichtig
        this.add(panel);

        JLabel usernameLabel = new JLabel("Username"); // Erstmal aufbauen
        panel.add(usernameLabel);   // dann hinzufügen

        JTextField usernameField = new JTextField(20); // Größe bestimmen im Konstruktor
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        panel.add(passwordField);

        JLabel successLabel = new JLabel("");
        panel.add(successLabel);

        JButton loginButton = new JButton("Login");
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {    //addActionListener()

            @Override
            public void actionPerformed(ActionEvent e) {    // WAs passiert, wenn Button gedrückt wurde
                String typedUsername = usernameField.getText();
                char[] typedPassword = passwordField.getPassword();
                if ( typedUsername.equals(username) && Arrays.equals(typedPassword, password) ){
                    successLabel.setText("Login successful");

                }
                else {
                    successLabel.setText("Wrong Username/Password combination");
                }

            }
        });


        this.setVisible(true); // Man sieht alles


    }

    public static void main(String[] args) {
        new LoginWindow();

    }



}
