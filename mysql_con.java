import java.sql.*;
import java.sql.Statement;
class mysql_con{
public static void main(String [] args) throws Exception{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telecom","root","Savarkar123@");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from call_register");
while (rs.next())
{
System.out.println(rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(1)+rs.getString(5));

}
con.close();

}
}





