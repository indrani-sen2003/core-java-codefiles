class employee
{
int empid;
String name;
String addr;

employee(){

empid=1001;
name="rajashree";
addr="goregaon";

}

public void display(){
System.out.println("empid:"+empid);
System.out.println("name:"+name);
System.out.println("addr:"+addr);
}
}
class teacher extends employee
{
String qualification;
int exp;
String subject;

teacher(){
qualification="MBA";
exp=5;
subject="Computer science";

}
public void display(){
super.display();
System.out.println("qualification:"+qualification);
System.out.println("exp:"+exp);
System.out.println("subject:"+subject);
}
}
class full_time_teacher extends teacher
{
long salary;

full_time_teacher(){
salary=150000;

}
public void display(){
super.display();
System.out.println("qualification:"+qualification);
System.out.println("exp:"+exp);
System.out.println("subject:"+subject);
}

}
class part_time_teacher extends teacher
{
int clock_hrs;
int pay_clock_hrs;

part_time_teacher(){
clock_hrs=15;
pay_clock_hrs=2000;

}
public void display(){
super.display();
System.out.println("no of hours:"+clock_hrs);
System.out.println("pay_clock_hrs:"+pay_clock_hrs);

}

}

class multilevel_override{
public static void main(String [] args){
System.out.println("**part time teacher**");
part_time_teacher t1=new part_time_teacher();
t1.display();
System.out.println("**full time teacher**");
full_time_teacher f1=new full_time_teacher();
f1.display();

}
}


