package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    
    Splash() {
        
        super("color");
        Color c1 = new Color(0, 150, 175);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(80, 30, 1200, 70);
        heading.setFont(new Font("Monospaced", Font.BOLD, 65));
        heading.setForeground(Color.DARK_GRAY);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1200, 700);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(445, 520, 300, 70);
        clickhere.setFont(new Font("serif", Font.PLAIN, 20));
        clickhere.setBackground(c1);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        setSize(1200, 700);
        setLocation(200, 50);
        setVisible(true);
        
        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e) {
                
            }
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e) {
                
            }
        }
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String args[]) {
        new Splash();
    }
}