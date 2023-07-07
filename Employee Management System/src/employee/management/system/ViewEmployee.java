package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class ViewEmployee extends JFrame implements ActionListener{
    
    JTable table;
    Choice cemployeeId;
    JButton search, print, update, back;
    
    ViewEmployee(){
        
        super("color");
        Color c1 = new Color(138, 43, 226);
                
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblsearch = new JLabel("Search by Employee Id");
        lblsearch.setBounds(20, 20, 150, 20);
        lblsearch.setFont(new Font("serif", Font.BOLD, 15));
        lblsearch.setForeground(Color.WHITE);
        add(lblsearch);
        
        cemployeeId = new Choice();
        cemployeeId.setBounds(180, 20, 150, 20);
        cemployeeId.setBackground(c1);
        cemployeeId.setForeground(Color.WHITE);
        add(cemployeeId);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
                        
            while(rs.next()){
                cemployeeId.add(rs.getString("empId"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
                        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp); 
        
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.setBackground(c1);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);
        
        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.setBackground(c1);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.setBackground(c1);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.setBackground(c1);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/theme.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 100);
        add(image);
                
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            String query = "select * from employee where empId ='"+cemployeeId.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == print){
            try{
                table.print();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == update){
            setVisible(false);
            new UpdateEmployee(cemployeeId.getSelectedItem());
        }
        else{
            setVisible(false);
            new Home();
        }
    }
    
    public static void main(String[] args){
        
        new ViewEmployee(); 
    }
}
