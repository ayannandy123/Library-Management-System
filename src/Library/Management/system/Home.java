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

public class Home extends JFrame implements ActionListener{
    private JLabel l1,l2,l3,l4,l5,l6;
    private JMenuBar mb;
    private JPanel p;
    private JButton b1,b2,b3,b4,b5,b6;
    
    public static void main(String args[]){
    
        new Home().setVisible(true);
    }
    public Home(){
        
        setBounds(400,150,1000,800);
        setBackground(Color.BLUE);
        p=new JPanel();
        setContentPane(p);
        p.setBackground(Color.BLUE);
        p.setLayout(null);
        
        mb=new JMenuBar();
        mb.setBounds(0, 10, 1000, 35);
        mb.setBackground(Color.CYAN);
        p.add(mb);
        
        JMenu mnr=new JMenu("Record");
        mnr.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mb.add(mnr);
        
        JMenuItem mntmbd=new JMenuItem("Book_Details");
        mntmbd.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mntmbd.addActionListener(this);
        mnr.add(mntmbd);
        
        JMenuItem mntmsd=new JMenuItem("Student_Details");
        mntmsd.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mntmsd.addActionListener(this);
        mnr.add(mntmsd);
        
        
        JMenu mnh=new JMenu("Help");
        mnh.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mb.add(mnh);
        
        JMenuItem mntmrm=new JMenuItem("Read Me");
        mntmrm.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mntmrm.addActionListener(this);
        mnh.add(mntmrm);
        
        JMenuItem mntmau=new JMenuItem("About Us");
        mntmau.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mntmau.addActionListener(this);
        mnh.add(mntmau);
        
        
        JMenu mnexit=new JMenu("Exit");
        mnexit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mb.add(mnexit);
        
        JMenuItem mnlogout=new JMenuItem("Logout");
        mnlogout.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mnlogout.addActionListener(this);
        mnexit.add(mnlogout);
        
        JMenuItem mntmexit=new JMenuItem("Exit");
        mntmexit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        mntmexit.addActionListener(this);
        mnexit.add(mntmexit);
        
        l1=new JLabel("WELCOME TO SMART LIBRARY");
        l1.setBounds(268, 30, 701, 80);
        l1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l1.setForeground(Color.ORANGE);
        p.add(l1);
        
        JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/second.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(60, 140, 159, 152);
            p.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/third.png"));
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(300, 160, 134, 128);
            p.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fourth.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(530, 140, 225, 152);
            p.add(l4);

        
        b1=new JButton("Add Book");
        b1.addActionListener(this);
        b1.setBounds(60, 320, 155, 40);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        p.add(b1);
        
        b2=new JButton("Statistics");
        b2.addActionListener(this);
        b2.setBounds(313, 320, 167, 44);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        p.add(b2);
        
        b3=new JButton("Add Student");
        b3.addActionListener(this);
        b3.setBounds(562, 320, 167, 44);
        b3.setBackground(Color.green);
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        p.add(b3);
        
         JPanel p1 = new JPanel();
         p1.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,TitledBorder.TOP, null, new Color(220, 20, 60)));
         p1.setBounds(20, 120, 750, 260);
         p1.setBackground(Color.WHITE);
         p.add(p1);
        
        b4=new JButton("Issue Book");
        b4.addActionListener(this);
        b4.setBounds(76, 620, 143, 41);
        b4.setBackground(Color.GREEN);
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        p.add(b4);
        
        b5=new JButton("Return Book");
        b5.addActionListener(this);
        b5.setBounds(310, 620, 159, 41);
        b5.setBackground(Color.GREEN);
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        p.add(b5);
        
        b6=new JButton("About Us");
        b6.addActionListener(this);
        b6.setBounds(562, 620, 159, 41);
        b6.setBackground(Color.GREEN);
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        p.add(b6);

          JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("Library/Management/system/icons/fifth.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l5 = new JLabel(i12);
            l5.setBounds(60, 440, 159, 163);
            p.add(l5);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("Library/Management/system/icons/sixth.png"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l6 = new JLabel(i15);
            l6.setBounds(332, 440, 139, 152);
            p.add(l6);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/seventh.png"));
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            l7 = new JLabel(i18);
            l7.setBounds(562, 440, 157, 152);
            p.add(l7);
        
         JPanel p2= new JPanel();
         p2.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Action", TitledBorder.LEADING,TitledBorder.TOP, null, new Color(220, 20, 60)));
         p2.setBounds(20, 420, 750, 270);
         p2.setBackground(Color.WHITE);
         p.add(p2);
       }
    public void actionPerformed(ActionEvent ae){
    
        try{
        String msg=ae.getActionCommand();
        if(msg.equals("Logout")){
        
            setVisible(false);
            new Login_User().setVisible(true);
        }
            
        else if(msg.equals("Exit"))
            System.exit(0);
        else if(msg.equals("Read Me"));
        {
            setVisible(false);
           // new Read_Me().setVisible(true);
        }
        if(msg.equals("About Us"))
                {
                 setVisible(false);
                // new About_Us().setVisible(true);
                }
        if(msg.equals("Book_Details")){
        
            setVisible(false);
            new Book_Details1().setVisible(true);
        }
        else if(msg.equals("Student_Details"))
        {
             setVisible(false);
             new Student_Details1().setVisible(true);
            
        }
        conn con=new conn();
        if(ae.getSource()==b1)
        {
            setVisible(false);
            new Add_Book().setVisible(true);
        }
       if(ae.getSource()==b2)
        {  
           setVisible(false);
           new Statistics_N().setVisible(true);
        }
       if(ae.getSource()==b3)
       {
           setVisible(false);
           new Add_Student().setVisible(true);
       }
        if(ae.getSource()==b4)
        {
            setVisible(false);
            new Issue_Book().setVisible(true);
        }
        
         if(ae.getSource()==b6)
        {
            setVisible(false);
            new About_Us().setVisible(true);
        }
            if(ae.getSource()==b5)
        {
            setVisible(false);
            new Return_Book().setVisible(true);
        }
            
        }catch(Exception e){
        System.out.println(e);
        }
    }
        
        
        
        
        
        
        
        
        
        
      
       
        
        
        
        
        
        
        
        
        
        
        
    
    
}
