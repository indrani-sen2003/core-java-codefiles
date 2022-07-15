import java.sql.*;
import java.sql.Statement;
class mysql_dbmetadata{
public static void main(String [] args) throws Exception{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telecom","root","Savarkar123@");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from call_register");
while (rs.next())
{
System.out.println(rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(1)+rs.getString(5));

}
DatabaseMetaData dbmd=con.getMetaData();  
  
System.out.println("Driver Name: "+dbmd.getDriverName());  
System.out.println("Driver Version: "+dbmd.getDriverVersion());  
System.out.println("UserName: "+dbmd.getUserName());  
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
  
con.close();

}
}





