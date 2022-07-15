import java.sql.*;
import java.sql.Statement;
class mysql_con_metadata{
public static void main(String [] args) throws Exception{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/telecom","root","Savarkar123@");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from call_register");
while (rs.next())
{
System.out.println(rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(1)+rs.getString(5));

}
ResultSetMetaData md=rs.getMetaData();
System.out.println("Total columns: "+md.getColumnCount());  
for(int i=1;i<=md.getColumnCount();i++){
System.out.println("Column Name of 1st column: "+md.getColumnName(i));  
System.out.println("Column Type Name of 1st column: "+md.getColumnTypeName(i)); 
} 
con.close();

}
}





