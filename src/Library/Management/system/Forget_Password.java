/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.system;

/**
 *
 * @author Ayan
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Forget_Password extends JFrame implements ActionListener{
    
     private JLabel l1,l2,l3,l4,l5;
     private JPanel panel;
     private JTextField textField1,textField2,textField3,textField4,textField5;
     private JButton b1,b2,b3;
    public static void main(String[] args)
    {
        new Forget_Password().setVisible(true);
    }
    public Forget_Password(){
    
        setBounds(500, 200, 650, 500);
        panel=new JPanel();
        panel.setBackground(Color.YELLOW);
        setContentPane(panel);
        panel.setLayout(null);
        
                
                
                
       
        l1=new JLabel("USERNAME :");
        l1.setBounds(99, 86, 92, 26);
        l1.setBackground(Color.BLACK);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l1);
        
        l2=new JLabel("NAME : ");
        l2.setBounds(99, 123, 92, 26);
        l2.setBackground(Color.BLACK);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l2);
        
        l3=new JLabel("SECURITY :");
        l3.setBounds(99, 160, 92, 26);
        l3.setBackground(Color.BLACK);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l3);
        
        l4=new JLabel("ANSWER :");
        l4.setBounds(99, 197, 140, 26);
        l4.setBackground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l4);
        
        l5=new JLabel("PASSWORD:");
        l5.setBounds(99, 234, 92, 26);
        l5.setBackground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l5);      
        
        textField1=new JTextField();
        textField1.setBounds(265, 91, 148, 20);
        panel.add(textField1); 
        
        textField2=new JTextField();
        textField2.setBounds(265, 128, 148, 20);
        textField2.setEditable(false);
        panel.add(textField2);
        
        textField3=new JTextField();
        textField3.setBounds(265, 165, 148, 20);
        textField3.setEditable(false);
        panel.add(textField3);
     
        textField4=new JTextField();
        textField4.setBounds(265, 239, 148, 20);
        textField4.setEditable(false);
        panel.add(textField4);
        
        textField5=new JTextField("");
        textField5.setBounds(265, 202, 148, 20);
        panel.add(textField5);
        
        b1=new JButton("Search");
        b1.addActionListener(this);
        b1.setBounds(428,83,80,29);
        b1.setBackground(Color.MAGENTA);
        panel.add(b1);
        
        b2=new JButton("Retrieve");
        b2.addActionListener(this);
        b2.setBounds(426, 188, 85, 29);
        b2.setBackground(Color.GREEN);
        panel.add(b2);
        
        b3=new JButton("Back");
        b3.addActionListener(this);
        b3.setBounds(233, 270, 101, 29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        panel.add(b3);
    }
    public void actionPerformed(ActionEvent ae){
    
        try{
            conn con=new conn();
            if(ae.getSource()==b1)
            {
                String sql="select * from account where username=?";
                PreparedStatement ps=con.c.prepareStatement(sql);
                ps.setString(1,textField1.getText());
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                   textField2.setText(rs.getString("name"));
                   textField3.setText(rs.getString("security"));
                }
                else
                    JOptionPane.showMessageDialog(null,"Username Didn't Matched..!!");  
              
             }
           
            if(ae.getSource()==b2)
            {
                 // String sql="select password from account where answer=?";
                  PreparedStatement ps=con.c.prepareStatement("select * from account where answer=?");
                  ps.setString(1,textField5.getText());
                   ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                    textField4.setText(rs.getString("password"));
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Answer..!!");
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");
                    
                }
            
            }
            
            if(ae.getSource()==b3)
            {
                setVisible(false);
                new Login_User().setVisible(true);
            
            }
           
        }
        catch(Exception e){
        
            e.getStackTrace();
        }
    }
}
