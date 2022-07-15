class person_main{

public static class person
{
static String name;
static Integer age;
public void disp(){
System.out.println("This is an instance display method");
}
public static void display(){

age=20;
name="Soumen";
System.out.println("name="+name+" age="+age);

}
}
public static void main(String [] args){
//accessing class method
person.display();
person p=new person();
p.disp();
}
}
