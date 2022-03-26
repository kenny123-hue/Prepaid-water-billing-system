/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepaidwaterbillingsystem;

import java.sql.*;

/**
 *
 * @author kelvinolang
 */
public class PREPAIDWATERBILLINGSYSTEM {
    
 private static String Username;

    public static String getMeterno() {
        return Meterno;
    }

    public static void setMeterno(String Meterno) {
        PREPAIDWATERBILLINGSYSTEM.Meterno = Meterno;
    }
 private static String Meterno;
    private static final String USERNAME = "Olang";
    private static final String PASSWORD = "Olang254";
    private static final String CONN_STRING = 
            "jdbc:mysql://localhost:3306/prepaid water system";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
         Connection conn = null;
                try {
                    
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("connected");
            new Loginform().setVisible(true);
            
        
            }catch (SQLException e) {
            System.err.println(e);
        }
               
        // TODO code application logic here
    }

    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String Username) {
        PREPAIDWATERBILLINGSYSTEM.Username = Username;
    }
    
}
