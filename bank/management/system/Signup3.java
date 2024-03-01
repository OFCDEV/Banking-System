package bank.management.system;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Signup3 extends JFrame{
    Signup3(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        getContentPane().setBackground(new Color(215,152,152));
        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Signup3();
    }
}
