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
import javax.swing.border.*;

public class Read_Me extends JFrame{
    private JPanel p;
    private JLabel l;
    private JButton b1;
    public static void main(String[] args)
    {
        new Read_Me().setVisible(true);
    }
    
    public Read_Me()
    {
       setBounds(600,300,600,400);
       p=new JPanel();
       p.setBackground(Color.GREEN);
       setContentPane(p);
       p.setLayout(null);
       
       
    }
}
