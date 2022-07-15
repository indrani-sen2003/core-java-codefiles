import java.sql.*;
import java.sql.Statement;
class mysql_prepare{
public static void main(String [] args) throws Exception{

Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nice","root","Savarkar123@");
PreparedStatement st=cn.prepareStatement("insert into employee values(?,?,?)");
st.setInt(1,101);
st.setString(2,"Sohail");
st.setInt(3,50000);

int x=st.executeUpdate();

st=cn.prepareStatement("insert into employee values(?,?,?)");
st.setInt(1,102);
st.setString(2,"Rita");
st.setInt(3,20000);
x=st.executeUpdate();

cn.close();
}
}