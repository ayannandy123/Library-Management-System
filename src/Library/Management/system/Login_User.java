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
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class Login_User extends JFrame implements ActionListener{

   
    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;
    
    public Login_User(){
    
        setBackground(Color.BLUE);
        setBounds(600,300,600,400);
        panel=new JPanel();
        panel.setBackground(Color.cyan);
        setContentPane(panel);
        panel.setLayout(null);
        
        JLabel l1=new JLabel("Username : ");
        l1.setBounds(124, 89, 95, 24);
        panel.add(l1);
        
        JLabel l2=new JLabel("Password : ");
        l2.setBounds(124, 124, 95, 24);
        panel.add(l2);
        
        textField=new JTextField();
        textField.setBounds(210, 93, 157, 20);
        panel.add(textField);
        
        passwordField=new JPasswordField();
        passwordField.setBounds(210, 128, 157, 20);
        panel.add(passwordField);
        
        b1=new JButton("Login");
        b1.addActionListener(this);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.YELLOW);
        b1.setBounds(149, 181, 113, 39);
        panel.add(b1);
        
        b2=new JButton("Signup");
        b2.addActionListener(this);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.DARK_GRAY);
        b2.setBounds(289, 181, 113, 39);
        panel.add(b2);
        
        b3=new JButton("Forgot Password");
        b3.addActionListener(this);
        b3.setBackground(Color.RED);
        b3.setForeground(Color.BLACK);
        b3.setBounds(199, 231, 179, 39);
        panel.add(b3);
        
        JLabel l3=new JLabel("Trouble in login???");
        //l3.setFont(Font.ITALIC);
        l3.setForeground(Color.red);
        l3.setBounds(70, 240, 130, 20);
        panel.add(l3);
        
      
      }
      public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==b1){
            boolean status=false;
            try{
            conn con=new conn();
            String sql="select * from account where username=? and password=?";
            PreparedStatement st=con.c.prepareStatement(sql);
            st.setString(1,textField.getText());
            st.setString(2,passwordField.getText());
            ResultSet rs=st.executeQuery();//stores the result after execution
            if(rs.next()){
            this.setVisible(false);
          new Home().setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null,"Invalid Login...!");
           
            
            }
            catch(Exception e1){
            e1.getStackTrace();
            }
            }
            if(ae.getSource()==b2){
            setVisible(false);
           new Sign_Up().setVisible(true);
            }
            if(ae.getSource()==b3){
            setVisible(false);
            new Forget_Password().setVisible(true);
            }
            
        }
      public static void main(String[] args){
           new Login_User().setVisible(true);     
      }

   
    
   
    
}
