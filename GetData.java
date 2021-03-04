import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
public class JavaInsertDemo {
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Employee", "kavita", "210427");
      System.out.println("Connection is created successfully:");
      stmt = (Statement) conn.createStatement();
      String query1 = "INSERT INTO Accounts " + "values(1234,'Kavita Singh',988982,'test address')";
      stmt.executeUpdate(query1);
      query1 = "INSERT INTO Accounts " + "values(237,'sumit',7676238,'test address')";
      stmt.executeUpdate(query1);
      query1 = "INSERT INTO Accounts " + "values(39223,'akash',988982,'test address')";
      stmt.executeUpdate(query1);
      System.out.println("Accounts are inserted successfully");
      } catch (SQLException excep) {
         excep.printStackTrace();
      } catch (Exception excep) {
         excep.printStackTrace();
      } finally {
         try {
            if (stmt != null)
               conn.close();
         } catch (SQLException se) {}
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }  
      }
      System.out.println("Employees Account details inserted successfully.");
   }
}
