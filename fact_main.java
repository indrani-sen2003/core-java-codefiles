/*to find the factorial of a number */
import java.io.*;
class fact{

int f(int n){
int i=1;
int prod=1;
while(i<=n){
prod=prod*i;
i++;
}

return prod;
}
}

class fact_main {

public static void main(String [] args) throws Exception{

fact fobj=new fact();
DataInputStream in=new DataInputStream(System.in);
int n=Integer.parseInt(in.readLine());
System.out.println("The factorial is:"+fobj.f(n));

}

}