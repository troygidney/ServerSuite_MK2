package me.pokerman99.ServerSuiteMK2.forms;

import me.pokerman99.ServerSuiteMK2.Encrypt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm {
    private JTextField userNameField1;
    private JButton loginButton;
    private JPasswordField passwordField1;
    public JPanel jFrame;

    public loginForm() {
        userNameField1.addActionListener(e -> {

        });


        loginButton.addActionListener(e -> login(e));
        passwordField1.addActionListener(e -> {

        });
    }

    public boolean login(ActionEvent event) {
        String user = userNameField1.getText();
        String encryptUser = Encrypt.encrypt(userNameField1.getText());
        String encryptPassword = Encrypt.encrypt(passwordField1.getPassword().toString());


        return false;
    }
}
