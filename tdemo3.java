class hi implements Runnable{
public void run() {
for(int i=1;i<=5;i++){
System.out.println("Hi");
try{
Thread.sleep(500);
}catch(Exception e){}
}

}//show
}//hi

class hello implements Runnable{
public void run() {
for(int i=1;i<=5;i++){
System.out.println("Hello");
try{
Thread.sleep(500);
}catch(Exception e){}
}

}//show
}//hi


class tdemo3{

public static void main(String [] args) throws Exception{

Runnable obj1=new hi();
Runnable obj2=new hello();
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);
t1.start();
t2.start();


}



}