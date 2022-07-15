/* A program with multiple classes*/
/*calculating the area of a rectangle*/
import java.io.*;
class room{

int len;
int bre;

void getd() throws Exception{


DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the length of the room?");
len=Integer.parseInt(in.readLine());
System.out.println("Enter the breadth of the room?");
bre=Integer.parseInt(in.readLine());


}
int area(){

return len*bre;
}



}
class roommain{

public static void main(String [] args) throws Exception{


room r=new room();
r.getd();
System.out.println("The area of the room is:"+r.area());

}



}