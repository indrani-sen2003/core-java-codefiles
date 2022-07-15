import java.io.*;
import java.util.*;
class tdemo_sync {
public static void main(String [] args) throws Exception{
class_sync c=new class_sync();
Thread t1=new Thread(()->{
try{
c.produce();


Thread.sleep(500);
}catch(Exception e){}
});
Thread t2=new Thread(()->{
try{
c.consume();

Thread.sleep(500);
}catch(Exception e){}
});
t1.start();
t2.start();
}
}
class class_sync
    {
        // Prints a string and waits for consume()
        public void produce()throws Exception
        {
            // synchronized block ensures only one thread
            // running at a time.
            synchronized(this)
            {
                System.out.println("producer thread running");
  
                // releases the lock on shared resource
                wait();
  
                // and waits till some other method invokes notify().
                System.out.println("Resumed");
            }
        }
  
        // Sleeps for some time and waits for a key press. After key
        // is pressed, it notifies produce().
        public  void consume()throws Exception
        {
            // this makes the produce thread to run first.
            Thread.sleep(1000);
            Scanner s = new Scanner(System.in);
  
            // synchronized block ensures only one thread
            // running at a time.
            synchronized(this)
            {
                System.out.println("Waiting for return key.");
                s.nextLine();
                System.out.println("Return key pressed");
  
                // notifies the produce thread that it
                // can wake up.
                notify();
  
                // Sleep
                Thread.sleep(2000);
            }
        }
    }
