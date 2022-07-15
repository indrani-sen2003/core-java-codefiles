import java.io.FileOutputStream;
import java.io.*;

class fs_out{

public static void main(String [] args) throws Exception{

System.out.println("Enter the text to be added:");
DataInputStream in=new DataInputStream(System.in);
String text=in.readLine();

FileOutputStream fo=new FileOutputStream("d:/message_file.txt");
byte [] b=new byte[1000];
b=text.getBytes();
fo.write(b);
System.out.println("File written...successfully");


}
}