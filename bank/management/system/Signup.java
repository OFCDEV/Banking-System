package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,m1,m2;
    JTextField textName,textFname,textEmail,textMarried,textAdd,textcity,textState,textPin;
    JDateChooser dateChooser;

    JButton next;
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;

    String first = " "+Math.abs(first4);
    Signup(){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont (new Font("Rsleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);
        
        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        //Small calender library for easily choosing date
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        //Adding selecting options for labelG
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(430,290,90,30);
        add(r2);

        r3 = new JRadioButton("Others");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(580,290,90,30);
        add(r3);

        //Grouping them so that user can select only one
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        //Email address
        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);
        
        //Marital Status
        JLabel labelMarried = new JLabel("Marital Status:");
        labelMarried.setFont(new Font("Raleway",Font.BOLD,20));
        labelMarried.setBounds(100,440,200,30);
        add(labelMarried);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,90,30);
        add(m1);

        m2 = new JRadioButton("Single");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(430,440,90,30);
        add(m2);

        ButtonGroup buttonM = new ButtonGroup();
        buttonM.add(m1);
        buttonM.add(m2);

        //Address
        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        //City
        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD, 14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        //Pincode
        JLabel labelPin = new JLabel("PinCode:");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD, 14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        //State
        JLabel labelState = new JLabel("PinCode:");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,590,200,30);
        add(labelState);

        textState= new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 14));
        textState.setBounds(300,590,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228)); //Color Selection in RGB form
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        //Converting lables to string and stored them to the database;
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        //If-else for the radio button selection
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()) {
            gender = "Female";
        }
        else if (r3.isSelected()){
            gender = "Others";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Single";
        }
        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"FIll all the fields");
            }else{
                connect connect1 = new connect();
                //To store the data in the database we have to run a query
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";

                //To input value in the table
                connect1.statement.executeUpdate(q);
                new Signup2();
                //To close this signup page when user press next button
                setVisible(false);
            }
        } catch (Exception E) {
           E.printStackTrace(); //To check if there's a runtime error or not
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}
