package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    JButton add, view, update, remove;
    
    Home(){
        
        super("color");
        Color c1 = new Color(135, 206, 255);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(555, 25, 550, 70);
        heading.setFont(new Font("Monospaced", Font.BOLD, 35));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(650, 120, 180, 40);
        add.setFont(new Font("serif", Font.BOLD, 16));
        add.setBackground(c1);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employees");
        view.setBounds(850, 120, 180, 40);
        view.setFont(new Font("serif", Font.BOLD, 16));
        view.setBackground(c1);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(650, 200, 180, 40);
        update.setFont(new Font("serif", Font.BOLD, 16));
        update.setBackground(c1);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(850, 200 , 180, 40);
        remove.setFont(new Font("serif", Font.BOLD, 16));
        remove.setBackground(c1);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add){
            setVisible(false);
            new AddEmployee();
        }
        else if(ae.getSource() == view){
            setVisible(false);
            new ViewEmployee();
        }
        else if(ae.getSource() == update){
            setVisible(false);
            new ViewEmployee();
        }
        else if(ae.getSource() == remove){
            setVisible(false);
            new RemoveEmployee();
        }
    }
    
    public static void main(String[] args)
    {
        new Home();
        
    }
}
