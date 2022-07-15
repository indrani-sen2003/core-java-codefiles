import java.sql.*;
import java.sql.Statement;
class mysql_tab{
public static void main(String [] args) throws Exception{

Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nice","root","Savarkar123@");
Statement st=cn.createStatement();
int x=st.executeUpdate("create table employee(empid int,empname varchar(10),sal bigint)");
System.out.println("Table created");
cn.close();
}
}