import java.util.*;
import java.io.*;
class shopping_list{

void addlist(ArrayList<String> ar,int n) throws Exception {
for (int i=1;i<=n;i++){
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the item to add:");
String item=in.readLine();
ar.add(item);
}
}
public static void main(String [] args) throws Exception{
ArrayList <String> l1=new ArrayList <String>();
System.out.println("Acepting the items from the user:");
shopping_list s1=new shopping_list();
s1.addlist(l1,10);
System.out.println("Displaying the items:");
Iterator it=l1.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}