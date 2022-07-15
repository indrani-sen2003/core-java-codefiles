class employee
{
int empid;
String name;
String addr;

employee(int id, String n,String add){

empid=id;
name=n;
addr=add;

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

teacher(int id,String n,String add,String qual, int xp, String sub){
super(id,n,add);
qualification=qual;
exp=xp;
subject=sub;

}
public void display(){
super.display();
System.out.println("qualification:"+qualification);
System.out.println("exp:"+exp);
System.out.println("subject:"+subject);
}
}



class multilevel_chaining{
public static void main(String [] args){
System.out.println("**employee**");
employee e1=new employee(101,"Kapil","Bangalore");
e1.display();
System.out.println("**teacher**");
teacher t1=new teacher(102,"Romi","Assam","MCA",15,"Computer science");
t1.display();

}
}


