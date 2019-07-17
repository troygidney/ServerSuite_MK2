package me.pokerman99.ServerSuiteMK2.forms;

import me.pokerman99.ServerSuiteMK2.Encrypt;

import javax.swing.*;

public class loginForm {
    private JTextField userNameField1;
    private JButton loginButton;
    private JPasswordField passwordField1;
    public JPanel jFrame;

    public loginForm() {
        userNameField1.addActionListener(e -> {

        });


        loginButton.addActionListener(e -> {
            String user = userNameField1.getText();
            String encrypted = Encrypt.encrypt(user);
            String decrypted = Encrypt.decrypt(encrypted);

            System.out.print("OG:\t"+ user);
            System.out.print("\nEncrypted:\t"+ encrypted);
            System.out.print("\nDecrypted:\t"+ decrypted);

        });
    }
}
