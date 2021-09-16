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


public class About_Us extends JFrame implements ActionListener {
    
    	private JPanel contentPane;
        JButton b1;

        public static void main(String[] args) {
            new About_Us().setVisible(true);			
	}
    
        public About_Us() {
            
           // super("About Us - Code for Interview");
          //  setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("LIBRARY");
            l3.setForeground(Color.ORANGE);
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("MANAGEMENT SYSTEM");
            l4.setForeground(Color.ORANGE);
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v2.0");
            l5.setForeground(Color.ORANGE);
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : AYAN NANDY");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : ayannandy0002@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            

            JLabel l9 = new JLabel("Follow us on Instagram : ayannandy004");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 290, 600, 34);
            contentPane.add(l9);


          /*  JLabel l10 = new JLabel("**If you want us to make Java Project for you, drop a mail**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);*/
             b1=new JButton("BACK");
             b1.addActionListener(this);
             b1.setForeground(Color.DARK_GRAY);
             b1.setBackground(Color.CYAN);
             b1.setBounds(270, 370, 100, 33);
             contentPane.add(b1);
                
            contentPane.setBackground(Color.WHITE);
	}
        public void actionPerformed(ActionEvent ae)
        {
            try{
            conn con=new conn();
            
            if(ae.getSource()==b1)
            {
                setVisible(false);
                new Home().setVisible(true);            }
        }
            catch(Exception e){
            e.getStackTrace();
            }
        }
}
