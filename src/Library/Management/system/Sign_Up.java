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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Sign_Up extends JFrame implements ActionListener {
    private JLabel l1,l2,l3,l4,l5;
    private JTextField textField1,textField2,textField4;
    private JPasswordField passwordField;
    private JComboBox comboBox;
    private JButton b1,b2;
    private JPanel panel;
    public static void main(String[] args){
    
        new Sign_Up().setVisible(true);
    }
    public Sign_Up(){
       setBounds(600, 250, 606, 406);
       setBackground(Color.BLUE);
        panel=new JPanel();
        panel.setBackground(Color.cyan);
        setContentPane(panel);
        panel.setLayout(null);
        
    
        l1=new JLabel("USERNAME :");
        l1.setBounds(99, 86, 92, 26);
        l1.setBackground(Color.DARK_GRAY);
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l1);
        
        l2=new JLabel("NAME : ");
        l2.setBounds(99, 123, 92, 26);
        l2.setBackground(Color.DARK_GRAY);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l2);
        
        l3=new JLabel("PASSWORD :");
        l3.setBounds(99, 160, 92, 26);
        l3.setBackground(Color.DARK_GRAY);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l3);
        
        l4=new JLabel("SECURITY :");
        l4.setBounds(99, 197, 140, 26);
        l4.setBackground(Color.DARK_GRAY);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l4);
        
        l5=new JLabel("ANSWER :");
        l5.setBounds(99, 234, 92, 26);
        l5.setBackground(Color.DARK_GRAY);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(l5);
        
        textField1=new JTextField();
        textField1.setBounds(265, 91, 148, 20);
        panel.add(textField1);
        
        textField2=new JTextField();
        textField2.setBounds(265, 128, 148, 20);
        panel.add(textField2);
        
     
        textField4=new JTextField();
        textField4.setBounds(265, 239, 148, 20);
        panel.add(textField4);
        
        passwordField=new JPasswordField();
        passwordField.setBounds(265, 165, 148, 20);
        panel.add(passwordField);
        
        b1=new JButton("Create");
        b1.addActionListener(this);
        b1.setBounds(140, 289, 100, 30);
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.DARK_GRAY);
        panel.add(b1);
        
        b2=new JButton("Back");
        b2.addActionListener(this);
        b2.setBackground(Color.YELLOW);
        b2.setForeground(Color.DARK_GRAY);
        b2.setBounds(300, 289, 100, 30);
        panel.add(b2);
        
        comboBox=new JComboBox();
        comboBox.setBounds(265, 202, 148, 20);
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"Your Favourite Food?", "Your Lucky Number?","Your child SuperHero?", "Your childhood Name ?"}));
        panel.add(comboBox);
        
    }
        
        public void actionPerformed(ActionEvent ae){
          try{
              conn con=new conn();
              if(ae.getSource()==b1)
              {
                 // this.setVisible(true);
                  String sql="insert into account values(?, ?, ?, ?, ?)";
                  PreparedStatement st=con.c.prepareStatement(sql);
                  st.setString(1,textField1.getText());
                  st.setString(2,textField2.getText());
                  st.setString(3,passwordField.getText());
                  //ps.setString(3,textField3.getText());
                  st.setString(4,(String) comboBox.getSelectedItem());
                  st.setString(5,textField4.getText());
                  
                  int n=st.executeUpdate();
                  
                  if(n>0){
                      JOptionPane.showMessageDialog(null,"Successfully Updated.");
                  }
                  
              }
               textField1.setText("");
               textField2.setText("");
               passwordField.setText("");
               textField4.setText("");
           
              if(ae.getSource()==b2)
              {
                  this.setVisible(false);
                  new Login_User().setVisible(true);
              
              }
          
          }
          catch(Exception e){
          e.getStackTrace();
          }
            
            
        
            
        }
        
} 
          
        
        
        
        
 
