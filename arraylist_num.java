import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class arraylist_num{

public static void main(String [] args) throws Exception{
Integer[] num={10,20,30, 45,1,67,89,20,102};

List<Integer> numlist=new ArrayList<Integer>(Arrays.asList(num));

Iterator it=numlist.iterator();
while(it.hasNext()){
System.out.println(it.next());

}//while
DataInputStream in=new DataInputStream(System.in);
System.out.println("**Enter the index of the element to be retrieved?**");
int index=Integer.parseInt(in.readLine());
System.out.println("The item is :"+numlist.get(index));
System.out.println("**Enter element to be searched?**");
int item=Integer.parseInt(in.readLine());
if (numlist.contains(item))
    System.out.println("Item "+item +" found");
else
    System.out.println("Item "+item +" not found");
System.out.println("**Enter the index of the element to be updated?**");
index=Integer.parseInt(in.readLine());
System.out.println("**Enter the new value to be updated?**");
 item=Integer.parseInt(in.readLine());
numlist.set(index,item);
System.out.println("**The updated list:**");
System.out.println(numlist);
System.out.println("**Enter the item to be removed?**");
item=Integer.parseInt(in.readLine());
int del=numlist.remove(item);
System.out.println("**The updated list:**");
System.out.println(numlist);
System.out.println("**Print the item list using foreach**");
numlist.forEach((e)->System.out.println(e));
System.out.println("**Print the square of item list using foreach**");
numlist.forEach((e)->System.out.println(e*e));
System.out.println("**Sorting the array list in ascending order**");
numlist.sort(Comparator.naturalOrder());
System.out.println(numlist);
System.out.println("**Sorting the array list in descending order**");
numlist.sort(Comparator.reverseOrder());
System.out.println(numlist);
}
}