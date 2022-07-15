import java.util.*;
import java.io.*;
import java.util.Comparator;
class collection_set_add{
public static void main(String [] args) throws Exception{

Set<Integer> s1=new HashSet<Integer>();
s1.add(1);
s1.add(20);
s1.add(5);
s1.add(1);
s1.add(5);
s1.add(5);

System.out.println(s1);
System.out.println("***iterating the list with iterator***");
Iterator it=s1.iterator();
while (it.hasNext()){
System.out.println(it.next());
}
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the index of the item to be removed");
int x=Integer.parseInt(in.readLine());
System.out.println("original s1"+s1);
s1.remove(x);
System.out.println("s1 after removal"+s1);


}


}
}