package bank.management.system;

import javax.swing.JFrame;

public class Deposite extends JFrame{

    String pin;
    Deposite(String pin){
        this.pin = pin;
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Deposite("");
    }
}
