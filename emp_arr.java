import java.io.*;
class emp_arr{
int empid;
String empname;
String designation;

emp_arr(int eid,String ename, String d){
this.empid=eid;
this.empname=ename;
this.designation=d;

}

public void disp(){
System.out.println("Empid:"+this.empid);
System.out.println("Empname:"+this.empname);
System.out.println("designation:"+this.designation);

}
public static void main(String [] args) throws Exception{

emp_arr [] e= new emp_arr[3];
for(int i=0;i<=e.length-1;i++){

DataInputStream in=new DataInputStream(System.in);
int eid=Integer.parseInt(in.readLine());
String name=in.readLine();
String designation=in.readLine();

e[i]=new emp_arr(eid,name,designation);

}//for

for(emp_arr i:e){
i.disp();
}
}

}