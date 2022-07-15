import java.sql.*;
public class mycon_driver {
	public static void main(String[] args) {
		  System.out.println("MySQL Connect Example.");
		  Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "telecom";
		  String driver = "com.mysql.cj.jdbc.Driver";
		  String userName = "root"; 
		  String password = "Savarkar123@";
		  try {
                  Driver mydriver=new com.mysql.cj.jdbc.Driver();
                  DriverManager.registerDriver(mydriver);
		  
		  conn = DriverManager.getConnection(url+dbName,userName,password);
		  System.out.println("Connected to the database");
		  conn.close();
		  System.out.println("Disconnected from database");
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
		  }

}