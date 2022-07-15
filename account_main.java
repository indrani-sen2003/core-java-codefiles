import java.io.*;
import java.util.*;
class account implements Runnable{

int balance;

account(int bal){
this.balance=bal;
}

public synchronized void run() {
for(int i=0;i<=3;i++){
try{
System.out.println(Thread.currentThread().getName());
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter amount to withdraw?");
int amt=Integer.parseInt(in.readLine());
if (amt>balance)
System.out.println("insufficient balance");
else
balance=balance-amt;
System.out.println("Current balance:"+balance);
}
catch(Exception e){}
}

}

}

class account_main{

public static void main(String [] args) throws Exception{

account a=new account(10000);

Thread t1=new Thread(a,"user A:");
Thread t2=new Thread(a,"User B:");

t1.start();

t2.start();
t1.join();
t2.join();
System.out.println("balance="+a.balance);

}


}