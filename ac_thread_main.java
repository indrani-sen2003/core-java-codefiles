class account implements Runnable{
int bal;

account(int b){

bal=b;

}

public synchronized void run(){

int amt=700;
try{
for(int i=1;i<=4;i++){

this.bal=this.bal+amt;
System.out.println("amount added,bal="+bal);
Thread.sleep(1000);

}//for loop

}catch(Exception e){}

}//run
}//class

class  ac_thread_main {

public static void main(String [] args) throws Exception{

account r=new account(15000);


Thread t1=new Thread(r);
Thread t2=new Thread(r);
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println("Final balance:="+r.bal);
}
}