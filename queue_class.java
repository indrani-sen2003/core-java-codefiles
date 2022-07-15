import java.util.*;
import java.io.*;

class queue_class{

public void enqueue(Queue<String> q, String item){
q.add(item);

}

public String dequeue(Queue<String> q,String item){

if(q.remove(item))
   return item;
else
   return "item not found";

}

public static void main(String [] args) throws Exception{
 
Queue<String> cars=new PriorityQueue<String>();
queue_class qobj=new queue_class();
System.out.println("Adding list of cars in queue");
qobj.enqueue(cars,"Mercedes");
qobj.enqueue(cars,"Toyota");
qobj.enqueue(cars,"Audi");
System.out.println(cars);
DataInputStream in=new DataInputStream(System.in);
String item=in.readLine();
System.out.println("The item deleted is :"+qobj.dequeue(cars,item));
System.out.println("Printing list of cars in queue with iterator");

Iterator it=cars.iterator();
while (it.hasNext()){
System.out.println("queue element:"+it.next());
}
System.out.println("Removing the head of the queue");
System.out.println("The head of queue is :"+cars.peek());
System.out.println("The item deleted is :"+cars.poll());
System.out.println("Printing list of cars :");
System.out.println(cars);

}

}