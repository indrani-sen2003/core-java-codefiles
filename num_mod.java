//to find out if a number is divisible by 5
import java.io.*;

class num_mod{

public static void main(String [] args) throws Exception{

DataInputStream in=new DataInputStream(System.in);
int x=Integer.parseInt(in.readLine());
if (x%5==0)
   System.out.println("The number "+x +" is divisible by 5");
else
   System.out.println("The number "+x +" is not divisible by 5");

}

}