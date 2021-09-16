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
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.border.*;

public class Add_Student extends JFrame implements ActionListener  {
    private JLabel l1,l2,l3,l4,l5,l6;
    private JComboBox cb1,cb2,cb3,cb4;
    private JTextField t1,t2;
    private JPanel p;
    private JButton b1,b2;
    
    public static void main(String[] args)
    {
        new Add_Student().setVisible(true);
    }
    
    public Add_Student()
    {
        setBounds(700, 200, 550, 450);
        p=new JPanel();
        p.setBackground(Color.CYAN);
        setContentPane(p);
        p.setLayout(null);
        
        l1=new JLabel("STUDENT ID :");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(64, 63, 102, 22);
        p.add(l1);
        
        l2=new JLabel("NAME :");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(64, 97, 102, 22);
        p.add(l2);
        
        l3=new JLabel("COURSE :");
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(64, 135, 102, 22);
        p.add(l3);
        
        l4=new JLabel("DEPARTMENT :");
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(64, 180, 108, 22);
        p.add(l4);
        
        l5=new JLabel("SEMESTER :");
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(64, 220, 102, 22);
        p.add(l5);
        
        l6=new JLabel("YEAR :");
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(64, 260, 102, 22);
        p.add(l6);
        
        t1=new JTextField();
        t1.setBounds(220, 63, 156, 22);
        p.add(t1);
        
        t2=new JTextField();
        t2.setBounds(220, 100, 156, 22);
        p.add(t2);
        
        cb1=new JComboBox();
        cb1.setModel(new DefaultComboBoxModel(new String[] {"B.TECH","M.TECH" }));
        cb1.setBounds(220, 135, 154, 22);
        p.add(cb1);
        
        cb2=new JComboBox();
        cb2.setModel(new DefaultComboBoxModel(new String[] {"ECE", "CSE", "IT", "CE", "EE", "ME", "AEIE" }));
        cb2.setBounds(220, 180, 154, 22);
        p.add(cb2);
        
        cb3=new JComboBox();
        cb3.setModel(new DefaultComboBoxModel(new String[] {"1st","2nd","3rd","4th","5th","6th","7th","8th" }));
        cb3.setBounds(220,220, 154, 22);
        p.add(cb3);
        
        cb4=new JComboBox();
        cb4.setModel(new DefaultComboBoxModel(new String[] {"1st","2nd","3rd","4th" }));
        cb4.setBounds(220,260, 154, 22);
        p.add(cb4);
        
        b1=new JButton("ADD");
        b1.addActionListener(this);
        b1.setBounds(90, 321, 111, 33);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.DARK_GRAY);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        p.add(b1);
        
        b2=new JButton("BACK");
        b2.addActionListener(this);
        b2.setBounds(280, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        p.add(b2);
    }
        
        
        
      public void actionPerformed(ActionEvent ae)
        {
            try{
              conn con=new conn();
              if(ae.getSource()==b1)
              {
                  
                  String sql="insert into student values(?,?,?,?,?,?,?)";
                  PreparedStatement ps=con.c.prepareStatement(sql);
                  ps.setString(1,t1.getText());
                  ps.setString(2,t2.getText());
                  ps.setString(3,(String) cb1.getSelectedItem());
                  ps.setString(4,(String) cb2.getSelectedItem());
                  ps.setString(5,(String) cb3.getSelectedItem());
                  ps.setString(6,(String) cb4.getSelectedItem());
                  ps.setString(7,"0");
                  
                  int n=ps.executeUpdate();
                  if(n>0)
                  {
                      JOptionPane.showMessageDialog(null,"Record Updated");
                      t1.setText("");
                      t2.setText("");
                  }
                  
                  
              
              }
              if(ae.getSource()==b2)
              {
                  setVisible(false);
                  new Home().setVisible(true);
              
              }
                
            }
            catch(Exception e)
            {
                e.getStackTrace();
            }
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

