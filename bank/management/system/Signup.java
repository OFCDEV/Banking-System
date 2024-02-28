package bank.management.system;

import java.awt.Color;

import javax.swing.*;

public class Signup extends JFrame {

    Signup(){
        getContentPane().setBackground(new Color(222,255,228)); //Color Selection in RGB form
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
