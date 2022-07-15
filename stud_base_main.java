class stud
{
int roll=1;
int age=20;
String name="Sunami";
}
class phys_stud extends stud
{
float height=5.6f;
float weight=(float)60.4;
}

class stud_base_main{

public static void main(String [] args){

phys_stud p=new phys_stud();
System.out.println("roll:"+p.roll);
System.out.println("age:"+p.age);
System.out.println("name:"+p.name);
System.out.println("height:"+p.height);
System.out.println("weight:"+p.weight);
}
}
