import java.sql.*;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class SelectRecord
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String dburl = "jdbc:mysql://localhost/Employee";    
    static final String dbuser = "kavita";
    static final String dbpass = "210427";
    
public static void main(String[] args)
{
 Connection con = null;
 Statement stmt = null;
 
 try 
 {
     
     con = DriverManager.getConnection(dburl, dbuser, dbpass);     
     
     stmt=con.createStatement();
     
     String query="SELECT * FROM Accounts";
     
     
     ResultSet rset = stmt.executeQuery(query);
     while(rset.next())
     {
      System.out.print("account: " + rset.getInt(1));
      System.out.print(" Name: "+rset.getString(2));
      System.out.println(" Mobile: "+rset.getString(3))
      System.out.println(" address: "+rset.getString(3));
     }
 } 
 
 catch (SQLException e) 
 {
     System.err.println("Cannot connect ! ");
     e.printStackTrace();
 }
 
 finally {
     System.out.println("Closing the connection.");
     if (con != null) try { con.close(); } catch (SQLException ignore) {}
 }
 
}
}
