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
import javax.swing.border.*;

public class Add_Book extends JFrame implements ActionListener {
     private JComboBox cb1,cb2;
     private JTextField t1,t2,t3,t4,t5,t6,t7;
     private JPanel p;
     private JButton b1,b2;
     
     public static void main(String[] args)
     {
         new Add_Book().setVisible(true);
     }
     
     
     public Add_Book()
     {
        setBounds(600, 200, 518, 442);
	p = new JPanel();
        p.setBackground(Color.CYAN);
	p.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(p);
	p.setLayout(null);
        
        JLabel l1 = new JLabel("NAME :");
	l1.setForeground(new Color(47, 79, 79));
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(73, 84, 90, 22);
	p.add(l1);

	JLabel l2 = new JLabel("ISBN :");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(73, 117, 90, 22);
	p.add(l2);

	JLabel l3 = new JLabel("PUBLISHER :");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(73, 150, 105, 22);
	p.add(l3);

	JLabel l4 = new JLabel("PRICE :");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(73, 216, 90, 22);
	p.add(l4);

	JLabel l5 = new JLabel("PAGES");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(73, 249, 90, 22);
	p.add(l5);

	JLabel l6 = new JLabel("BOOK ID :");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(73, 51, 90, 22);
	p.add(l6);

	JLabel l7 = new JLabel("EDITION :");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(73, 183, 90, 22);
	p.add(l7);
        
      
        
        
        
        t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(183, 54, 198, 20);
	p.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(183, 87, 198, 20);
	p.add(t2);

	t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(183, 120, 198, 20);
	p.add(t3);

	t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(183, 153, 198, 20);
	p.add(t4);

        t5 = new JTextField();
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(183, 219, 198, 20);
	p.add(t5);

	t6 = new JTextField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(183, 252, 198, 20);
	p.add(t6);

	cb1 = new JComboBox();
	cb1.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
	cb1.setBounds(183, 186, 198, 20);
	p.add(cb1);
        
       
        
        
        b1 = new JButton("ADD");
	b1.addActionListener(this);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(102, 295, 100, 33);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.DARK_GRAY);
	p.add(b1);

	b2 = new JButton("BACK");
	b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(250, 295, 108, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        p.add(b2);
        	

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(138, 43, 226), 2), "Add Books", TitledBorder.LEADING,
			TitledBorder.TOP, null, new Color(0, 0, 255)));
	panel.setBounds(10, 29, 398, 344);
	p.add(panel);
        


        
        
     }
     public void actionPerformed(ActionEvent ae)
     {
         try{
           conn con=new conn();
           if(ae.getSource()==b1)
           {
             String sql="insert into book values(?,?,?,?,?,?,?,?)";
                  PreparedStatement ps=con.c.prepareStatement(sql);
                  ps.setString(1,t1.getText());
                  ps.setString(2,t2.getText());
                  ps.setString(3,t3.getText());
                  ps.setString(4,t4.getText());
                  ps.setString(5,(String) cb1.getSelectedItem());
                  ps.setString(6,t5.getText());
                  ps.setString(7,t6.getText());
                  ps.setString(8,"N");
                  
                  
                  int m=ps.executeUpdate();
                  if(m>0)
                  {
                      JOptionPane.showMessageDialog(null,"Record Updated");
                      t1.setText("");
                      t2.setText("");
                      t3.setText("");
                      t4.setText("");
                      t5.setText("");
                      t6.setText("");
                      
                  }
                  else
                      JOptionPane.showMessageDialog(null,"Cant");
           }
           if(ae.getSource()==b2)
           {
                     setVisible(false);
                  new Home().setVisible(true);
           }
                  
         }
         catch(Exception e){
         e.getStackTrace();
         }
         
     }
}
