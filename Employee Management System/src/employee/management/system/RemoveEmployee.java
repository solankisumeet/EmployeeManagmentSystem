package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*; 
import java.awt.event.*;

public class RemoveEmployee extends JFrame implements ActionListener{
    
    Choice cempId;
    JButton delete, back;
    
    RemoveEmployee(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel lblempId = new JLabel("Employee Id");
        lblempId.setBounds(50, 50, 100, 30);
        add(lblempId);
        
        cempId = new Choice();
        cempId.setBounds(200, 50, 100, 30);
        add(cempId);
        
        try{
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                cempId.add(rs.getString("empId"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 100, 100, 30);
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(200, 100, 150, 30);
        add(labelname);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(50, 150, 100, 30);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(200, 150, 150, 30);
        add(labelphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(50, 200, 100, 30);
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        labelemail.setBounds(200, 200, 150, 30);
        add(labelemail);
        
        try{
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+cempId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelphone.setText(rs.getString("Phone"));
                labelemail.setText(rs.getString("Email"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        cempId.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try{
                    Conn c = new Conn();
                    String query = "select * from employee where empId = '"+cempId.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);

                    while(rs.next()){
                        labelname.setText(rs.getString("name"));
                        labelphone.setText(rs.getString("Phone"));
                        labelemail.setText(rs.getString("Email"));
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        
        delete = new JButton("Remove");
        delete.setBounds(80, 300, 100, 30);
        delete.setBackground(Color.red);
        delete.setForeground(Color.white);
        delete.addActionListener(this);
        add(delete);
        
        back = new JButton("Back");
        back.setBounds(220, 300, 100, 30);
        back.setBackground(Color.red);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1200, 700);
        add(image);
        
        setSize(1000, 400);
        setLocation(300, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == delete){
            try{
                Conn c = new Conn();
                String query = "delete from employee where empId = '"+cempId.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee information removed successfully");
                setVisible(false);
                new Home();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(true);
            new Home();
        }
    }
    
    public static void main(String[] args){
        
        new RemoveEmployee();
    }
}
