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
import java.sql.*;

public class conn {
  
    Connection c;
    Statement s;
    public conn(){
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
        // System.out.println("Hello");
         c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","2000");
         s=c.createStatement();
    
    }
        catch(Exception e){
            System.out.println(e);
        }
    }

    
}
