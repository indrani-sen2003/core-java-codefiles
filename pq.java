import java.util.*;
import java.util.PriorityQueue;
class pq{
Integer findMax(PriorityQueue<Integer> pq){
int max=0;
Iterator<Integer> it=pq.iterator();
while(it.hasNext()){
int x=it.next().intValue();
if(x>max)
 max=x;
}
System.out.println("max="+max);
return max;
}
public static void main(String [] args)
{
pq pq1=new pq();
PriorityQueue<Integer> wait_time_min=new PriorityQueue<Integer>();
System.out.println("Add the waiting times in queue");
wait_time_min.add(20);
wait_time_min.add(100);
wait_time_min.add(5);
wait_time_min.add(140);
System.out.println("Displaying the queue with lambda");
wait_time_min.forEach((x)->System.out.println(x));
System.out.println("Displaying the queue with iterator");
Iterator<Integer> it1=wait_time_min.iterator();
while(it1.hasNext()){
System.out.println(it1.next());
}
System.out.println("Removing the element from priority max queue");
int item=pq1.findMax(wait_time_min);
if (wait_time_min.remove(item))
  System.out.println("The max item is removed");
else
  System.out.println("The item not found");
System.out.println("Displaying the queue ");
System.out.println(wait_time_min);
}
}