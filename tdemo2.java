class hi extends Thread{
public void run() {
for(int i=1;i<=5;i++){
System.out.println("Hi");
try{
Thread.sleep(500);
}catch(Exception e){}
}

}//show
}//hi

class hello extends Thread{
public void run() {
for(int i=1;i<=5;i++){
System.out.println("Hello");
try{
Thread.sleep(500);
}catch(Exception e){}
}

}//show
}//hi


class tdemo2{

public static void main(String [] args) throws Exception{

hi obj1=new hi();
hello obj2=new hello();
obj1.start();
obj2.start();



}



}