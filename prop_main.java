import java.util.*;
import java.io.*;
public class prop_main{

public static void main(String [] args) throws Exception{
FileReader reader=new FileReader("db.properties");
Properties p=new Properties();
p.load(reader);
System.out.println(p.get("driver"));
System.out.println(p.get("username"));
System.out.println(p.get("password"));
}

}