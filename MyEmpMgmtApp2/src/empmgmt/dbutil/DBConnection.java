
package empmgmt.dbutil;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Asus
 */
public class DBConnection {
    private static Connection conn;
    static
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//AdityaKumar:1521/xe","myproject","java");
            JOptionPane.showMessageDialog(null, "Connection opened successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in loading the driver","DriverError!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in opening connection","DB Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1); 
        }
    }

public static Connection getConnection()
{
  return conn;
}
public static void closeConnection()
{
    try{
        conn.close();
        JOptionPane.showMessageDialog(null, "Connection closed successfully","Success",JOptionPane.INFORMATION_MESSAGE);
    }
    catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error in closing connection","DB Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
}
}