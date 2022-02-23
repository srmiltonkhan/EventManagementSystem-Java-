
package eventmanagement;

import java.sql.*;
public class DatabaseConnection 
{
   Connection connection;
   Statement statement;
   ResultSet resultSet;
   
   public DatabaseConnection()
   {
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/eventmanagement","root","");
            statement = connection.createStatement();
            System.out.println("Connected");
       }
       catch(ClassNotFoundException | SQLException ae)
       {
           System.out.println("ae");
       }
       
   }
   public static void main(String args[])
   {
       DatabaseConnection dc = new DatabaseConnection();
   }
   
}
