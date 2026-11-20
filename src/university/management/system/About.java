package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    JLabel image, heading, name, rollno, contact;
    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         image = new JLabel(i3);
        add(image);
        
        heading = new JLabel("<html>University<br>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        name = new JLabel("Developed By; Rachit Shah");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        rollno = new JLabel("Roll Number: 123456");
        rollno.setBounds(70, 280, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        contact = new JLabel("Contact: shahrachit@gmail.com");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String args[]) {
        new About();
    }
}
