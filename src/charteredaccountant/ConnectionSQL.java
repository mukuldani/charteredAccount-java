package charteredaccountant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionSQL {
   Connection conn = null;
    ConnectionSQL() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/charteredaccountant?useSSL=false","root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Connection error "+ex);
        }
    }   
}
