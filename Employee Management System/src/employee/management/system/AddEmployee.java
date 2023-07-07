package employee.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfadhaar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee(){
        
        super("color");
        Color c1 = new Color(160,82,45);
        
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null);
        
        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(260, 30, 500, 50);
        heading.setFont(new Font("San_Serif", Font.BOLD, 37));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel lablename = new JLabel("Name");
        lablename.setBounds(50, 150, 150, 30);
        lablename.setFont(new Font("serif", Font.BOLD, 23));
        lablename.setForeground(Color.WHITE);
        add(lablename);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        tfname.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfname.setBackground(null);
        add(tfname);
        
        JLabel lablefname = new JLabel("Father's Name");
        lablefname.setBounds(450, 150, 150, 30);
        lablefname.setFont(new Font("serif", Font.BOLD, 23));
        lablefname.setForeground(Color.WHITE);
        add(lablefname);
        
        tffname = new JTextField();
        tffname.setBounds(650, 150, 150, 30);
        tffname.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tffname.setBackground(null);
        add(tffname);
        
        JLabel labledob = new JLabel("Date of Birth");
        labledob.setBounds(50, 200, 150, 30);
        labledob.setFont(new Font("serif", Font.BOLD, 23));
        labledob.setForeground(Color.WHITE);
        add(labledob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        dcdob.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        dcdob.setBackground(null);
        add(dcdob);
        
        JLabel lablesalary = new JLabel("Salary");
        lablesalary.setBounds(450, 200, 150, 30);
        lablesalary.setFont(new Font("serif", Font.BOLD, 23));
        lablesalary.setForeground(Color.WHITE);
        add(lablesalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(650, 200, 150, 30);
        tfsalary.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfsalary.setBackground(null);
        add(tfsalary);
        
        JLabel lableaddress = new JLabel("Adrress");
        lableaddress.setBounds(50, 250, 150, 30);
        lableaddress.setFont(new Font("serif", Font.BOLD, 23));
        lableaddress.setForeground(Color.WHITE);
        add(lableaddress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        tfaddress.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfaddress.setBackground(null);
        add(tfaddress);
        
        JLabel lablephone = new JLabel("Phone Number");
        lablephone.setBounds(450, 250, 150, 30);
        lablephone.setFont(new Font("serif", Font.BOLD, 23));
        lablephone.setForeground(Color.WHITE);
        add(lablephone);
        
        tfphone = new JTextField();
        tfphone.setBounds(650, 250, 150, 30);
        tfphone.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfphone.setBackground(null);
        add(tfphone);
        
        JLabel lableemail = new JLabel("Email");
        lableemail.setBounds(50, 300, 150, 30);
        lableemail.setFont(new Font("serif", Font.BOLD, 23));
        lableemail.setForeground(Color.WHITE);
        add(lableemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        tfemail.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfemail.setBackground(null);
        add(tfemail);
        
        JLabel lableeducation = new JLabel("Highest Education");
        lableeducation.setBounds(450, 300, 190, 30);
        lableeducation.setFont(new Font("serif", Font.BOLD, 23));
        lableeducation.setForeground(Color.WHITE);
        add(lableeducation);
        
        String courses[] = {"BBA", "MBA", "BE/B.Tech", "BCA", "BA", "PHD", "B.COM", "M.COM", "MCA", "MA", "M.Tech", "BSC", "MSC"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.BLACK);
        cbeducation.setBounds(650, 300, 150, 30);
        cbeducation.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        cbeducation.setBackground(null);
        add(cbeducation);
        
        JLabel labledesignation = new JLabel("Designation");
        labledesignation.setBounds(50, 350, 150, 30);
        labledesignation.setFont(new Font("serif", Font.BOLD, 23));
        labledesignation.setForeground(Color.WHITE);
        add(labledesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        tfdesignation.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfdesignation.setBackground(null);
        add(tfdesignation);
        
        JLabel lableadhaar = new JLabel("Adhaar Number");
        lableadhaar.setBounds(450, 350, 180, 30);
        lableadhaar.setFont(new Font("serif", Font.BOLD, 23));
        lableadhaar.setForeground(Color.WHITE);
        add(lableadhaar);
        
        tfadhaar = new JTextField();
        tfadhaar.setBounds(650, 350, 150, 30);
        tfadhaar.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfadhaar.setBackground(null);
        add(tfadhaar);
        
        JLabel lableempId = new JLabel("Employee ID");
        lableempId.setBounds(50, 400, 150, 30);
        lableempId.setFont(new Font("serif", Font.BOLD, 23));
        lableempId.setForeground(Color.WHITE);
        add(lableempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 23));
        lblempId.setForeground(Color.WHITE);
        add(lblempId);
        
        add = new JButton("Add Details");
        add.setBounds(275, 550, 150, 30);
        add.setFont(new Font("serif", Font.BOLD, 20));
        add.setBackground(c1);
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(475, 550, 150, 30);
        back.setFont(new Font("serif", Font.BOLD, 20));
        back.setBackground(c1);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1200, 700);
        add(image);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add){
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String adhaar = tfadhaar.getText();
            String empId = lblempId.getText();
            
            try{
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+adhaar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Home();
        }
    }
    
    public static void main(String[] args){
        new AddEmployee();
    }
}
