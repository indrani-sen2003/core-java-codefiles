class bank_prop{
private String acno="";
private int bal;
public String getAcno(){
return acno;
}

public void setAcno(String an){
this.acno=an;
}

public int getBal(){
return bal;
}
public void setBal(int b){
this.bal=b;
}
}

class bank_prop_main{

public static void main(String [] args){
bank_prop b=new bank_prop();
b.setAcno("ACC_001");
b.setBal(10000);
System.out.println("ac_no:"+b.getAcno()+" balance:"+b.getBal());
}
}