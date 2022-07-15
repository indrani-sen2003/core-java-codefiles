/*print multiplication table using for loop*/
import java.io.*;
class mult_tab{


public static void main(String [] args) throws Exception{
int x;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the number:");
x=Integer.parseInt(in.readLine());
for (int i=1;i<=10;i++){
 System.out.println(x +"x "+ i+ " = "+ x*i);

}
}
}