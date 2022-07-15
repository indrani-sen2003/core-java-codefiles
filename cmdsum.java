//counting command line arguments
import java.io.*;
class cmdsum{

public static void main(String[] args){
int s=0;
System.out.println("The total number of arguments:"+args.length);
for (int i=0;i<=args.length-1;i++){
s=s+Integer.parseInt(args[i]);


}
System.out.println("The sum of arguments:"+s);



}

}
