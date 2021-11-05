
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MPC
 */
public class DB {
    Connection conn=null;
    public static Connection connect(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\hasib\\Downloads\\Project\\Player\\database\\database.db");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error");
            return null;
        }
        
    }
}

