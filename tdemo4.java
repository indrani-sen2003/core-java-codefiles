class tdemo4{
public static void main(String [] args) throws Exception{
Runnable obj1=()->{
for(int i=1;i<=5;i++){
System.out.println("Hi");
try{
Thread.sleep(500);
}catch(Exception e){}
}//for
};

Runnable obj2=()->{
for(int i=1;i<=5;i++){
System.out.println("Hello");
try{
Thread.sleep(500);
}catch(Exception e){}
}//for
};
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);
t1.start();
t2.start();
}
}