import java.lang.Math;
import java.io.DataInputStream;

class sqrt{

public static void main(String [] args) throws Exception{

double x;
System.out.println("Enter a number:");
DataInputStream in=new DataInputStream(System.in);
x=Integer.parseInt(in.readLine());
System.out.println("The sqrt="+Math.sqrt(x));
}

}