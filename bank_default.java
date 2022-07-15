class bank_default{


String accname="";
String acno="";
int bal;
String type="";

public bank_default(){
accname="Sonu Agarwaal";
acno="Ac01";
bal=10000;
type="Savings";

}

public void disp(){
System.out.println("Acno="+acno);
System.out.println("Acc name="+accname);
System.out.println("balance="+bal);
System.out.println("type="+type);

}

public static void main(String [] args){
bank b=new bank();
b.disp();

}

}