package eventmanagement;

import java.sql.*;
public class dbConnection
{
	Connection con;
	Statement stat;
	ResultSet rs;

	public dbConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");// Loading the class
			//Create a connection through the driver manager//
			con = DriverManager.getConnection("jdbc:mysql://localhost/eventmanagement","root","");
			stat = con.createStatement();// createing statement
			System.out.println("Connected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
        public static void main(String args[])
        {
            dbConnection dc = new dbConnection();
        }

}
