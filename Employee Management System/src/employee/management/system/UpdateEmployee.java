package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
    
    JTextField tfeducation, tfname, tffname, tfaddress, tfphone, tfadhaar, tfemail, tfsalary, tfdesignation;
    JLabel lblempId;
    JButton add, back;
    String empId;
    
    UpdateEmployee(String empId){
        
        super("color");
        Color c1 = new Color(160,82,45);
        
        this.empId = empId;
               
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null);
        
        JLabel heading = new JLabel("Update Employee Details");
        heading.setBounds(260, 30, 500, 50);
        heading.setFont(new Font("San_Serif", Font.BOLD, 37));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel lablename = new JLabel("Name");
        lablename.setBounds(50, 150, 150, 30);
        lablename.setFont(new Font("serif", Font.BOLD, 23));
        lablename.setForeground(Color.WHITE);
        add(lablename);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        lblname.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        lblname.setForeground(Color.WHITE);
        lblname.setBackground(null);
        add(lblname);
        
        JLabel lablefname = new JLabel("Father's Name");
        lablefname.setBounds(450, 150, 150, 30);
        lablefname.setFont(new Font("serif", Font.BOLD, 23));
        lablefname.setForeground(Color.WHITE);
        add(lablefname);
        
        JLabel lblfname = new JLabel();
        lblfname.setBounds(650, 150, 150, 30);
        lblfname.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        lblfname.setForeground(Color.WHITE);
        lblfname.setBackground(null);
        add(lblfname);
        
        JLabel labledob = new JLabel("Date of Birth");
        labledob.setBounds(50, 200, 150, 30);
        labledob.setFont(new Font("serif", Font.BOLD, 23));
        labledob.setForeground(Color.WHITE);
        add(labledob);
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        lbldob.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        lbldob.setForeground(Color.WHITE);
        lbldob.setBackground(null);
        add(lbldob);
        
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
        
//        String courses[] = {"BBA", "MBA", "BE/B.Tech", "BCA", "BA", "PHD", "B.COM", "M.COM", "MCA", "MA", "M.Tech", "BSC", "MSC"};
        tfeducation = new JTextField();
        tfeducation.setBackground(Color.BLACK);
        tfeducation.setBounds(650, 300, 150, 30);
        tfeducation.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        tfeducation.setBackground(null);
        add(tfeducation);
        
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
        
        JLabel lbladhaar = new JLabel();
        lbladhaar.setBounds(650, 350, 150, 30);
        lbladhaar.setBorder(BorderFactory.createLineBorder(Color.white, 0));
        lbladhaar.setForeground(Color.WHITE);
        lbladhaar.setBackground(null);
        add(lbladhaar);
        
        JLabel lableempId = new JLabel("Employee ID");
        lableempId.setBounds(50, 400, 150, 30);
        lableempId.setFont(new Font("serif", Font.BOLD, 23));
        lableempId.setForeground(Color.WHITE);
        add(lableempId);
        
        lblempId = new JLabel();
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 23));
        lblempId.setForeground(Color.WHITE);
        add(lblempId);
        
        try{
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                lblname.setText(rs.getString("name"));
                lblfname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfsalary.setText(rs.getString("salary"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                tfdesignation.setText(rs.getString("designation"));
                lbladhaar.setText(rs.getString("adhaar"));
                lblempId.setText(rs.getString("empId"));                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        add = new JButton("Update");
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
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) tfeducation.getText();
            String designation = tfdesignation.getText();
            
            try{
                Conn conn = new Conn();
                String query = "update employee set salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
        new UpdateEmployee("");
    }
}
