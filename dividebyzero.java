import java.io.*;
class dividebyzero{

public static void main(String [] args) throws Exception{
int x=0;
int y=0;
int z=0;
try{

DataInputStream in =new DataInputStream(System.in);
x=Integer.parseInt(in.readLine());
y=Integer.parseInt(in.readLine());
z=x/y;


}
catch(ArithmeticException e){
System.out.println(e);
}
System.out.println("the quotient is:"+z);
}//main
}