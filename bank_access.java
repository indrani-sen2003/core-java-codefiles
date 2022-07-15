class bank_access{
public String accname="";
public String acno="";
public int bal;
public String type="";

public void disp(){
System.out.println("Acno="+acno);
System.out.println("Acc name="+accname);
System.out.println("balance="+bal);
System.out.println("type="+type);
}
public static void main(String [] args){
bank_access b=new bank_access();
b.accname="Rita Mumshi";
b.acno="Ac002";
b.type="Current";
b.bal=50000;
System.out.println("accname:"+b.accname+" acno:"+b.acno+" type:"+b.type+" balance="+b.bal);
}
}