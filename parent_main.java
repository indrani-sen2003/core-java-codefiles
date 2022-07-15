interface interface_father{

String name="Suresh";
public void dispname();
}

interface interface_mother{

String  name="Manju";

public void dispname();


}
class parent_main implements interface_father,interface_mother{

public void dispname(){
System.out.println("fathers name is "+ interface_father.name);
System.out.println("mothers name is "+ interface_mother.name);
}

public static void main(String [] args){
interface_father p=new parent_main();
interface_mother m=(interface_mother) p;
interface_father f=(interface_father) p;
System.out.println(m.name);
System.out.println(f.name);

//p.dispname();

}
}