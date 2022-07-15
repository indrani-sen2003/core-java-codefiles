class tdemo_priority {
public static void main(String [] args) throws Exception{
Thread t1=new Thread(()->{
for(int i=1;i<=5;i++){
System.out.println("Hi");

try{
Thread.sleep(500);
}catch(Exception e){}
}//for
});
Thread t2=new Thread(()->{
for(int i=1;i<=5;i++){
System.out.println("Hello");

try{
Thread.sleep(500);
}catch(Exception e){}
}//for
});
t1.start();
t1.setPriority(Thread.MAX_PRIORITY);
t2.start();
t2.setPriority(Thread.MIN_PRIORITY);

System.out.println("t1 alive?"+t1.isAlive());
System.out.println("t1 priority:"+t1.getPriority());

t1.yield();
System.out.println("t1 alive?"+t1.isAlive());
System.out.println("t2 priority:"+t2.getPriority());


System.out.println("t1 state:"+t1.getState());

System.out.println("t1 state:"+t1.getState());

System.out.println("t1 state:"+t1.getState());

System.out.println("t1 state:"+t1.getState());
System.out.println("Good bye");
System.out.println("t1 state:"+t1.getState());
}
}