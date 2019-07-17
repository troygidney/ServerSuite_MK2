package me.pokerman99.ServerSuiteMK2;

import me.pokerman99.ServerSuiteMK2.forms.loginForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        frame.setContentPane(new loginForm().jFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
