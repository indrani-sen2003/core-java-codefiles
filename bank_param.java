class bank_param{
String accname="";
String acno="";
int bal;
String type="";
public bank_param(){
accname="Sonu Agarwaal";
acno="Ac01";
bal=10000;
type="Savings";
}

public bank_param(String aname,String ano,String t,int b){
accname=aname;
acno=ano;
bal=b;
type=t;
}


public void disp(){
System.out.println("Acno="+acno);
System.out.println("Acc name="+accname);
System.out.println("balance="+bal);
System.out.println("type="+type);
}
public static void main(String [] args){
bank_param b=new bank_param("Rita Mumshi","Ac002","Current",50000);
b.disp();
}
}