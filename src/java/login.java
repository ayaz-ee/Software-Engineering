
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class login 
{
    public static void main(String[] args)
    {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","banala");
            if(conn != null)
            {
                System.out.println("connected to database successfully.");
            }
        } catch (SQLException ex) 
        {
            System.out.println("not connected to database.");
            //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
